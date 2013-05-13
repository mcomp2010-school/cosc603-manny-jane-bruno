/*
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

package megamek.common.actions;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

import megamek.common.Compute;
import megamek.common.Coords;
import megamek.common.Entity;
import megamek.common.IGame;
import megamek.common.LosEffects;
import megamek.common.Report;
import megamek.common.Tank;
import megamek.common.Targetable;

// TODO: Auto-generated Javadoc
/**
 * Used for aiming a searchlight at a target.
 */
public class SearchlightAttackAction extends AbstractAttackAction {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6699459935811592434L;

    // default to attacking an entity
    /**
     * Instantiates a new searchlight attack action.
     *
     * @param entityId the entity id
     * @param targetId the target id
     */
    public SearchlightAttackAction(int entityId, int targetId) {
        super(entityId, targetId);
    }

    /**
     * Instantiates a new searchlight attack action.
     *
     * @param entityId the entity id
     * @param targetType the target type
     * @param targetId the target id
     */
    public SearchlightAttackAction(int entityId, int targetType, int targetId) {
        super(entityId, targetType, targetId);
    }

    /**
     * Checks if is possible.
     *
     * @param game the game
     * @return true, if is possible
     */
    public boolean isPossible(IGame game) {
        return SearchlightAttackAction.isPossible(game, getEntityId(), game
                .getTarget(getTargetType(), getTargetId()), this);
    }

    /**
     * Checks if is possible.
     *
     * @param game the game
     * @param attackerId the attacker id
     * @param target the target
     * @param exempt the exempt
     * @return true, if is possible
     */
    public static boolean isPossible(IGame game, int attackerId,
            Targetable target, SearchlightAttackAction exempt) {
        final Entity attacker = game.getEntity(attackerId);
        if (attacker == null || !attacker.isUsingSpotlight() || target == null)
            return false;
        if (attacker instanceof Tank && ((Tank)attacker).getStunnedTurns() > 0)
            return false;
        if (!Compute.isInArc(attacker.getPosition(), attacker
                .getSecondaryFacing(), target.getPosition(),
                Compute.ARC_FORWARD))
            return false;
        for (Enumeration<EntityAction> actions = game.getActions(); actions
                .hasMoreElements();) {
            EntityAction action = actions.nextElement();
            if (action instanceof SearchlightAttackAction) {
                SearchlightAttackAction act = (SearchlightAttackAction) action;
                if (act == exempt)
                    break; // 1st in list is OK
                if (act.getEntityId() == attackerId)
                    return false; // can only declare searchlight once!
            }
        }
        LosEffects los = LosEffects.calculateLos(game, attackerId, target);
        return los.canSee();
    }

    /**
     * illuminate an entity and all entities that are between us and the hex.
     *
     * @param game the game
     * @return the vector
     */
    public Vector<Report> resolveAction(IGame game) {
        Vector<Report> reports = new Vector<Report>();
        Report r;
        if (!isPossible(game)) {
            r = new Report(3445);
            r.subject = this.getEntityId();
            r.newlines = 1;
            reports.addElement(r);
            return reports;
        }
        final Entity attacker = getEntity(game);
        final Coords apos = attacker.getPosition();
        final Targetable target = getTarget(game);
        final Coords tpos = target.getPosition();

        if (attacker.usedSearchlight()) {
            r = new Report(3450);
            r.subject = this.getEntityId();
            r.add(attacker.getDisplayName());
            r.newlines = 1;
            reports.addElement(r);
            return reports;
        }
        attacker.setUsedSearchlight(true);

        ArrayList<Coords> in = Coords.intervening(apos, tpos); // nb includes
                                                                // attacker &
                                                                // target
        for (Coords c : in) {
            for (Enumeration<Entity> e = game.getEntities(c); e
                    .hasMoreElements();) {
                Entity en = e.nextElement();
                LosEffects los = LosEffects.calculateLos(game, getEntityId(),
                        en);
                if (los.canSee()) {
                    en.setIlluminated(true);
                    r = new Report(3455);
                    r.subject = this.getEntityId();
                    r.newlines = 1;
                    r.add(en.getDisplayName());
                    r.add(attacker.getDisplayName());
                    reports.addElement(r);
                }
            }
        }
        return reports;
    }

    /**
     * Will illuminate.
     *
     * @param game the game
     * @param who the who
     * @return true, if successful
     */
    public boolean willIlluminate(IGame game, Entity who) {
        if (!isPossible(game))
            return false;
        final Entity attacker = getEntity(game);
        final Coords apos = attacker.getPosition();
        final Targetable target = getTarget(game);
        final Coords tpos = target.getPosition();

        ArrayList<Coords> in = Coords.intervening(apos, tpos); // nb includes
                                                                // attacker &
                                                                // target
        for (Coords c : in) {
            for (Enumeration<Entity> e = game.getEntities(c); e
                    .hasMoreElements();) {
                Entity en = e.nextElement();
                LosEffects los = LosEffects.calculateLos(game, getEntityId(),
                        en);
                if (los.canSee() && en.equals(who))
                    return true;
            }
        }
        return false;
    }
}
