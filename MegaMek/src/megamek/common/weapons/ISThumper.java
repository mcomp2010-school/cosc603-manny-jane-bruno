/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
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
 * Created on Oct 20, 2004
 *
 */
package megamek.common.weapons;

import megamek.common.AmmoType;
import megamek.common.TechConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class ISThumper.
 *
 * @author Sebastian Brocks
 */
public class ISThumper extends ArtilleryWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3256813053043672610L;

    /**
     * Instantiates a new checks if is thumper.
     */
    public ISThumper() {
        super();
        techLevel = TechConstants.T_IS_ADVANCED;
        name = "Thumper";
        setInternalName("ISThumper");
        addLookupName("ISThumperArtillery");
        addLookupName("IS Thumper");
        heat = 5;
        rackSize = 15;
        ammoType = AmmoType.T_THUMPER;
        shortRange = 1;
        mediumRange = 2;
        longRange = 21;
        extremeRange = 21; // No extreme range.
        tonnage = 15f;
        criticals = 15;
        bv = 43;
        cost = 187500;
    }

}
