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
 * Created on Sep 24, 2004
 *
 */
package megamek.common.weapons;

import megamek.common.IGame;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

// TODO: Auto-generated Javadoc
/**
 * The Class BayWeapon.
 *
 * @author Jay Lawson
 * This is my attempt to get weapon bays treated as normal weapons
 * rather than the current hack in place
 */
public abstract class BayWeapon extends Weapon {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1787970217528405766L;

    /**
     * Instantiates a new bay weapon.
     */
    public BayWeapon() {
        super();
    }

    /* (non-Javadoc)
     * @see megamek.common.weapons.Weapon#fire(megamek.common.actions.WeaponAttackAction, megamek.common.IGame, megamek.server.Server)
     */
    public AttackHandler fire(WeaponAttackAction waa, IGame game, Server server) {
        // Just in case. Often necessary when/if multiple ammo weapons are
        // fired; if this line not present
        // then when one ammo slots run dry the rest silently don't fire.
        return super.fire(waa, game, server);
    }

    /*
     * (non-Javadoc)
     * 
     * @see megamek.common.weapons.Weapon#getCorrectHandler(megamek.common.ToHitData,
     *      megamek.common.actions.WeaponAttackAction, megamek.common.IGame)
     */
    protected AttackHandler getCorrectHandler(ToHitData toHit,
            WeaponAttackAction waa, IGame game, Server server) {
        return new BayWeaponHandler(toHit, waa, game, server);
    }
}
