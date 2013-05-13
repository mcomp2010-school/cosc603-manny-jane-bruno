/**
 * MegaMek - Copyright (C) 2003 Ben Mazur (bmazur@sev.org)
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
import megamek.common.Minefield;

// TODO: Auto-generated Javadoc
/**
 * The Class ClearMinefieldAction.
 */
public class ClearMinefieldAction extends AbstractEntityAction {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4465058967763135772L;
    
    /** The mf. */
    private Minefield mf;

    /**
     * Instantiates a new clear minefield action.
     *
     * @param entityId the entity id
     * @param mf the mf
     */
    public ClearMinefieldAction(int entityId, Minefield mf) {
        super(entityId);
        this.mf = mf;
    }
    
    /**
     * Gets the minefield.
     *
     * @return the minefield
     */
    public Minefield getMinefield() {
        return mf;
    }
}
