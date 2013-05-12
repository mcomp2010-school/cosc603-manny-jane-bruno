package megamek.common.actions.Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import megamek.common.Entity;
import megamek.common.EquipmentType;
import megamek.common.Infantry;
import megamek.common.Mounted;
import megamek.common.actions.WeaponAttackAction;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class WeaponAttackActionTest {
	private  WeaponAttackAction myWeaponAttackAction;
	
	
	@Before
	public void setUp() throws Exception{
		myWeaponAttackAction = new WeaponAttackAction(1,1,1);
	}
	
	@After
	public void tearDown(){
		myWeaponAttackAction = null;
	}
	
	//testing that weapon Id can be obtained successfully
	@Test
	public void testGetWeaponIdSuccess() throws Exception{
		assertEquals(1, myWeaponAttackAction.getWeaponId());
	}
	
	//testing that target type can be obtained successfully
	@Test
	public void testGetTargetIdSuccess() throws Exception{
		assertEquals(1, myWeaponAttackAction.getTargetId());
	}
	
	//testing that entity Id can be obtained successfully
	@Test
	public void testGetEntityIdSuccess() throws Exception{
		assertEquals(1, myWeaponAttackAction.getEntityId());
	}	
	
	//testing that aimedLocation can be set and retrieved successfully
	@Test
	public void testGetSetAimedLocationSuccess() throws Exception{
		myWeaponAttackAction.setAimedLocation(35);
		assertEquals(35, myWeaponAttackAction.getAimedLocation());
	}
	
	//testing that aimingMode can be set and retrieved successfully
	@Test
	public void testGetSetAimingModeSuccess() throws Exception{
		myWeaponAttackAction.setAimingMode(66);
		assertEquals(66, myWeaponAttackAction.getAimingMode());
	}
	
	//testing that ammoId can be set and retrieved successfully
	@Test
	public void testGetSetAmmoId() throws Exception{
		myWeaponAttackAction.setAmmoId(98);
		assertEquals(98, myWeaponAttackAction.getAmmoId());
	}
	
	//testing that bombPayload can be set and retrieved successfully
	@Test
	public void testGetSetBombPayload() throws Exception{
		int[] payload = new int[]{1,2,3,4};
		myWeaponAttackAction.setBombPayload(payload);
		assertEquals(payload, myWeaponAttackAction.getBombPayload());
	}
	
	//testing that counterEquipment can be set and retrieved successfully
	@Test
	public void testGetSetCounterEquipment() throws Exception{
		Infantry infantry = new Infantry();
		EquipmentType type = new EquipmentType();
		ArrayList list = new ArrayList();
		Mounted mounted = new Mounted(infantry, type);
		list.add(mounted);
		
		myWeaponAttackAction.addCounterEquipment(mounted);
		assertEquals(list, myWeaponAttackAction.getCounterEquipment());
	}
	
	//testing that otherAttackInfo can be set and retrieved successfully
	@Test
	public void testGetSetOtherAttackInfo() throws Exception{
		myWeaponAttackAction.setOtherAttackInfo(77);
		assertEquals(77, myWeaponAttackAction.getOtherAttackInfo());
	}
	
	//testing that swarmMissiles can be set and retrieved successfully
	@Test
	public void testGetSetSwarmMissiles() throws Exception{
		myWeaponAttackAction.setSwarmMissiles(98);
		assertEquals(98, myWeaponAttackAction.getSwarmMissiles());
	}
	
	//testing that nemesisConfused can be set and retrieved successfully
	@Test
	public void testGetSetNemesisConfused() throws Exception{
		myWeaponAttackAction.setNemesisConfused(true);
		assertEquals(true, myWeaponAttackAction.isNemesisConfused());
	}
}
