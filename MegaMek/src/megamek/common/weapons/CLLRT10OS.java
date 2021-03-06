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
 * The Class CLLRT10OS.
 *
 * @author Sebastian Brocks
 */
public class CLLRT10OS extends LRTWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4402946418858772353L;

    /**
     * Instantiates a new cLLR t10 os.
     */
    public CLLRT10OS() {
        super();
        this.techLevel = TechConstants.T_CLAN_TW;
        this.name = "LRT 10 (OS)";
        this.setInternalName("CLLRTorpedo10 (OS)");
        this.addLookupName("Clan OS LRT-10");
        this.addLookupName("Clan LRT 10 (OS)");
        this.heat = 4;
        this.rackSize = 10;
        this.minimumRange = WEAPON_NA;
        this.waterShortRange = 7;
        this.waterMediumRange = 14;
        this.waterLongRange = 21;
        this.waterExtremeRange = 28;
        this.tonnage = 2.5f;
        this.criticals = 1;
        this.bv = 22;
        this.flags |= F_ONESHOT;
        this.cost = 100000;
    }
}
