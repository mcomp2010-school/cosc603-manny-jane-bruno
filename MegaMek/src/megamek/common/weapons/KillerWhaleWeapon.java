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

import megamek.common.AmmoType;
import megamek.common.IGame;
import megamek.common.TechConstants;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

// TODO: Auto-generated Javadoc
/**
 * The Class KillerWhaleWeapon.
 *
 * @author Jay Lawson
 */
public class KillerWhaleWeapon extends CapitalMissileWeapon {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8756042527483383101L;

    /**
     * Instantiates a new killer whale weapon.
     */
    public KillerWhaleWeapon() {
        super();
        this.techLevel = TechConstants.T_IS_TW_NON_BOX;
        this.name = "Killer Whale";
        this.setInternalName(this.name);
        this.addLookupName("KillerWhale");
        this.heat = 20;
        this.damage = 4;
        this.ammoType = AmmoType.T_KILLER_WHALE;
        this.shortRange = 7;
        this.mediumRange = 14;
        this.longRange = 21;
        this.extremeRange = 28;
        this.tonnage = 150.0f;
        this.bv = 769;
        this.cost = 150000;
        this.shortAV = 4;
        this.medAV = 4;
        this.longAV = 4;
        this.extAV =4;
        this.maxRange = RANGE_EXT;
    }

    /*
     * (non-Javadoc)
     * 
     * @see megamek.common.weapons.Weapon#getCorrectHandler(megamek.common.ToHitData,
     *      megamek.common.actions.WeaponAttackAction, megamek.common.IGame)
     */
    protected AttackHandler getCorrectHandler(ToHitData toHit,
            WeaponAttackAction waa, IGame game, Server server) {
        AmmoType atype = (AmmoType) game.getEntity(waa.getEntityId()).getEquipment(waa.getWeaponId()).getLinked().getType();
        if (atype.hasFlag(AmmoType.F_NUCLEAR)) {
            return new SantaAnnaHandler(toHit, waa, game, server);
        }
        if (atype.hasFlag(AmmoType.F_TELE_MISSILE)) {
            return new TeleMissileHandler(toHit, waa, game, server);
        }
        return new KillerWhaleHandler(toHit, waa, game, server);
    }
}
