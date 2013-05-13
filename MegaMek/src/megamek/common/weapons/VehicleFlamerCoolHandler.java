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
 * Created on Sep 23, 2004
 *
 */
package megamek.common.weapons;

import java.util.Vector;

import megamek.common.Building;
import megamek.common.Entity;
import megamek.common.IGame;
import megamek.common.Mech;
import megamek.common.Report;
import megamek.common.Tank;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

// TODO: Auto-generated Javadoc
/**
 * The Class VehicleFlamerCoolHandler.
 *
 * @author Sebastian Brocks
 */
public class VehicleFlamerCoolHandler extends AmmoWeaponHandler {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4856089237895318515L;

    /**
     * Instantiates a new vehicle flamer cool handler.
     *
     * @param toHit the to hit
     * @param waa the waa
     * @param g the g
     * @param s the s
     */
    public VehicleFlamerCoolHandler(ToHitData toHit, WeaponAttackAction waa,
            IGame g, Server s) {
        super(toHit, waa, g, s);
    }

    /* (non-Javadoc)
     * @see megamek.common.weapons.WeaponHandler#handleEntityDamage(megamek.common.Entity, java.util.Vector, megamek.common.Building, int, int, int, int)
     */
    protected void handleEntityDamage(Entity entityTarget,
            Vector<Report> vPhaseReport, Building bldg, int hits, int nCluster,
            int nDamPerHit, int bldgAbsorbs) {
        if (entityTarget.infernos.isStillBurning()
                || (target instanceof Tank && ((Tank) target).isOnFire())) {
            r = new Report(3550);
            r.subject = subjectId;
            r.addDesc(entityTarget);
            r.newlines = 0;
            r.indent(3);
            vPhaseReport.add(r);
        }
        entityTarget.infernos.clear();
        if (target instanceof Tank) {
            for (int i = 0; i < entityTarget.locations(); i++)
                ((Tank) target).extinguishAll();
        }
        // coolant also reduces heat of mechs
        if (target instanceof Mech) {
            int nDamage = nDamPerHit * hits;
            r = new Report(3400);
            r.subject = subjectId;
            r.indent(2);
            r.add(nDamage);
            r.choose(false);
            vPhaseReport.add(r);
            entityTarget.heatFromExternal -= nDamage;
            hits = 0;
        }
    }
}
