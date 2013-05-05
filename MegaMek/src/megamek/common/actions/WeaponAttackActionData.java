package megamek.common.actions;

import java.util.ArrayList;

import megamek.common.Mounted;

public class WeaponAttackActionData {
	private int weaponId;
	private int ammoId;
	private int aimedLocation;
	private int aimMode;
	private int otherAttackInfo;
	private boolean nemesisConfused;
	private boolean swarmingMissiles;
	private int oldTargetId;
	private int swarmMissiles;
	private int[] bombPayload;
	private ArrayList<Mounted> vCounterEquipment;

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

	public int getWeaponId() {
		return weaponId;
	}

	public void setWeaponId(int weaponId) {
		this.weaponId = weaponId;
	}

	public int getAmmoId() {
		return ammoId;
	}

	public void setAmmoId(int ammoId) {
		this.ammoId = ammoId;
	}

	public int getAimedLocation() {
		return aimedLocation;
	}

	public void setAimedLocation(int aimedLocation) {
		this.aimedLocation = aimedLocation;
	}

	public int getAimMode() {
		return aimMode;
	}

	public void setAimMode(int aimMode) {
		this.aimMode = aimMode;
	}

	public int getOtherAttackInfo() {
		return otherAttackInfo;
	}

	public void setOtherAttackInfo(int otherAttackInfo) {
		this.otherAttackInfo = otherAttackInfo;
	}

	public boolean isNemesisConfused() {
		return nemesisConfused;
	}

	public void setNemesisConfused(boolean nemesisConfused) {
		this.nemesisConfused = nemesisConfused;
	}

	public boolean isSwarmingMissiles() {
		return swarmingMissiles;
	}

	public void setSwarmingMissiles(boolean swarmingMissiles) {
		this.swarmingMissiles = swarmingMissiles;
	}

	public int getOldTargetId() {
		return oldTargetId;
	}

	public void setOldTargetId(int oldTargetId) {
		this.oldTargetId = oldTargetId;
	}

	public int getSwarmMissiles() {
		return swarmMissiles;
	}

	public void setSwarmMissiles(int swarmMissiles) {
		this.swarmMissiles = swarmMissiles;
	}

	public int[] getBombPayload() {
		return bombPayload;
	}

	public void setBombPayload(int[] bombPayload) {
		this.bombPayload = bombPayload;
	}

	public ArrayList<Mounted> getvCounterEquipment() {
		return vCounterEquipment;
	}

	public void setvCounterEquipment(ArrayList<Mounted> vCounterEquipment) {
		this.vCounterEquipment = vCounterEquipment;
	}
}