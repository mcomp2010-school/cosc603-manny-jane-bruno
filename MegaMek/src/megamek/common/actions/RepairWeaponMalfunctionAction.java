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
 * The Class RepairWeaponMalfunctionAction.
 */
public class RepairWeaponMalfunctionAction extends AbstractEntityAction {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7947928598199505776L;
    
    /** The weapon id. */
    private int weaponId;

    /**
     * Instantiates a new repair weapon malfunction action.
     *
     * @param entityId the entity id
     * @param weaponId the weapon id
     */
    public RepairWeaponMalfunctionAction(int entityId, int weaponId) {
        super(entityId);
        this.weaponId = weaponId;
    }

    /**
     * Gets the weapon id.
     *
     * @return the weapon id
     */
    public int getWeaponId() {
        return weaponId;
    }
}
