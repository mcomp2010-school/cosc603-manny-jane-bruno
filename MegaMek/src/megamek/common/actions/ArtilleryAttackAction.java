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

package megamek.common.actions;

import java.io.Serializable;
import java.util.Vector;

import megamek.common.Compute;
import megamek.common.Coords;
import megamek.common.EquipmentType;
import megamek.common.IGame;
import megamek.common.WeaponType;

// TODO: Auto-generated Javadoc
/**
 * ArtilleryAttackAction Holds the data needed for an artillery attack in
 * flight.
 */
public class ArtilleryAttackAction extends WeaponAttackAction implements
        Serializable {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3893844894076028005L;
    
    /** The turns til hit. */
    public int turnsTilHit;
    
    /** The spotter ids. */
    private Vector<Integer> spotterIds; // IDs of possible spotters, won't know
                                        // until it lands.
    /** The player id. */
                                        protected int playerId;
    
    /** The firing coords. */
    private Coords firingCoords;

    /**
     * Instantiates a new artillery attack action.
     *
     * @param entityId the entity id
     * @param targetType the target type
     * @param targetId the target id
     * @param weaponId the weapon id
     * @param game the game
     */
    public ArtilleryAttackAction(int entityId, int targetType, int targetId,
            int weaponId, IGame game) {
        super(entityId, targetType, targetId, weaponId);
        this.playerId = game.getEntity(entityId).getOwnerId();
        this.firingCoords = game.getEntity(entityId).getPosition();
        int distance = Compute.effectiveDistance(game, getEntity(game),
                getTarget(game));
        // adjust distance for gravity
        distance = (int)Math.floor((double)distance/game.getPlanetaryConditions().getGravity());
        EquipmentType eType = game.getEntity(entityId).getEquipment(weaponId).getType();
        if (eType.hasFlag(WeaponType.F_CRUISE_MISSILE)) {
            turnsTilHit = 1 + (distance / 17 / 5);
        } else {
            if (distance <= 17)
                turnsTilHit = 0;
            else if (distance <= (8 * 17))
                turnsTilHit = 1;
            else if (distance <= (15 * 17))
                turnsTilHit = 2;
            else if (distance <= (21 * 17))
                turnsTilHit = 3;
            else if (distance <= (26 * 17))
                turnsTilHit = 4;
            else
                turnsTilHit = 5;
        }
    }

    /**
     * Gets the spotter ids.
     *
     * @return the spotter ids
     */
    public Vector<Integer> getSpotterIds() {
        return spotterIds;
    }

    /**
     * Gets the player id.
     *
     * @return the player id
     */
    public int getPlayerId() {
        return playerId;
    }

    /**
     * Sets the spotter ids.
     *
     * @param spotterIds the new spotter ids
     */
    public void setSpotterIds(Vector<Integer> spotterIds) {
        this.spotterIds = spotterIds;
    }

    /**
     * Sets the coords.
     *
     * @param coords the new coords
     */
    public void setCoords(Coords coords) {
        this.firingCoords = coords;
    }

    /**
     * Gets the coords.
     *
     * @return the coords
     */
    public Coords getCoords() {
        return this.firingCoords;
    }
}
