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
package megamek.common.weapons;

import megamek.common.IGame;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

// TODO: Auto-generated Javadoc
/**
 * The Class LRMSwarmIHandler.
 *
 * @author Sebastian Brocks
 */
public class LRMSwarmIHandler extends LRMSwarmHandler {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6522069260223528740L;
    
    /** The swarm missiles now left. */
    int swarmMissilesNowLeft = 0;

    /**
     * Instantiates a new lRM swarm i handler.
     *
     * @param t the t
     * @param w the w
     * @param g the g
     * @param s the s
     */
    public LRMSwarmIHandler(ToHitData t, WeaponAttackAction w, IGame g, Server s) {
        super(t, w, g, s);
        sSalvoType = " swarm-i missile(s) ";
    }
}
