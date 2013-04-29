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

import megamek.common.BattleArmor;
import megamek.common.Compute;
import megamek.common.IGame;
import megamek.common.Infantry;
import megamek.common.RangeType;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

/**
 * @author Sebastian Brocks
 */
public class BAAPGaussWeaponHandler extends WeaponHandler {

    /**
     *
     */
    private static final long serialVersionUID = -95308846220143952L;

    /**
     * @param t
     * @param w
     * @param g
     */
    public BAAPGaussWeaponHandler(ToHitData t, WeaponAttackAction w, IGame g,
            Server s) {
        super(t, w, g, s);
    }

    /*
     * (non-Javadoc)
     *
     * @see megamek.common.weapons.WeaponHandler#calcDamagePerHit()
     */
    @Override
    protected int calcDamagePerHit() {
        if ((target instanceof Infantry) && !(target instanceof BattleArmor)) {
            int toReturn = Compute.d6(2);
            if (bGlancing) {
                toReturn = (int) Math.floor(toReturn / 2.0);
            }
            if ( bDirect ) {
                toReturn += toHit.getMoS()/3;
            }
            if (game.getOptions().booleanOption("tacops_range") && (nRange > wtype.getRanges(weapon)[RangeType.RANGE_LONG])) {
                toReturn -= 1;
            }

            return toReturn;
        }
        return super.calcDamagePerHit();
    }

}
