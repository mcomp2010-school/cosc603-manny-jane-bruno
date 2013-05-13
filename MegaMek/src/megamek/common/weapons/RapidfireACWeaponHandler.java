/**
 * MegaMek - Copyright (C) 2004 Ben Mazur (bmazur@sev.org)
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
 * Created on Sep 29, 2004
 *
 */
package megamek.common.weapons;

import java.util.Vector;

import megamek.common.CriticalSlot;
import megamek.common.HitData;
import megamek.common.IGame;
import megamek.common.Mounted;
import megamek.common.Report;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;
import megamek.server.Server.DamageType;

// TODO: Auto-generated Javadoc
/**
 * The Class RapidfireACWeaponHandler.
 *
 * @author Andrew Hunter
 */
public class RapidfireACWeaponHandler extends UltraWeaponHandler {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1770392652874842106L;

    /**
     * Instantiates a new rapidfire ac weapon handler.
     *
     * @param t the t
     * @param w the w
     * @param g the g
     * @param s the s
     */
    public RapidfireACWeaponHandler(ToHitData t, WeaponAttackAction w, IGame g,
            Server s) {
        super(t, w, g, s);
    }

    /*
     * (non-Javadoc)
     * 
     * @see megamek.common.weapons.UltraWeaponHandler#doChecks(java.util.Vector)
     */
    protected boolean doChecks(Vector<Report> vPhaseReport) {
        if (roll <= 4 && howManyShots == 2) {
            if (roll > 2) {
                r = new Report(3161);
                r.subject = subjectId;
                r.newlines = 0;
                vPhaseReport.addElement(r);
                weapon.setJammed(true);
                weapon.setHit(true);
            } else {
                r = new Report(3162);
                r.subject = subjectId;
                weapon.setJammed(true);
                weapon.setHit(true);
                int wlocation = weapon.getLocation();
                weapon.setDestroyed(true);
                for (int i = 0; i < ae.getNumberOfCriticals(wlocation); i++) {
                    CriticalSlot slot1 = ae.getCritical(wlocation, i);
                    if (slot1 == null
                            || slot1.getType() != CriticalSlot.TYPE_SYSTEM) {
                        continue;
                    }
                    Mounted mounted = ae.getEquipment(slot1.getIndex());
                    if (mounted.equals(weapon)) {
                        ae.hitAllCriticals(wlocation, i);
                        break;
                    }
                }
                r.choose(false);
                vPhaseReport.addElement(r);
                vPhaseReport.addAll(server.damageEntity(ae, new HitData(
                        wlocation), wtype.getDamage(), false, DamageType.NONE,
                        true));
            }
            return false;
        }
        return false;
    }
    
    /* (non-Javadoc)
     * @see megamek.common.weapons.UltraWeaponHandler#usesClusterTable()
     */
    protected boolean usesClusterTable() {
        return true;
    }
    
    /* (non-Javadoc)
     * @see megamek.common.weapons.WeaponHandler#canDoDirectBlowDamage()
     */
    protected boolean canDoDirectBlowDamage(){
        return false;
    }


}
