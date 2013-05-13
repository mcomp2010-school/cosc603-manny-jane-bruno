/**
 * MegaMek - Copyright (C) 2000-2002 Ben Mazur (bmazur@sev.org)
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
 * The Class FlipArmsAction.
 */
public class FlipArmsAction extends AbstractEntityAction {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5330424034128054338L;
    
    /** The is flipped. */
    private boolean isFlipped;

    /**
     * Instantiates a new flip arms action.
     *
     * @param entityId the entity id
     * @param isFlipped the is flipped
     */
    public FlipArmsAction(int entityId, boolean isFlipped) {
        super(entityId);
        this.isFlipped = isFlipped;
    }

    /**
     * Gets the checks if is flipped.
     *
     * @return the checks if is flipped
     */
    public boolean getIsFlipped() {
        return isFlipped;
    }

    /**
     * Sets the checks if is flipped.
     *
     * @param isFlipped the new checks if is flipped
     */
    public void setIsFlipped(boolean isFlipped) {
        this.isFlipped = isFlipped;
    }
}
