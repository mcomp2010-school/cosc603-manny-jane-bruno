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
 * The Class ISSRM5.
 *
 * @author Sebastian Brocks
 */
public class ISSRM5 extends SRMWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2564548381701365334L;

    /**
     * Instantiates a new iSSR m5.
     */
    public ISSRM5() {
        super();
        this.techLevel = TechConstants.T_IS_TW_NON_BOX;
        this.name = "SRM 5";
        this.setInternalName(this.name);
        this.addLookupName("IS SRM-5");
        this.addLookupName("ISSRM5");
        this.addLookupName("IS SRM 5");
        this.rackSize = 5;
        this.shortRange = 3;
        this.mediumRange = 6;
        this.longRange = 9;
        this.extremeRange = 12;
        this.bv = 47;
        this.flags |= F_NO_FIRES;
    }
}
