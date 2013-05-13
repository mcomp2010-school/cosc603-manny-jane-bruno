/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 24, 2004
 *
 */
package megamek.common.weapons;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

import megamek.common.AmmoType;
import megamek.common.BattleArmor;
import megamek.common.Compute;
import megamek.common.Coords;
import megamek.common.Entity;
import megamek.common.EntitySelector;
import megamek.common.IGame;
import megamek.common.INarcPod;
import megamek.common.Infantry;
import megamek.common.LosEffects;
import megamek.common.Minefield;
import megamek.common.Mounted;
import megamek.common.Report;
import megamek.common.SpecialHexDisplay;
import megamek.common.TargetRoll;
import megamek.common.Targetable;
import megamek.common.ToHitData;
import megamek.common.VTOL;
import megamek.common.actions.ArtilleryAttackAction;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

// TODO: Auto-generated Javadoc
/**
 * The Class ArtilleryWeaponIndirectFireHandler.
 *
 * @author Sebastian Brocks
 */
public class ArtilleryWeaponIndirectFireHandler extends AmmoWeaponHandler {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1277649123562229298L;
    
    /** The handled ammo and report. */
    boolean handledAmmoAndReport = false;

    /**
     * This consructor may only be used for deserialization.
     */
    protected ArtilleryWeaponIndirectFireHandler() {
        super();
    }

    /**
     * Instantiates a new artillery weapon indirect fire handler.
     *
     * @param toHitData the to hit data
     * @param weaponAttackAction the weapon attack action
     * @param game the game
     * @param server the server
     */
    public ArtilleryWeaponIndirectFireHandler(final ToHitData toHitData,
            final WeaponAttackAction weaponAttackAction, final IGame game, final Server server) {
        super(toHitData, weaponAttackAction, game, server);
    }

