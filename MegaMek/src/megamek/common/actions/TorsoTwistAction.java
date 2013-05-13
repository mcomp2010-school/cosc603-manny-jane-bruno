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

// TODO: Auto-generated Javadoc
/**
 * The Class TorsoTwistAction.
 */
public class TorsoTwistAction extends AbstractEntityAction {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3382479723829018297L;
    
    /** The facing. */
    private int facing;

    /**
     * Instantiates a new torso twist action.
     *
     * @param entityId the entity id
     * @param facing the facing
     */
    public TorsoTwistAction(int entityId, int facing) {
        super(entityId);
        this.facing = facing;
    }

    /**
     * Gets the facing.
     *
     * @return the facing
     */
    public int getFacing() {
        return facing;
    }

    /**
     * Sets the facing.
     *
     * @param facing the new facing
     */
    public void setFacing(int facing) {
        this.facing = facing;
    }
}
