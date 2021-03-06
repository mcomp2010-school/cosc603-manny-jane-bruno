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
 * The Class CLSRM4OS.
 *
 * @author Sebastian Brocks
 */
public class CLSRM4OS extends SRMWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6513977729364835643L;

    /**
     * Instantiates a new cLSR m4 os.
     */
    public CLSRM4OS() {
        super();
        this.techLevel = TechConstants.T_CLAN_TW;
        this.name = "SRM 4 (OS)";
        this.setInternalName("CLSRM4 (OS)");
        this.addLookupName("Clan OS SRM-4");
        this.addLookupName("Clan SRM 4 (OS)");
        this.heat = 3;
        this.rackSize = 4;
        this.shortRange = 3;
        this.mediumRange = 6;
        this.longRange = 9;
        this.extremeRange = 12;
        this.tonnage = 1.5f;
        this.criticals = 1;
        this.bv = 8;
        this.flags |= F_NO_FIRES | F_ONESHOT;
        this.cost = 60000;
        this.shortAV = 4;
        this.maxRange = RANGE_SHORT;
    }
}