    /*
     * (non-Javadoc)
     *
     * @see megamek.common.weapons.AttackHandler#cares(int)
     */
    @Override
	public boolean cares(final IGame.Phase phase) {
        if ((phase == IGame.Phase.PHASE_OFFBOARD) || (phase == IGame.Phase.PHASE_TARGETING)) {
            return true;
        }
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see megamek.common.weapons.AttackHandler#handle(int, java.util.Vector)
     */
    @Override
	public boolean handle(final IGame.Phase phase, final Vector<Report> vPhaseReport) {
        if (!cares(phase)) {
            return true;
        }
        ArtilleryAttackAction aaa = (ArtilleryAttackAction) waa;
        if (phase == IGame.Phase.PHASE_TARGETING) {
            return phaseTargetingPhase(vPhaseReport, aaa);
        }
        if (aaa.turnsTilHit > 0) {
            aaa.turnsTilHit--;
            return true;
        }
        final Vector<Integer> spottersBefore = aaa.getSpotterIds();
        final Targetable target = aaa.getTarget(game);
        final Coords targetPos = target.getPosition();
        final int playerId = aaa.getPlayerId();
        boolean isFlak = target instanceof VTOL;
        Entity bestSpotter = null;
        Entity ae = game.getEntity(aaa.getEntityId());
        if (ae == null) {
            ae = game.getOutOfGameEntity(aaa.getEntityId());
        }
        //TODO: Fix null pointer exception
        if(ae == null) {
            System.err.println("Artillery Entity is null!");
            return true;
        }
        Mounted ammo = ae.getEquipment(aaa.getAmmoId());
        final AmmoType atype = ammo == null ? null : (AmmoType) ammo.getType();
        // Are there any valid spotters?
        if ((null != spottersBefore) && !isFlak) {
            bestSpotter = fetchPossibleSpotters(spottersBefore, target,
					playerId, bestSpotter);

        } // End have-valid-spotters

        // If at least one valid spotter, then get the benefits thereof.
        if (null != bestSpotter) {
            int mod = (bestSpotter.crew.getGunnery() - 4) / 2;
            toHit.addModifier(mod, "Spotting modifier");
        }

        // Is the attacker still alive and we're not shooting FLAK?
        // then adjust the target
        Entity artyAttacker = aaa.getEntity(game);
        if ((null != artyAttacker) && !isFlak) {

            adjustTarget(aaa, targetPos, bestSpotter, artyAttacker);

        } // End artyAttacker-alive

        // Report weapon attack and its to-hit value.
        if(!reportWeaponAttackAndToHitValue(vPhaseReport, target))
        {
        	return false;
        }        

        // dice have been rolled, thanks
        setArtilleryText(vPhaseReport, aaa, targetPos, isFlak);

        // do we hit?
        bMissed = roll < toHit.getValue();
        // Set Margin of Success/Failure.
        toHit.setMoS(roll-Math.max(2,toHit.getValue()));

        // Do this stuff first, because some weapon's miss report reference the
        // amount of shots fired and stuff.
        if (!handledAmmoAndReport) {
            addHeat();
        }
        Coords coords = target.getPosition();
        if (!bMissed) {
            directHit(vPhaseReport, targetPos, isFlak, coords);

        } else {
            // direct fire artillery only scatters by one d6
            // we do this here to avoid duplicating handle()
            // in the ArtilleryWeaponDirectFireHandler
            if (phase == IGame.Phase.PHASE_FIRING) {
                coords = Compute.scatterDirectArty(coords);
            } else {
                coords = Compute.scatter(coords, Math.abs(toHit.getMoS()));
            }
            
            
            if(!missBehavior(vPhaseReport, isFlak, coords))
            {
            	return !bMissed;
            }
            else
            	return bMissed;
        }

        if(!checkAmmoType(vPhaseReport, ae, atype, artyAttacker, coords))
        return false;
        
        int altitude = 0;
        if (isFlak) {
            altitude = ((VTOL) target).getElevation();
        }

        //check to see if this is a mine clearing attack
        //According to the RAW you have to hit the right hex to hit even if the scatter hex has minefields
        boolean mineClear = target.getTargetType() == Targetable.TYPE_MINEFIELD_CLEAR;
        mineClear(vPhaseReport, isFlak, ae, coords, mineClear);

        server.artilleryDamageArea(coords, artyAttacker.getPosition(), atype,
                subjectId, artyAttacker, isFlak, altitude, mineClear, vPhaseReport);

        //artillery may unintentially clear minefields, but only if it wasn't trying to
        accidentalMineFieldClear(vPhaseReport, artyAttacker, coords, mineClear);

        return false;
    }

	/**
	 * Accidental mine field clear.
	 *
	 * @param vPhaseReport the v phase report
	 * @param artyAttacker the arty attacker
	 * @param coords the coords
	 * @param mineClear the mine clear
	 */
	private void accidentalMineFieldClear(final Vector<Report> vPhaseReport,
			Entity artyAttacker, Coords coords, boolean mineClear) {
		if(!mineClear && game.containsMinefield(coords)) {
            Enumeration<Minefield> minefields = game.getMinefields(coords).elements();
            ArrayList<Minefield> mfRemoved = new ArrayList<Minefield>();
            while (minefields.hasMoreElements()) {
                Minefield mf = minefields.nextElement();
                if(server.clearMinefield(mf, artyAttacker, 10, vPhaseReport)) {
                    mfRemoved.add(mf);
                }
            }
            //we have to do it this way to avoid a concurrent error problem
            for(Minefield mf : mfRemoved) {
                server.removeMinefield(mf);
            }
        }
	}

	/**
	 * Mine clear.
	 *
	 * @param vPhaseReport the v phase report
	 * @param isFlak the is flak
	 * @param ae the ae
	 * @param coords the coords
	 * @param mineClear the mine clear
	 */
	private void mineClear(final Vector<Report> vPhaseReport, boolean isFlak,
			Entity ae, Coords coords, boolean mineClear) {
		if (mineClear && game.containsMinefield(coords)
                && !isFlak && !bMissed) {
            r = new Report(3255);
            r.indent(1);
            r.subject = subjectId;
            vPhaseReport.addElement(r);

            Enumeration<Minefield> minefields = game.getMinefields(coords).elements();
            ArrayList<Minefield> mfRemoved = new ArrayList<Minefield>();
            while (minefields.hasMoreElements()) {
                Minefield mf = minefields.nextElement();
                if(server.clearMinefield(mf, ae, Minefield.CLEAR_NUMBER_WEAPON, vPhaseReport)) {
                    mfRemoved.add(mf);
                }
            }
            //we have to do it this way to avoid a concurrent error problem
            for(Minefield mf : mfRemoved) {
                server.removeMinefield(mf);
            }
        }
	}

	/**
	 * Check ammo type.
	 *
	 * @param vPhaseReport the v phase report
	 * @param ae the ae
	 * @param atype the atype
	 * @param artyAttacker the arty attacker
	 * @param coords the coords
	 * @return true, if successful
	 */
	private boolean checkAmmoType(final Vector<Report> vPhaseReport, Entity ae,
			final AmmoType atype, Entity artyAttacker, Coords coords) {
		if (atype.getMunitionType() == AmmoType.M_FLARE) {
            int radius;
            if (atype.getAmmoType() == AmmoType.T_ARROW_IV) {
                radius = 4;
            } else if (atype.getAmmoType() == AmmoType.T_LONG_TOM) {
                radius = 3;
            } else if (atype.getAmmoType() == AmmoType.T_SNIPER) {
                radius = 2;
            } else {
                radius = 1;
            }
            server.deliverArtilleryFlare(coords, radius);
            return false;
        }
        if (atype.getMunitionType() == AmmoType.M_DAVY_CROCKETT_M) {
            // The appropriate term here is "Bwahahahahaha..."
            server.doNuclearExplosion(coords, 1, vPhaseReport);
            return false;
        }
        if (atype.getMunitionType() == AmmoType.M_FASCAM) {
            server.deliverFASCAMMinefield(coords, ae.getOwner().getId(), atype.getRackSize(), ae.getId());
            return false;
        }
        if (atype.getMunitionType() == AmmoType.M_INFERNO_IV) {
            server.deliverArtilleryInferno(coords, artyAttacker, subjectId, vPhaseReport);
            return false;
        }
        if (atype.getMunitionType() == AmmoType.M_VIBRABOMB_IV) {
            server.deliverThunderVibraMinefield(coords, ae.getOwner().getId(),
                    atype.getRackSize(), waa.getOtherAttackInfo(), ae.getId());
            return false;
        }
        if (atype.getMunitionType() == AmmoType.M_SMOKE) {
            server.deliverArtillerySmoke(coords, vPhaseReport);
            return false;
        }

        //if none of the conditions above are true, then return true by default
        return true;
	}

	/**
	 * Miss behavior.
	 *
	 * @param vPhaseReport the v phase report
	 * @param isFlak the is flak
	 * @param coords the coords
	 * @return true, if successful
	 */
	private boolean missBehavior(final Vector<Report> vPhaseReport,
			boolean isFlak, Coords coords) {
		if (game.getBoard().contains(coords)) {
		    // misses and scatters to another hex
		    if (!isFlak) {
		        r = new Report(3195);
		        game.getBoard().addSpecialHexDisplay(
		            coords,
		            new SpecialHexDisplay(
		                    SpecialHexDisplay.Type.ARTILLERY_HIT,
		                    game.getRoundCount(),
		                    "Artilery Scatered Here. Better text later."
		            )
		        );
		    } else {
		        r = new Report(3192);
		    }
		    r.subject = subjectId;
		    r.add(coords.getBoardNum());
		    vPhaseReport.addElement(r);
		    return bMissed;
		} else {
		    // misses and scatters off-board
		    if (isFlak) {
		        r = new Report(3193);
		    } else {
		        r = new Report(3200);
		    }
		    r.subject = subjectId;
		    vPhaseReport.addElement(r);
		    return !bMissed;
		}
	}

	/**
	 * Direct hit.
	 *
	 * @param vPhaseReport the v phase report
	 * @param targetPos the target pos
	 * @param isFlak the is flak
	 * @param coords the coords
	 */
	private void directHit(final Vector<Report> vPhaseReport,
			final Coords targetPos, boolean isFlak, Coords coords) {
		if (!isFlak) {
		    r = new Report(3190);
		} else {
		    r = new Report(3191);
		}
		r.subject = subjectId;
		r.add(coords.getBoardNum());
		vPhaseReport.addElement(r);

		game.getBoard().addSpecialHexDisplay(targetPos,
		        new SpecialHexDisplay(SpecialHexDisplay.Type.ARTILLERY_HIT,
		                game.getRoundCount(),
		                "Artilery Hit. Better text later."));
	}

	/**
	 * Sets the artillery text.
	 *
	 * @param vPhaseReport the v phase report
	 * @param aaa the aaa
	 * @param targetPos the target pos
	 * @param isFlak the is flak
	 */
	private void setArtilleryText(final Vector<Report> vPhaseReport,
			ArtilleryAttackAction aaa, final Coords targetPos, boolean isFlak) {
		r = new Report(3155);
        r.newlines = 0;
        r.subject = subjectId;
        r.add(roll);
        vPhaseReport.addElement(r);

        if (!isFlak) {
            game.getBoard().addSpecialHexDisplay(
                    targetPos,
                    new SpecialHexDisplay(SpecialHexDisplay.Type.ARTILLERY_TARGET,
                            game.getRoundCount(),
                            game.getPlayer(aaa.getPlayerId()).getName(),
                            "Artilery Target. Better text later.",
                            false
                    )
            );
        }
	}

	/**
	 * Report weapon attack and to hit value.
	 *
	 * @param vPhaseReport the v phase report
	 * @param target the target
	 * @return true, if successful
	 */
	private boolean reportWeaponAttackAndToHitValue(
			final Vector<Report> vPhaseReport, final Targetable target) {
		r = new Report(3120);
        r.indent();
        r.newlines = 0;
        r.subject = subjectId;
        if (wtype != null) {
            r.add(wtype.getName());
        } else {
            r.add("Error: From Nowhwere");
        }

        r.add(target.getDisplayName(), true);
        vPhaseReport.addElement(r);
        if (toHit.getValue() == TargetRoll.IMPOSSIBLE) {
            r = new Report(3135);
            r.subject = subjectId;
            r.add(toHit.getDesc());
            vPhaseReport.addElement(r);
            return false;
        } else if (toHit.getValue() == TargetRoll.AUTOMATIC_FAIL) {
            r = new Report(3140);
            r.newlines = 0;
            r.subject = subjectId;
            r.add(toHit.getDesc());
            vPhaseReport.addElement(r);
            return true;
        } else if (toHit.getValue() == TargetRoll.AUTOMATIC_SUCCESS) {
            r = new Report(3145);
            r.newlines = 0;
            r.subject = subjectId;
            r.add(toHit.getDesc());
            vPhaseReport.addElement(r);
            return true;
        } else {
            // roll to hit
            r = new Report(3150);
            r.newlines = 0;
            r.subject = subjectId;
            r.add(toHit.getValue());
            vPhaseReport.addElement(r);
            return true;
        }
	}

	/**
	 * Adjust target.
	 *
	 * @param aaa the aaa
	 * @param targetPos the target pos
	 * @param bestSpotter the best spotter
	 * @param artyAttacker the arty attacker
	 */
	private void adjustTarget(ArtilleryAttackAction aaa,
			final Coords targetPos, Entity bestSpotter, Entity artyAttacker) {
		// Get the arty weapon.
		Mounted weapon = artyAttacker.getEquipment(aaa.getWeaponId());

		// If the shot hit the target hex, then all subsequent
		// fire will hit the hex automatically.
		if (roll >= toHit.getValue()) {
		    artyAttacker.aTracker.setModifier(weapon,
		            TargetRoll.AUTOMATIC_SUCCESS, targetPos);

		    game.getBoard().addSpecialHexDisplay(targetPos,
		            new SpecialHexDisplay(
		                    SpecialHexDisplay.Type.ARTILLERY_AUTOHIT,
		                    game.getRoundCount(),
		                    game.getPlayer(aaa.getPlayerId()).getName(),
		                    "Artilery AutoHit. Better text later.",
		                    false
		            )
		     );
		}
		// If the shot missed, but was adjusted by a
		// spotter, future shots are more likely to hit.
		else if (null != bestSpotter) {
		    artyAttacker.aTracker.setModifier(weapon, artyAttacker.aTracker
		            .getModifier(weapon, targetPos) - 1, targetPos);

		    game.getBoard().addSpecialHexDisplay(targetPos,
		            new SpecialHexDisplay(
		                SpecialHexDisplay.Type.ARTILLERY_ADJUSTED,
		                game.getRoundCount(),
		                game.getPlayer(aaa.getPlayerId()).getName(),
		                "Artilery toHit Adjusted. Better text later.",
		                false
		            )
		    );
		}
	}

	/**
	 * Fetch possible spotters.
	 *
	 * @param spottersBefore the spotters before
	 * @param target the target
	 * @param playerId the player id
	 * @param bestSpotter the best spotter
	 * @return the entity
	 */
	private Entity fetchPossibleSpotters(final Vector<Integer> spottersBefore,
			final Targetable target, final int playerId, Entity bestSpotter) {
		// fetch possible spotters now
		Enumeration<Entity> spottersAfter = game
		        .getSelectedEntities(new EntitySelector() {
		            public int player = playerId;

		            public Targetable targ = target;

		            public boolean accept(final Entity entity) {
		                Integer id = new Integer(entity.getId());
		                if ((player == entity.getOwnerId())
		                        && spottersBefore.contains(id)
		                        && !(LosEffects.calculateLos(game, entity
		                                .getId(), targ)).isBlocked()
		                        && entity.isActive()
		                        && !entity.isINarcedWith(INarcPod.HAYWIRE)) {
		                    return true;
		                }
		                return false;
		            }
		        });

		// Out of any valid spotters, pick the best.
		while (spottersAfter.hasMoreElements()) {
		    Entity ent = spottersAfter.nextElement();
		    if ((bestSpotter == null)
		            || (ent.crew.getGunnery() < bestSpotter.crew
		                    .getGunnery())) {
		        bestSpotter = ent;
		    }
		}
		return bestSpotter;
	}

	/**
	 * Phase targeting phase.
	 *
	 * @param vPhaseReport the v phase report
	 * @param aaa the aaa
	 * @return true, if successful
	 */
	private boolean phaseTargetingPhase(final Vector<Report> vPhaseReport,
			ArtilleryAttackAction aaa) {
		if (!handledAmmoAndReport) {
		    addHeat();
		    // Report the firing itself
		    r = new Report(3121);
		    r.indent();
		    r.newlines = 0;
		    r.subject = subjectId;
		    r.add(wtype.getName());
		    r.add(aaa.turnsTilHit);
		    vPhaseReport.addElement(r);
		    Report.addNewline(vPhaseReport);
		    handledAmmoAndReport = true;

		    game.getBoard().addSpecialHexDisplay(
		            aaa.getTarget(game).getPosition(),
		            new SpecialHexDisplay(
		                    SpecialHexDisplay.Type.ARTILLERY_INCOMING,
		                    game.getRoundCount() + aaa.turnsTilHit,
		                    game.getPlayer(aaa.getPlayerId()).getName(),
		                    "Artilery Incoming. Better text later."));
		}
		// if this is the last targeting phase before we hit,
		// make it so the firing entity is announced in the
		// off-board attack phase that follows.
		if (aaa.turnsTilHit == 0) {
		    announcedEntityFiring = false;
		}
		return true;
	}

    /*
     * (non-Javadoc)
     *
     * @see megamek.common.weapons.WeaponHandler#calcDamagePerHit()
     */
    @Override
	protected final int calcDamagePerHit() {
        float toReturn = wtype.getDamage();
        // area effect damage is double
        if ((target instanceof Infantry) && !(target instanceof BattleArmor)) {
                toReturn /= 0.5;
        }

        if (bGlancing) {
            toReturn = (int) Math.floor(toReturn / 2.0);
        }

        //System.err.println("Attack is doing " + toReturn + " damage.");

        return (int) Math.ceil(toReturn);
    }
}
