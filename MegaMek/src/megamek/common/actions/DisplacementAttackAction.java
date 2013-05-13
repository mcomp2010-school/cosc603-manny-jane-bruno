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

/*
 * DisplacementAttackAction.java
 *
 * Created on May 23, 2002, 12:05 PM
 */

package megamek.common.actions;

import megamek.common.Coords;

// TODO: Auto-generated Javadoc
/**
 * The Class DisplacementAttackAction.
 *
 * @author Ben
 * @version
 */
public class DisplacementAttackAction extends AbstractAttackAction {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1713221946987876208L;
    
    /** The target pos. */
    private Coords targetPos;

    /**
     * Creates new DisplacementAttackAction.
     *
     * @param entityId the entity id
     * @param targetId the target id
     * @param targetPos the target pos
     */
    public DisplacementAttackAction(int entityId, int targetId, Coords targetPos) {
        super(entityId, targetId);
        this.targetPos = targetPos;
    }

    /**
     * Instantiates a new displacement attack action.
     *
     * @param entityId the entity id
     * @param targetType the target type
     * @param targetId the target id
     * @param targetPos the target pos
     */
    public DisplacementAttackAction(int entityId, int targetType, int targetId,
            Coords targetPos) {
        super(entityId, targetType, targetId);
        this.targetPos = targetPos;
    }

    /**
     * Gets the target pos.
     *
     * @return the target pos
     */
    public Coords getTargetPos() {
        return targetPos;
    }

    /**
     * Sets the target pos.
     *
     * @param targetPos the new target pos
     */
    public void setTargetPos(Coords targetPos) {
        this.targetPos = targetPos;
    }

}
