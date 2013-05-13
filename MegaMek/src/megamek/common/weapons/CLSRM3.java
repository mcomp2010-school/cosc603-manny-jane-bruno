/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
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
package megamek.common.weapons;

import megamek.common.TechConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class CLSRM3.
 *
 * @author Sebastian Brocks
 */
public class CLSRM3 extends SRMWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1661723137877595056L;

    /**
     * Instantiates a new cLSR m3.
     */
    public CLSRM3() {
        super();
        this.techLevel = TechConstants.T_CLAN_TW;
        this.name = "SRM 3";
        this.setInternalName("CLSRM3");
        this.addLookupName("Clan SRM-3");
        this.addLookupName("Clan SRM 3");
        this.rackSize = 3;
        this.shortRange = 3;
        this.mediumRange = 6;
        this.longRange = 9;
        this.extremeRange = 12;
        this.bv = 30;
        this.flags |= F_NO_FIRES;
        this.cost = 80000;
    }
}
