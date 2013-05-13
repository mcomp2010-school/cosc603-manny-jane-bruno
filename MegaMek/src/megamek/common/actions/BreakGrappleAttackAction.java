/*
 * MegaMek - Copyright (C) 2000,2001,2002,2003,2004 Ben Mazur (bmazur@sev.org)
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

package megamek.common.actions;

import megamek.common.Entity;
import megamek.common.IGame;
import megamek.common.Mech;
import megamek.common.Protomech;
import megamek.common.TargetRoll;
import megamek.common.Targetable;
import megamek.common.ToHitData;

// TODO: Auto-generated Javadoc
/**
 * The attacker grapples the target.
 */
public class BreakGrappleAttackAction extends PhysicalAttackAction {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5615694825997720537L;

    /**
     * Instantiates a new break grapple attack action.
     *
     * @param entityId the entity id
     * @param targetId the target id
     */
    public BreakGrappleAttackAction(int entityId, int targetId) {
        super(entityId, targetId);
    }

    /**
     * Instantiates a new break grapple attack action.
     *
     * @param entityId the entity id
     * @param targetType the target type
     * @param targetId the target id
     */
    public BreakGrappleAttackAction(int entityId, int targetType, int targetId) {
        super(entityId, targetType, targetId);
    }

    /**
     * Generates the to hit data for this action.
     *
     * @param game
     *            the game.
     * @return the to hit data object for this action.
     * @see #toHit(IGame, int, Targetable)
     */
    public ToHitData toHit(IGame game) {
        return toHit(game, getEntityId(), game.getTarget(getTargetType(), getTargetId()));
    }

    /**
     * To-hit number.
     *
     * @param game the game
     * @param attackerId the attacker id
     * @param target the target
     * @return the to hit data
     */
    public static ToHitData toHit(IGame game, int attackerId, Targetable target) {
        final Entity ae = game.getEntity(attackerId);
        if (ae == null) {
            return new ToHitData(TargetRoll.IMPOSSIBLE, "You can't attack from a null entity!");
        }

        if (!game.getOptions().booleanOption("tacops_grappling")) {
            return new ToHitData(TargetRoll.IMPOSSIBLE, "grappling attack not allowed");
        }

        String impossible = toHitIsImpossible(game, ae, target);
        if ((impossible != null) && !impossible.equals("Locked in Grapple")) {
            return new ToHitData(TargetRoll.IMPOSSIBLE, "impossible");
        }

        ToHitData toHit;

        // non-mechs can't grapple or be grappled
        if (!(ae instanceof Mech) && !(ae instanceof Protomech)) {
            return new ToHitData(TargetRoll.IMPOSSIBLE, "Only mechs and protomechs can be grappled");
        }

        if (ae.getGrappled() != target.getTargetId()) {
            return new ToHitData(TargetRoll.IMPOSSIBLE, "Not grappled");
        }

        // Set the base BTH
        int base = ae.getCrew().getPiloting();

        // Start the To-Hit
        toHit = new ToHitData(base, "base");

        PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

        if (ae.isGrappleAttacker()) {
            toHit.addModifier(TargetRoll.AUTOMATIC_SUCCESS, "original attacker");
            return toHit;
        }

        setCommonModifiers(toHit, game, ae, target);

        if (ae instanceof Mech) {
            // damaged or missing actuators
            if (!ae.hasWorkingSystem(Mech.ACTUATOR_SHOULDER, Mech.LOC_LARM)) {
                toHit.addModifier(2, "Left shoulder actuator destroyed");
            }
            if (!ae.hasWorkingSystem(Mech.ACTUATOR_UPPER_ARM, Mech.LOC_LARM)) {
                toHit.addModifier(2, "Left upper arm actuator destroyed");
            }
            if (!ae.hasWorkingSystem(Mech.ACTUATOR_LOWER_ARM, Mech.LOC_LARM)) {
                toHit.addModifier(2, "Left lower arm actuator destroyed");
            }
            if (!ae.hasWorkingSystem(Mech.ACTUATOR_HAND, Mech.LOC_LARM)) {
                toHit.addModifier(1, "Left hand actuator destroyed");
            }

            if (!ae.hasWorkingSystem(Mech.ACTUATOR_SHOULDER, Mech.LOC_RARM)) {
                toHit.addModifier(2, "Right shoulder actuator destroyed");
            }
            if (!ae.hasWorkingSystem(Mech.ACTUATOR_UPPER_ARM, Mech.LOC_RARM)) {
                toHit.addModifier(2, "Right upper arm actuator destroyed");
            }
            if (!ae.hasWorkingSystem(Mech.ACTUATOR_LOWER_ARM, Mech.LOC_RARM)) {
                toHit.addModifier(2, "Right lower arm actuator destroyed");
            }
            if (!ae.hasWorkingSystem(Mech.ACTUATOR_HAND, Mech.LOC_RARM)) {
                toHit.addModifier(1, "Right hand actuator destroyed");
            }
            if ( ae.hasFunctionalArmAES(Mech.LOC_RARM) && ae.hasFunctionalArmAES(Mech.LOC_LARM) ) {
                toHit.addModifier(-1,"AES modifer");
            }
        }
        Entity te = (Entity) target;
        // Weight class difference
        int wmod = te.getWeightClass() - ae.getWeightClass();

        if ((te instanceof Protomech) && !(ae instanceof Protomech)) {
            wmod = ae.getWeightClass() * -1;
        } else if ((ae instanceof Protomech) && !(te instanceof Protomech)) {
            wmod = te.getWeightClass();
        } else if ((te instanceof Protomech) && (ae instanceof Protomech)) {
            wmod = 0;
        }

        if (wmod != 0) {
            toHit.addModifier(wmod, "Weight class difference");
        }
        // done!
        return toHit;
    }

}
