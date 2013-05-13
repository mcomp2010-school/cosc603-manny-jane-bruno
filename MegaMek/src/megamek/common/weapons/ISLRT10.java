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
 * The Class ISLRT10.
 *
 * @author Sebastian Brocks
 */
public class ISLRT10 extends LRTWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 9191385220979030447L;

    /**
     * Instantiates a new iSLR t10.
     */
    public ISLRT10() {
        super();
        this.techLevel = TechConstants.T_IS_TW_NON_BOX;
        this.name = "LRT 10";
        this.setInternalName(this.name);
        this.addLookupName("IS LRT-10");
        this.addLookupName("ISLRTorpedo10");
        this.addLookupName("IS LRT 10");
        this.heat = 4;
        this.rackSize = 10;
        this.minimumRange = 6;
        this.waterShortRange = 7;
        this.waterMediumRange = 14;
        this.waterLongRange = 21;
        this.waterExtremeRange = 28;
        this.tonnage = 5.0f;
        this.criticals = 2;
        this.bv = 90;
        this.cost = 100000;
    }
}
