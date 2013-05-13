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
 * The Interface AttackAction.
 */
public interface AttackAction extends EntityAction {
    
    /**
     * Gets the target type.
     *
     * @return the target type
     */
    public int getTargetType();

    /**
     * Gets the target id.
     *
     * @return the target id
     */
    public int getTargetId();

    /**
     * Sets the target type.
     *
     * @param nType the new target type
     */
    public void setTargetType(int nType);

    /**
     * Sets the target id.
     *
     * @param targetId the new target id
     */
    public void setTargetId(int targetId);
}
