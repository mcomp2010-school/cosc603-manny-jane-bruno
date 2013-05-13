package megamek.common.actions;

import java.util.ArrayList;

import megamek.common.Mounted;

// TODO: Auto-generated Javadoc
/**
 * The Class WeaponAttackActionData.
 */
public class WeaponAttackActionData {
	
	/** The weapon id. */
	private int weaponId;
	
	/** The ammo id. */
	private int ammoId;
	
	/** The aimed location. */
	private int aimedLocation;
	
	/** The aim mode. */
	private int aimMode;
	
	/** The other attack info. */
	private int otherAttackInfo;
	
	/** The nemesis confused. */
	private boolean nemesisConfused;
	
	/** The swarming missiles. */
	private boolean swarmingMissiles;
	
	/** The old target id. */
	private int oldTargetId;
	
	/** The swarm missiles. */
	private int swarmMissiles;
	
	/** The bomb payload. */
	private int[] bombPayload;
	
	/** The v counter equipment. */
	private ArrayList<Mounted> vCounterEquipment;

	/**
	 * Instantiates a new weapon attack action data.
	 *
	 * @param ammoId the ammo id
	 * @param aimedLocation the aimed location
	 * @param aimMode the aim mode
	 * @param otherAttackInfo the other attack info
	 * @param oldTargetId the old target id
	 * @param swarmMissiles the swarm missiles
	 * @param bombPayload the bomb payload
	 */
	public WeaponAttackActionData(int ammoId, int aimedLocation, int aimMode,
			int otherAttackInfo, int oldTargetId, int swarmMissiles,
			int[] bombPayload) {
		this.ammoId = ammoId;
		this.aimedLocation = aimedLocation;
		this.aimMode = aimMode;
		this.otherAttackInfo = otherAttackInfo;
		this.oldTargetId = oldTargetId;
		this.swarmMissiles = swarmMissiles;
		this.bombPayload = bombPayload;
	}

	/**
	 * Gets the weapon id.
	 *
	 * @return the weapon id
	 */
	public int getWeaponId() {
		return weaponId;
	}

	/**
	 * Sets the weapon id.
	 *
	 * @param weaponId the new weapon id
	 */
	public void setWeaponId(int weaponId) {
		this.weaponId = weaponId;
	}

	/**
	 * Gets the ammo id.
	 *
	 * @return the ammo id
	 */
	public int getAmmoId() {
		return ammoId;
	}

	/**
	 * Sets the ammo id.
	 *
	 * @param ammoId the new ammo id
	 */
	public void setAmmoId(int ammoId) {
		this.ammoId = ammoId;
	}

	/**
	 * Gets the aimed location.
	 *
	 * @return the aimed location
	 */
	public int getAimedLocation() {
		return aimedLocation;
	}

	/**
	 * Sets the aimed location.
	 *
	 * @param aimedLocation the new aimed location
	 */
	public void setAimedLocation(int aimedLocation) {
		this.aimedLocation = aimedLocation;
	}

	/**
	 * Gets the aim mode.
	 *
	 * @return the aim mode
	 */
	public int getAimMode() {
		return aimMode;
	}

	/**
	 * Sets the aim mode.
	 *
	 * @param aimMode the new aim mode
	 */
	public void setAimMode(int aimMode) {
		this.aimMode = aimMode;
	}

	/**
	 * Gets the other attack info.
	 *
	 * @return the other attack info
	 */
	public int getOtherAttackInfo() {
		return otherAttackInfo;
	}

	/**
	 * Sets the other attack info.
	 *
	 * @param otherAttackInfo the new other attack info
	 */
	public void setOtherAttackInfo(int otherAttackInfo) {
		this.otherAttackInfo = otherAttackInfo;
	}

	/**
	 * Checks if is nemesis confused.
	 *
	 * @return true, if is nemesis confused
	 */
	public boolean isNemesisConfused() {
		return nemesisConfused;
	}

	/**
	 * Sets the nemesis confused.
	 *
	 * @param nemesisConfused the new nemesis confused
	 */
	public void setNemesisConfused(boolean nemesisConfused) {
		this.nemesisConfused = nemesisConfused;
	}

	/**
	 * Checks if is swarming missiles.
	 *
	 * @return true, if is swarming missiles
	 */
	public boolean isSwarmingMissiles() {
		return swarmingMissiles;
	}

	/**
	 * Sets the swarming missiles.
	 *
	 * @param swarmingMissiles the new swarming missiles
	 */
	public void setSwarmingMissiles(boolean swarmingMissiles) {
		this.swarmingMissiles = swarmingMissiles;
	}

	/**
	 * Gets the old target id.
	 *
	 * @return the old target id
	 */
	public int getOldTargetId() {
		return oldTargetId;
	}

	/**
	 * Sets the old target id.
	 *
	 * @param oldTargetId the new old target id
	 */
	public void setOldTargetId(int oldTargetId) {
		this.oldTargetId = oldTargetId;
	}

	/**
	 * Gets the swarm missiles.
	 *
	 * @return the swarm missiles
	 */
	public int getSwarmMissiles() {
		return swarmMissiles;
	}

	/**
	 * Sets the swarm missiles.
	 *
	 * @param swarmMissiles the new swarm missiles
	 */
	public void setSwarmMissiles(int swarmMissiles) {
		this.swarmMissiles = swarmMissiles;
	}

	/**
	 * Gets the bomb payload.
	 *
	 * @return the bomb payload
	 */
	public int[] getBombPayload() {
		return bombPayload;
	}

	/**
	 * Sets the bomb payload.
	 *
	 * @param bombPayload the new bomb payload
	 */
	public void setBombPayload(int[] bombPayload) {
		this.bombPayload = bombPayload;
	}

	/**
	 * Gets the v counter equipment.
	 *
	 * @return the v counter equipment
	 */
	public ArrayList<Mounted> getvCounterEquipment() {
		return vCounterEquipment;
	}

	/**
	 * Sets the v counter equipment.
	 *
	 * @param vCounterEquipment the new v counter equipment
	 */
	public void setvCounterEquipment(ArrayList<Mounted> vCounterEquipment) {
		this.vCounterEquipment = vCounterEquipment;
	}
}