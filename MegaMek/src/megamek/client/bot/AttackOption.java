/*
 * MegaMek -
 * Copyright (C) 2007 Ben Mazur (bmazur@sev.org)
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
package megamek.client.bot;

import java.util.Comparator;

import megamek.common.AmmoType;
import megamek.common.Compute;
import megamek.common.Mounted;
import megamek.common.ToHitData;
import megamek.common.WeaponType;

// TODO: Auto-generated Javadoc
/**
 * The Class AttackOption.
 */
public class AttackOption extends ToHitData {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8566472187475019360L;

    /**
     * The Class Sorter.
     */
    static class Sorter implements Comparator<AttackOption> {
        /** The primary. */
        private CEntity primary = null;

        /**
         * Instantiates a new sorter.
         *
         * @param primary_target the primary_target
         */
        public Sorter(final CEntity primary_target) {
            primary = primary_target;
        }

        /* (non-Javadoc)
         * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
         */
        public int compare(AttackOption a, AttackOption a1) {
            if (a.getTarget().getKey().intValue() == a1.getTarget().getKey().intValue()) {
                WeaponType w = (WeaponType) a.getWeapon().getType();
                WeaponType w1 = (WeaponType) a1.getWeapon().getType();
                if (w.getDamage() == WeaponType.DAMAGE_MISSILE) {
                    if (w1.getDamage() == WeaponType.DAMAGE_MISSILE) {
                        if (a.getExpected() > a1.getExpected()) {
                            return -1;
                        }
                        return 1;
                    }
                    return 1;
                } else if (w.getDamage() == WeaponType.DAMAGE_MISSILE) {
                    return -1;
                } else if (a.getExpected() > a1.getExpected()) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (a.getTarget().getKey().equals(primary.getKey())) {
                return -1;
            }
            return 1;
        }
    }

    /** The target. */
    private CEntity target;
    
    /** The value. */
    private double value;
    
    /** The weapon. */
    private Mounted weapon;
    
    /** The to hit. */
    private ToHitData toHit;
    
    /** The odds. */
    private double odds; // secondary odds
    
    /** The primary_odds. */
    private double primary_odds; // primary odds
    
    /** The heat. */
    private int heat;
    
    /** The expected. */
    private double expected; // damage adjusted by secondary to-hit odds
    
    /** The primary_expected. */
    private double primary_expected; // damage adjusted by primary to-hit odds
    
    /** The ammo left. */
    private int ammoLeft = -1; // -1 doesn't use ammo
    
    /** The use_mode. */
    private String use_mode = "None"; // The mode the weapon is set to for

    // this option

    // Add argument for the precise bin of ammo being used for this option
    // so it can be reloaded later
    /**
     * Instantiates a new attack option.
     *
     * @param target the target
     * @param weapon the weapon
     * @param value the value
     * @param toHit the to hit
     * @param sec_mod the sec_mod
     */
    public AttackOption(CEntity target, Mounted weapon, double value,
            ToHitData toHit, int sec_mod) {
        this.setTarget(target);
        this.setWeapon(weapon);
        this.setToHit(toHit);
        this.value = value;

        if (target != null && weapon != null) {
            if (weapon.getType().getModesCount() > 0) {
                use_mode = weapon.curMode().getName();
            }
            WeaponType w = (WeaponType) weapon.getType();

            // As a primary attack. Damage is already odds-adjusted.
            setPrimary_odds(Compute.oddsAbove(toHit.getValue()) / 100.0);
            setPrimary_expected(this.value);

            // As a secondary attack. Raw damage is extracted, then adjusted
            // for secondary to-hit odds. Since units with active Stealth armor
            // cannot be secondary targets, chances of hitting are 0.

            if (target.getEntity().isStealthActive()) {
                setOdds(0.0);
            } else {
                setOdds(sec_mod <= 12 ? (Compute.oddsAbove(toHit.getValue()
                        + sec_mod) / 100.0) : 0.0);
            }
            setHeat(w.getHeat());
            setExpected(this.value / getPrimary_odds());
            setExpected(getExpected() * getOdds());

            // Check for ammo; note that some conventional infantry and BA
            // weapons do NOT return AmmoType.T_NA

            final boolean isInfantryWeapon = w.hasFlag(WeaponType.F_INFANTRY);
            final boolean usesAmmo = (!isInfantryWeapon & w.getAmmoType() != AmmoType.T_NA);

            final Mounted ammo = usesAmmo ? weapon.getLinked() : null;
            if (usesAmmo && (ammo == null || ammo.getShotsLeft() == 0)) {
                this.value = 0.0; // should have already been caught...
                setPrimary_expected(0.0);
                setExpected(0.0);
            } else if (usesAmmo) {
                setAmmoLeft(ammo.getShotsLeft());
            }
        }
    }

	/**
	 * Gets the target.
	 *
	 * @return the target
	 */
	public CEntity getTarget() {
		return target;
	}

	/**
	 * Sets the target.
	 *
	 * @param target the new target
	 */
	public void setTarget(CEntity target) {
		this.target = target;
	}

	/**
	 * Gets the primary_expected.
	 *
	 * @return the primary_expected
	 */
	public double getPrimary_expected() {
		return primary_expected;
	}

	/**
	 * Sets the primary_expected.
	 *
	 * @param primary_expected the new primary_expected
	 */
	public void setPrimary_expected(double primary_expected) {
		this.primary_expected = primary_expected;
	}

	/**
	 * Gets the to hit.
	 *
	 * @return the to hit
	 */
	public ToHitData getToHit() {
		return toHit;
	}

	/**
	 * Sets the to hit.
	 *
	 * @param toHit the new to hit
	 */
	public void setToHit(ToHitData toHit) {
		this.toHit = toHit;
	}

	/**
	 * Gets the expected.
	 *
	 * @return the expected
	 */
	public double getExpected() {
		return expected;
	}

	/**
	 * Sets the expected.
	 *
	 * @param expected the new expected
	 */
	public void setExpected(double expected) {
		this.expected = expected;
	}

	/**
	 * Gets the heat.
	 *
	 * @return the heat
	 */
	public int getHeat() {
		return heat;
	}

	/**
	 * Sets the heat.
	 *
	 * @param heat the new heat
	 */
	public void setHeat(int heat) {
		this.heat = heat;
	}

	/**
	 * Gets the ammo left.
	 *
	 * @return the ammo left
	 */
	public int getAmmoLeft() {
		return ammoLeft;
	}

	/**
	 * Sets the ammo left.
	 *
	 * @param ammoLeft the new ammo left
	 */
	public void setAmmoLeft(int ammoLeft) {
		this.ammoLeft = ammoLeft;
	}

	/**
	 * Gets the primary_odds.
	 *
	 * @return the primary_odds
	 */
	public double getPrimary_odds() {
		return primary_odds;
	}

	/**
	 * Sets the primary_odds.
	 *
	 * @param primary_odds the new primary_odds
	 */
	public void setPrimary_odds(double primary_odds) {
		this.primary_odds = primary_odds;
	}

	/**
	 * Gets the weapon.
	 *
	 * @return the weapon
	 */
	public Mounted getWeapon() {
		return weapon;
	}

	/**
	 * Sets the weapon.
	 *
	 * @param weapon the new weapon
	 */
	public void setWeapon(Mounted weapon) {
		this.weapon = weapon;
	}

	/**
	 * Gets the odds.
	 *
	 * @return the odds
	 */
	public double getOdds() {
		return odds;
	}

	/**
	 * Sets the odds.
	 *
	 * @param odds the new odds
	 */
	public void setOdds(double odds) {
		this.odds = odds;
	}
}