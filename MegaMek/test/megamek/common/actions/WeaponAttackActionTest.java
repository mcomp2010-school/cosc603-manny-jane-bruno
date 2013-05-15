package megamek.common.actions;

import java.util.ArrayList;
import megamek.common.IGame;
import megamek.common.Aero;
import megamek.common.Targetable;
import megamek.common.ToHitData;
import megamek.common.Mounted;
import megamek.common.Game;
import megamek.common.Entity;
import megamek.common.EquipmentType;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WeaponAttackActionTest</code> contains tests for the class <code>{@link WeaponAttackAction}</code>.
 *
 * @generatedBy CodePro at 5/13/13 12:15 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class WeaponAttackActionTest {
	/**
	 * Run the WeaponAttackAction(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testWeaponAttackAction_1()
		throws Exception {
		int entityId = 1;
		int targetId = 1;
		int weaponId = 1;

		WeaponAttackAction result = new WeaponAttackAction(entityId, targetId, weaponId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getAimedLocation());
		assertEquals(0, result.getAimingMode());
		assertEquals(null, result.getCounterEquipment());
		assertEquals(-1, result.getOtherAttackInfo());
		assertEquals(false, result.isNemesisConfused());
		assertEquals(false, result.isSwarmingMissiles());
		assertEquals(0, result.getSwarmMissiles());
		assertEquals(1, result.getWeaponId());
		assertEquals(-1, result.getAmmoId());
		assertEquals(0, result.getTargetType());
		assertEquals(1, result.getTargetId());
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the WeaponAttackAction(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testWeaponAttackAction_2()
		throws Exception {
		int entityId = 1;
		int targetType = 1;
		int targetId = 1;
		int weaponId = 1;

		WeaponAttackAction result = new WeaponAttackAction(entityId, targetType, targetId, weaponId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getAimedLocation());
		assertEquals(0, result.getAimingMode());
		assertEquals(null, result.getCounterEquipment());
		assertEquals(-1, result.getOtherAttackInfo());
		assertEquals(false, result.isNemesisConfused());
		assertEquals(false, result.isSwarmingMissiles());
		assertEquals(0, result.getSwarmMissiles());
		assertEquals(1, result.getWeaponId());
		assertEquals(-1, result.getAmmoId());
		assertEquals(1, result.getTargetType());
		assertEquals(1, result.getTargetId());
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the void addCounterEquipment(Mounted) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testAddCounterEquipment_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);
		Mounted m = new Mounted(new Aero(), new EquipmentType());

		fixture.addCounterEquipment(m);

		// add additional test code here
	}

	/**
	 * Run the void addCounterEquipment(Mounted) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testAddCounterEquipment_2()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);
		Mounted m = new Mounted(new Aero(), new EquipmentType());

		fixture.addCounterEquipment(m);

		// add additional test code here
	}

	/**
	 * Run the int getAimedLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testGetAimedLocation_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);

		int result = fixture.getAimedLocation();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getAimingMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testGetAimingMode_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);

		int result = fixture.getAimingMode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getAmmoId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testGetAmmoId_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);

		int result = fixture.getAmmoId();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int[] getBombPayload() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testGetBombPayload_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);

		int[] result = fixture.getBombPayload();

		// add additional test code here
		assertNotNull(result);
		assertEquals(15, result.length);
		assertEquals(0, result[0]);
		assertEquals(0, result[1]);
		assertEquals(0, result[2]);
		assertEquals(0, result[3]);
		assertEquals(0, result[4]);
		assertEquals(0, result[5]);
		assertEquals(0, result[6]);
		assertEquals(0, result[7]);
		assertEquals(0, result[8]);
		assertEquals(0, result[9]);
		assertEquals(0, result[10]);
		assertEquals(0, result[11]);
		assertEquals(0, result[12]);
		assertEquals(0, result[13]);
		assertEquals(0, result[14]);
	}

	/**
	 * Run the ArrayList<Mounted> getCounterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testGetCounterEquipment_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);

		ArrayList<Mounted> result = fixture.getCounterEquipment();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getOtherAttackInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testGetOtherAttackInfo_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);

		int result = fixture.getOtherAttackInfo();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getSwarmMissiles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testGetSwarmMissiles_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);

		int result = fixture.getSwarmMissiles();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWeaponId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testGetWeaponId_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);

		int result = fixture.getWeaponId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean isNemesisConfused() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testIsNemesisConfused_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);

		boolean result = fixture.isNemesisConfused();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNemesisConfused() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testIsNemesisConfused_2()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);

		boolean result = fixture.isNemesisConfused();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isSwarmingMissiles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testIsSwarmingMissiles_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);

		boolean result = fixture.isSwarmingMissiles();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isSwarmingMissiles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testIsSwarmingMissiles_2()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);

		boolean result = fixture.isSwarmingMissiles();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setAimedLocation(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testSetAimedLocation_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);
		int aimedLocation = 1;

		fixture.setAimedLocation(aimedLocation);

		// add additional test code here
	}

	/**
	 * Run the void setAimingMode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testSetAimingMode_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);
		int aimMode = 1;

		fixture.setAimingMode(aimMode);

		// add additional test code here
	}

	/**
	 * Run the void setAmmoId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testSetAmmoId_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);
		int ammoId = 1;

		fixture.setAmmoId(ammoId);

		// add additional test code here
	}

	/**
	 * Run the void setBombPayload(int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testSetBombPayload_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);
		int[] load = new int[] {};

		fixture.setBombPayload(load);

		// add additional test code here
	}

	/**
	 * Run the void setNemesisConfused(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testSetNemesisConfused_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);
		boolean nemesisConfused = true;

		fixture.setNemesisConfused(nemesisConfused);

		// add additional test code here
	}

	/**
	 * Run the void setOldTargetId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testSetOldTargetId_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);
		int id = 1;

		fixture.setOldTargetId(id);

		// add additional test code here
	}

	/**
	 * Run the void setOtherAttackInfo(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testSetOtherAttackInfo_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);
		int newInfo = 1;

		fixture.setOtherAttackInfo(newInfo);

		// add additional test code here
	}

	/**
	 * Run the void setSwarmMissiles(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testSetSwarmMissiles_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);
		int swarmMissiles = 1;

		fixture.setSwarmMissiles(swarmMissiles);

		// add additional test code here
	}

	/**
	 * Run the void setSwarmingMissiles(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testSetSwarmingMissiles_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);
		boolean swarmingMissiles = true;

		fixture.setSwarmingMissiles(swarmingMissiles);

		// add additional test code here
	}

	/**
	 * Run the void setWeaponId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testSetWeaponId_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);
		int weaponId = 1;

		fixture.setWeaponId(weaponId);

		// add additional test code here
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testToHit_1()
		throws Exception {
		WeaponAttackAction fixture = new WeaponAttackAction(1, 1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.actions.WeaponAttackAction.toHit(WeaponAttackAction.java:288)
		//       at megamek.common.actions.WeaponAttackAction.toHit(WeaponAttackAction.java:230)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame,int,Targetable,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testToHit_2()
		throws Exception {
		IGame game = new Game();
		int attackerId = 1;
		Targetable target = new Aero();
		int weaponId = 1;

		ToHitData result = WeaponAttackAction.toHit(game, attackerId, target, weaponId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.actions.WeaponAttackAction.toHit(WeaponAttackAction.java:288)
		//       at megamek.common.actions.WeaponAttackAction.toHit(WeaponAttackAction.java:248)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame,int,Targetable,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Test
	public void testToHit_3()
		throws Exception {
		IGame game = new Game();
		int attackerId = 1;
		Targetable target = new Aero();
		int weaponId = 1;
		int aimingAt = 1;
		int aimingMode = 1;

		ToHitData result = WeaponAttackAction.toHit(game, attackerId, target, weaponId, aimingAt, aimingMode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.actions.WeaponAttackAction.toHit(WeaponAttackAction.java:288)
		//       at megamek.common.actions.WeaponAttackAction.toHit(WeaponAttackAction.java:265)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/13/13 12:15 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WeaponAttackActionTest.class);
	}
}