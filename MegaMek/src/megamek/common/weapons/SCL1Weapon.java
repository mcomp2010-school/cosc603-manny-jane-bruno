/* MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
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
 * Created on Sep 25, 2004
 *
 */
package megamek.common.weapons;

import megamek.common.TechConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class SCL1Weapon.
 *
 * @author Jay Lawson
 */
public class SCL1Weapon extends SubCapitalLaserWeapon {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8756042527483383101L;

    /**
     * Instantiates a new sC l1 weapon.
     */
    public SCL1Weapon() {
        super();
        this.techLevel = TechConstants.T_IS_ADVANCED;
        this.name = "Sub-Capital Laser 1";
        this.setInternalName(this.name);
        this.addLookupName("SCL1");
        this.heat = 24;
        this.damage = 1;
        this.shortRange = 11;
        this.mediumRange = 22;
        this.longRange = 33;
        this.extremeRange = 44;
        this.tonnage = 150.0f;
        this.bv = 237;
        this.cost = 220000;
        this.shortAV = 1;
        this.medAV = 1;
        this.longAV = 1;
        this.maxRange = RANGE_LONG;
    }
}
