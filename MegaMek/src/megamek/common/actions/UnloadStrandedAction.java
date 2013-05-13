/**
 * MegaMek - Copyright (C) 2004 Ben Mazur (bmazur@sev.org)
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

// TODO: Auto-generated Javadoc
/**
 * Concrete implementation of and entity action for unloading entities that are
 * stranded on immobile transports. Please note that the value,
 * <code>Enity.NONE</code> <em>is</em> a valid value for entityId.
 */
public class UnloadStrandedAction extends AbstractEntityAction {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8319076127334875298L;
    
    /** The player id. */
    private int playerId;

    /**
     * Instantiates a new unload stranded action.
     *
     * @param playerId the player id
     * @param entityId the entity id
     */
    public UnloadStrandedAction(int playerId, int entityId) {
        super(entityId);
        this.playerId = playerId;
    }

    /**
     * Gets the player id.
     *
     * @return the player id
     */
    public int getPlayerId() {
        return playerId;
    }
}
