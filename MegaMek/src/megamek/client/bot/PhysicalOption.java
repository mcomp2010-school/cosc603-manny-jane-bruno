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

import java.util.Vector;

import megamek.common.Entity;
import megamek.common.INarcPod;
import megamek.common.Mounted;
import megamek.common.Targetable;
import megamek.common.ToHitData;
import megamek.common.actions.AbstractAttackAction;
import megamek.common.actions.BrushOffAttackAction;
import megamek.common.actions.ClubAttackAction;
import megamek.common.actions.EntityAction;
import megamek.common.actions.KickAttackAction;
import megamek.common.actions.PunchAttackAction;
import megamek.common.actions.PushAttackAction;

// TODO: Auto-generated Javadoc
/**
 * TODO: add more options, pushing, kick both for quad mechs, etc.
 *
 * also, what
 * are the conditions for multiple physical attacks?
 */
public class PhysicalOption {
    
    /** The Constant NONE. */
    public final static int NONE = 0;
    
    /** The Constant PUNCH_LEFT. */
    public final static int PUNCH_LEFT = 1;
    
    /** The Constant PUNCH_RIGHT. */
    public final static int PUNCH_RIGHT = 2;
    
    /** The Constant PUNCH_BOTH. */
    public final static int PUNCH_BOTH = 3;
    
    /** The Constant KICK_LEFT. */
    public final static int KICK_LEFT = 4;
    
    /** The Constant KICK_RIGHT. */
    public final static int KICK_RIGHT = 5;
    
    /** The Constant USE_CLUB. */
    public final static int USE_CLUB = 6; // Includes sword, hatchet, mace,
                                            // and found clubs
    /** The Constant USE_CLAW. */
                                            public final static int USE_CLAW = 7; // Level 3 rules, not incorporated
                                            // yet
    /** The Constant PUSH_ATTACK. */
                                            public final static int PUSH_ATTACK = 8;
    
    /** The Constant TRIP_ATTACK. */
    public final static int TRIP_ATTACK = 9; // Level 3 rules, not
                                                // incorporated yet
    /** The Constant BRUSH_LEFT. */
                                                public final static int BRUSH_LEFT = 10;
    
    /** The Constant BRUSH_RIGHT. */
    public final static int BRUSH_RIGHT = 11;
    
    /** The Constant BRUSH_BOTH. */
    public final static int BRUSH_BOTH = 12;
    
    /** The Constant THRASH_INF. */
    public final static int THRASH_INF = 13;

    /** The attacker. */
    Entity attacker;
    
    /** The target. */
    Entity target;
    
    /** The i_target. */
    INarcPod i_target;
    
    /** The expected dmg. */
    double expectedDmg;
    
    /** The type. */
    int type;
    
    /** The club. */
    Mounted club;

    /**
     * Instantiates a new physical option.
     *
     * @param attacker the attacker
     */
    public PhysicalOption(Entity attacker) {
        this.attacker = attacker;
        this.type = NONE;
    }

    /**
     * Instantiates a new physical option.
     *
     * @param attacker the attacker
     * @param target the target
     * @param dmg the dmg
     * @param type the type
     * @param club the club
     */
    public PhysicalOption(Entity attacker, Targetable target, double dmg,
            int type, Mounted club) {
        this.attacker = attacker;
        if (target instanceof Entity) {
            this.target = (Entity) target;
        }
        if (target instanceof INarcPod) {
            this.i_target = (INarcPod) target;
        }
        this.expectedDmg = dmg;
        this.type = type;
        this.club = club;
    }

    /**
     * To action.
     *
     * @return the abstract attack action
     */
    public AbstractAttackAction toAction() {
        switch (type) {
            case PUNCH_LEFT:
                return new PunchAttackAction(attacker.getId(), target.getId(),
                        PunchAttackAction.LEFT);
            case PUNCH_RIGHT:
                return new PunchAttackAction(attacker.getId(), target.getId(),
                        PunchAttackAction.RIGHT);
            case PUNCH_BOTH:
                return new PunchAttackAction(attacker.getId(), target.getId(),
                        PunchAttackAction.BOTH);
            case KICK_LEFT:
                return new KickAttackAction(attacker.getId(), target.getId(),
                        KickAttackAction.LEFT);
            case KICK_RIGHT:
                return new KickAttackAction(attacker.getId(), target.getId(),
                        KickAttackAction.RIGHT);
            case USE_CLUB:
                if (club != null) {
                    return new ClubAttackAction(attacker.getId(), target
                            .getId(), club, ToHitData.HIT_NORMAL);
                }
                return null;
            case PUSH_ATTACK:
                return new PushAttackAction(attacker.getId(), target.getId(),
                        target.getPosition());
            case TRIP_ATTACK:
                return null; // Trip attack not implemented yet
            case BRUSH_LEFT:
                if (target == null) {
                    return new BrushOffAttackAction(attacker.getId(), i_target
                            .getTargetType(), i_target.getTargetId(),
                            BrushOffAttackAction.LEFT);
                }
                return new BrushOffAttackAction(attacker.getId(), target
                        .getTargetType(), target.getId(),
                        BrushOffAttackAction.LEFT);
            case BRUSH_RIGHT:
                if (target == null) {
                    return new BrushOffAttackAction(attacker.getId(), i_target
                            .getTargetType(), i_target.getTargetId(),
                            BrushOffAttackAction.RIGHT);
                }
                return new BrushOffAttackAction(attacker.getId(), target
                        .getTargetType(), target.getId(),
                        BrushOffAttackAction.RIGHT);
            case BRUSH_BOTH:
                if (target == null) {
                    return new BrushOffAttackAction(attacker.getId(), i_target
                            .getTargetType(), i_target.getTargetId(),
                            BrushOffAttackAction.BOTH);
                }
                return new BrushOffAttackAction(attacker.getId(), target
                        .getTargetType(), target.getId(),
                        BrushOffAttackAction.BOTH);
                /*
                 * case THRASH_INF : return new
                 * ThrashAttackAction(attacker.getId(), target.getId());
                 */
        }
        return null;
    }

    /**
     * Gets the vector.
     *
     * @return the vector
     */
    public Vector<EntityAction> getVector() {
        AbstractAttackAction aaa = toAction();
        Vector<EntityAction> v = new Vector<EntityAction>();
        if (aaa != null) {
            v.addElement(aaa);
        }
        return v;
    }
}
