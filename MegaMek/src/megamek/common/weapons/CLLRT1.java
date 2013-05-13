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
 * The Class CLLRT1.
 *
 * @author Sebastian Brocks
 */
public class CLLRT1 extends LRTWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5857181748358882592L;

    /**
     * Instantiates a new cLLR t1.
     */
    public CLLRT1() {
        super();
        this.techLevel = TechConstants.T_CLAN_TW;
        this.name = "LRT 1";
        this.setInternalName("CLLRTorpedo1");
        this.heat = 0;
        this.rackSize = 1;
        this.minimumRange = WEAPON_NA;
        this.waterShortRange = 7;
        this.waterMediumRange = 14;
        this.waterLongRange = 21;
        this.waterExtremeRange = 28;
        this.tonnage = 0.2f;
        this.criticals = 0;
        this.bv = 17;
    }
}
