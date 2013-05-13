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
 * Created on May 10, 2004
 *
 */
package megamek.common.weapons;

import java.util.Vector;

import megamek.common.IGame;
import megamek.common.Report;
import megamek.common.actions.WeaponAttackAction;

// TODO: Auto-generated Javadoc
/**
 * The Interface AttackHandler.
 *
 * @author Andrew Hunter Describes a set of methods a class can use to represent
 * an attack from some weapon.
 */
public interface AttackHandler {

    // Does it care?
    /**
     * Cares.
     *
     * @param phase the phase
     * @return true, if successful
     */
    public boolean cares(IGame.Phase phase);

    // If it cares, call this. If it needs to remain in queue, returns true,
    // else false.
    /**
     * Handle.
     *
     * @param phase the phase
     * @param vPhaseReports the v phase reports
     * @return true, if successful
     */
    public boolean handle(IGame.Phase phase, Vector<Report> vPhaseReports);

    // Frankly, wish I could get rid of this, but I think certain things
    // occaisonly need to know the firer.
    /**
     * Gets the attacker id.
     *
     * @return the attacker id
     */
    public int getAttackerId();

    /**
     * Announced entity firing.
     *
     * @return true, if successful
     */
    public boolean announcedEntityFiring();

    /**
     * Sets the announced entity firing.
     *
     * @param announcedEntityFiring the new announced entity firing
     */
    public void setAnnouncedEntityFiring(boolean announcedEntityFiring);

    /**
     * Gets the waa.
     *
     * @return the waa
     */
    public WeaponAttackAction getWaa();

}
