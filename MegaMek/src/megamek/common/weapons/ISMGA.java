/**
 * MegaMek - Copyright (C) 2004,2005,2006,2007 Ben Mazur (bmazur@sev.org)
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

import megamek.common.AmmoType;
import megamek.common.IGame;
import megamek.common.TechConstants;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

// TODO: Auto-generated Javadoc
/**
 * The Class ISMGA.
 *
 * @author Sebastian Brocks
 */
public class ISMGA extends AmmoWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5147934062852001336L;

    /**
     * Instantiates a new ismga.
     */
    public ISMGA() {
        super();
        this.techLevel = TechConstants.T_IS_TW_NON_BOX;
        this.name = "Machine Gun Array";
        this.addLookupName("IS Machine Gun Array");
        this.setInternalName("ISMGA");
        this.heat = 0;
        this.damage = 2;
        this.rackSize = 2;
        this.ammoType = AmmoType.T_MG;
        this.minimumRange = WEAPON_NA;
        this.shortRange = 1;
        this.mediumRange = 2;
        this.longRange = 3;
        this.extremeRange = 4;
        this.tonnage = 0.5f;
        this.criticals = 1;
        this.bv = 0; // we'll have to calculate this in calculateBV(),
        // because it depends on the number of MGs linked to
        // the MGA
        this.flags |= F_BALLISTIC | F_BURST_FIRE | F_MGA;
        this.cost = 5000;
        String[] modes = { "Linked", "Off" };
        this.setModes(modes);
        this.instantModeSwitch = false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see megamek.common.weapons.Weapon#getCorrectHandler(megamek.common.ToHitData,
     *      megamek.common.actions.WeaponAttackAction, megamek.common.Game,
     *      megamek.server.Server)
     */
    protected AttackHandler getCorrectHandler(ToHitData toHit,
            WeaponAttackAction waa, IGame game, Server server) {
        return new MGAWeaponHandler(toHit, waa, game, server);
    }

}
