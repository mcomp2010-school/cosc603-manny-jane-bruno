/**
 * MegaMek - Copyright (C) 2000-2003 Ben Mazur (bmazur@sev.org)
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
 * Represents intention to change a fire mode of a weapon.
 */
public class FiringModeChangeAction extends AbstractEntityAction {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3706302227286581807L;
    
    /** The equipment id. */
    private int equipmentId;

    /**
     * Instantiates a new firing mode change action.
     *
     * @param entityId the entity id
     * @param equipmentId the equipment id
     */
    public FiringModeChangeAction(int entityId, int equipmentId) {
        super(entityId);
        this.equipmentId = equipmentId;
    }

    /**
     * Gets the equipment id.
     *
     * @return the equipment id
     */
    public int getEquipmentId() {
        return equipmentId;
    }

    /**
     * Sets the equipment id.
     *
     * @param equipmentId the new equipment id
     */
    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }
}
