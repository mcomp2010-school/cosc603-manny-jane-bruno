/*
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
 * The Class SpotAction.
 */
public class SpotAction extends AbstractEntityAction {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3629300334304478911L;
    
    /** The target id. */
    private int targetId;

    /**
     * Instantiates a new spot action.
     *
     * @param entityId the entity id
     * @param targetId the target id
     */
    public SpotAction(int entityId, int targetId) {
        super(entityId);
        this.targetId = targetId;
    }

    /**
     * Gets the target id.
     *
     * @return the target id
     */
    public int getTargetId() {
        return targetId;
    }
}
