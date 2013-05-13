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
/*
 * Created on Sep 23, 2004
 *
 */
package megamek.common.weapons;

import java.util.Vector;

import megamek.common.BattleArmor;
import megamek.common.Building;
import megamek.common.Entity;
import megamek.common.HitData;
import megamek.common.IGame;
import megamek.common.Mech;
import megamek.common.Report;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

// TODO: Auto-generated Javadoc
/**
 * The Class LegAttackHandler.
 *
 * @author Sebastian Brocks
 */
public class LegAttackHandler extends WeaponHandler {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4429993211361286138L;

    /**
     * Instantiates a new leg attack handler.
     *
     * @param toHit the to hit
     * @param waa the waa
     * @param g the g
     * @param s the s
     */
    public LegAttackHandler(ToHitData toHit, WeaponAttackAction waa, IGame g,
            Server s) {
        super(toHit, waa, g, s);
    }

    /*
     * (non-Javadoc)
     * 
     * @see megamek.common.weapons.WeaponHandler#calcHits(java.util.Vector)
     */
    protected int calcHits(Vector<Report> vPhaseReport) {
        return 1;
    }

    /* (non-Javadoc)
     * @see megamek.common.weapons.WeaponHandler#handleEntityDamage(megamek.common.Entity, java.util.Vector, megamek.common.Building, int, int, int, int)
     */
    protected void handleEntityDamage(Entity entityTarget,
            Vector<Report> vPhaseReport, Building bldg, int hits, int nCluster,
            int nDamPerHit, int bldgAbsorbs) {
        HitData hit = entityTarget.rollHitLocation(toHit.getHitTable(), toHit
                .getSideTable(), waa.getAimedLocation(), waa.getAimingMode());
        // If a leg attacks hit a leg that isn't
        // there, then hit the other leg.
        if (entityTarget.getInternal(hit) <= 0) {
            if (hit.getLocation() == Mech.LOC_RLEG) {
                hit = new HitData(Mech.LOC_LLEG);
            } else {
                hit = new HitData(Mech.LOC_RLEG);
            }
        }
        hit.setGeneralDamageType(generalDamageType);
        int damage = 4;
        if (ae instanceof BattleArmor)
            damage += ((BattleArmor) ae).getVibroClaws();
        // ASSUMPTION: buildings CAN'T absorb *this* damage.
        vPhaseReport.addAll(server.damageEntity(entityTarget, hit, damage,
                false, damageType, false, false, throughFront, underWater));
        Report.addNewline(vPhaseReport);
        // Do criticals.
        vPhaseReport.addAll(server.criticalEntity(entityTarget, hit
                .getLocation(), 0));
    }
}
