package megamek.client.bot;

import org.junit.*;
import megamek.common.Aero;
import megamek.common.ToHitData;
import megamek.common.Mounted;
import megamek.common.TargetRoll;
import megamek.common.WeaponType;
import megamek.common.Entity;
import megamek.common.EquipmentType;
import static org.junit.Assert.*;

/**
 * The class <code>AttackOptionTest</code> contains tests for the class <code>{@link AttackOption}</code>.
 *
 * @generatedBy CodePro at 5/13/13 1:29 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class AttackOptionTest {
	/**
	 * Run the AttackOption(CEntity,Mounted,double,ToHitData,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testAttackOption_1()
		throws Exception {
		CEntity target = new CEntity(new Aero(), new TestBot("", "", 1));
		Mounted weapon = new Mounted(new Aero(), new WeaponType());
		double value = 1.0;
		ToHitData toHit = new ToHitData();
		int sec_mod = 13;

		AttackOption result = new AttackOption(target, weapon, value, toHit, sec_mod);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.client.bot.CEntity.characterize(CEntity.java:411)
		//       at megamek.client.bot.CEntity.reset(CEntity.java:376)
		//       at megamek.client.bot.CEntity.<init>(CEntity.java:336)
		assertNotNull(result);
	}

	/**
	 * Run the AttackOption(CEntity,Mounted,double,ToHitData,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testAttackOption_2()
		throws Exception {
		CEntity target = new CEntity(new Aero(), new TestBot("", "", 1));
		Mounted weapon = new Mounted(new Aero(), new WeaponType());
		weapon.setLinked(new Mounted(new Aero(), new EquipmentType()));
		double value = 1.0;
		ToHitData toHit = new ToHitData();
		int sec_mod = 1;

		AttackOption result = new AttackOption(target, weapon, value, toHit, sec_mod);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.client.bot.CEntity.characterize(CEntity.java:411)
		//       at megamek.client.bot.CEntity.reset(CEntity.java:376)
		//       at megamek.client.bot.CEntity.<init>(CEntity.java:336)
		assertNotNull(result);
	}

	/**
	 * Run the AttackOption(CEntity,Mounted,double,ToHitData,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testAttackOption_3()
		throws Exception {
		CEntity target = new CEntity(new Aero(), new TestBot("", "", 1));
		Mounted weapon = new Mounted(new Aero(), new WeaponType());
		weapon.setLinked(new Mounted(new Aero(), new EquipmentType()));
		double value = 1.0;
		ToHitData toHit = new ToHitData();
		int sec_mod = 1;

		AttackOption result = new AttackOption(target, weapon, value, toHit, sec_mod);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.client.bot.CEntity.characterize(CEntity.java:411)
		//       at megamek.client.bot.CEntity.reset(CEntity.java:376)
		//       at megamek.client.bot.CEntity.<init>(CEntity.java:336)
		assertNotNull(result);
	}

	/**
	 * Run the AttackOption(CEntity,Mounted,double,ToHitData,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testAttackOption_4()
		throws Exception {
		CEntity target = new CEntity(new Aero(), new TestBot("", "", 1));
		Mounted weapon = new Mounted(new Aero(), new WeaponType());
		double value = 1.0;
		ToHitData toHit = new ToHitData();
		int sec_mod = 13;

		AttackOption result = new AttackOption(target, weapon, value, toHit, sec_mod);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.client.bot.CEntity.characterize(CEntity.java:411)
		//       at megamek.client.bot.CEntity.reset(CEntity.java:376)
		//       at megamek.client.bot.CEntity.<init>(CEntity.java:336)
		assertNotNull(result);
	}

	/**
	 * Run the AttackOption(CEntity,Mounted,double,ToHitData,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testAttackOption_5()
		throws Exception {
		CEntity target = new CEntity(new Aero(), new TestBot("", "", 1));
		Mounted weapon = new Mounted(new Aero(), new WeaponType());
		double value = 1.0;
		ToHitData toHit = new ToHitData();
		int sec_mod = 1;

		AttackOption result = new AttackOption(target, weapon, value, toHit, sec_mod);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.client.bot.CEntity.characterize(CEntity.java:411)
		//       at megamek.client.bot.CEntity.reset(CEntity.java:376)
		//       at megamek.client.bot.CEntity.<init>(CEntity.java:336)
		assertNotNull(result);
	}

	/**
	 * Run the AttackOption(CEntity,Mounted,double,ToHitData,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testAttackOption_6()
		throws Exception {
		CEntity target = new CEntity(new Aero(), new TestBot("", "", 1));
		Mounted weapon = new Mounted(new Aero(), new WeaponType());
		double value = 1.0;
		ToHitData toHit = new ToHitData();
		int sec_mod = 1;

		AttackOption result = new AttackOption(target, weapon, value, toHit, sec_mod);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.client.bot.CEntity.characterize(CEntity.java:411)
		//       at megamek.client.bot.CEntity.reset(CEntity.java:376)
		//       at megamek.client.bot.CEntity.<init>(CEntity.java:336)
		assertNotNull(result);
	}

	/**
	 * Run the AttackOption(CEntity,Mounted,double,ToHitData,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testAttackOption_7()
		throws Exception {
		CEntity target = new CEntity(new Aero(), new TestBot("", "", 1));
		Mounted weapon = new Mounted(new Aero(), new WeaponType());
		double value = 1.0;
		ToHitData toHit = new ToHitData();
		int sec_mod = 1;

		AttackOption result = new AttackOption(target, weapon, value, toHit, sec_mod);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.client.bot.CEntity.characterize(CEntity.java:411)
		//       at megamek.client.bot.CEntity.reset(CEntity.java:376)
		//       at megamek.client.bot.CEntity.<init>(CEntity.java:336)
		assertNotNull(result);
	}

	/**
	 * Run the AttackOption(CEntity,Mounted,double,ToHitData,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testAttackOption_8()
		throws Exception {
		CEntity target = new CEntity(new Aero(), new TestBot("", "", 1));
		Mounted weapon = new Mounted(new Aero(), new WeaponType());
		double value = 1.0;
		ToHitData toHit = new ToHitData();
		int sec_mod = 1;

		AttackOption result = new AttackOption(target, weapon, value, toHit, sec_mod);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.client.bot.CEntity.characterize(CEntity.java:411)
		//       at megamek.client.bot.CEntity.reset(CEntity.java:376)
		//       at megamek.client.bot.CEntity.<init>(CEntity.java:336)
		assertNotNull(result);
	}

	/**
	 * Run the AttackOption(CEntity,Mounted,double,ToHitData,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testAttackOption_9()
		throws Exception {
		CEntity target = null;
		Mounted weapon = new Mounted(new Aero(), new EquipmentType());
		double value = 1.0;
		ToHitData toHit = new ToHitData();
		int sec_mod = 1;

		AttackOption result = new AttackOption(target, weapon, value, toHit, sec_mod);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getTarget());
		assertEquals(0.0, result.getExpected(), 1.0);
		assertEquals(0.0, result.getPrimary_odds(), 1.0);
		assertEquals(0.0, result.getPrimary_expected(), 1.0);
		assertEquals(0, result.getHeat());
		assertEquals(0.0, result.getOdds(), 1.0);
		assertEquals(-1, result.getAmmoLeft());
		assertEquals(0, result.getHitTable());
		assertEquals(0, result.getSideTable());
		assertEquals("", result.getTableDesc());
		assertEquals(0, result.getCover());
		assertEquals(0, result.getMoS());
		assertEquals(0, result.getValue());
		assertEquals("", result.getDesc());
		assertEquals("0", result.getValueAsString());
		assertEquals("", result.getCumulativePlainDesc());
	}

	/**
	 * Run the AttackOption(CEntity,Mounted,double,ToHitData,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testAttackOption_10()
		throws Exception {
		CEntity target = new CEntity(new Aero(), new TestBot("", "", 1));
		Mounted weapon = null;
		double value = 1.0;
		ToHitData toHit = new ToHitData();
		int sec_mod = 1;

		AttackOption result = new AttackOption(target, weapon, value, toHit, sec_mod);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.client.bot.CEntity.characterize(CEntity.java:411)
		//       at megamek.client.bot.CEntity.reset(CEntity.java:376)
		//       at megamek.client.bot.CEntity.<init>(CEntity.java:336)
		assertNotNull(result);
	}

	/**
	 * Run the int getAmmoLeft() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testGetAmmoLeft_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);

		int result = fixture.getAmmoLeft();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
		assertEquals(0, result);
	}

	/**
	 * Run the double getExpected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testGetExpected_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);

		double result = fixture.getExpected();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the int getHeat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testGetHeat_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);

		int result = fixture.getHeat();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
		assertEquals(0, result);
	}

	/**
	 * Run the double getOdds() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testGetOdds_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);

		double result = fixture.getOdds();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getPrimary_expected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testGetPrimary_expected_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);

		double result = fixture.getPrimary_expected();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getPrimary_odds() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testGetPrimary_odds_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);

		double result = fixture.getPrimary_odds();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the CEntity getTarget() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testGetTarget_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);

		CEntity result = fixture.getTarget();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData getToHit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testGetToHit_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);

		ToHitData result = fixture.getToHit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
		assertNotNull(result);
	}

	/**
	 * Run the Mounted getWeapon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testGetWeapon_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);

		Mounted result = fixture.getWeapon();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
		assertNotNull(result);
	}

	/**
	 * Run the void setAmmoLeft(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testSetAmmoLeft_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);
		int ammoLeft = 1;

		fixture.setAmmoLeft(ammoLeft);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
	}

	/**
	 * Run the void setExpected(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testSetExpected_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);
		double expected = 1.0;

		fixture.setExpected(expected);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
	}

	/**
	 * Run the void setHeat(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testSetHeat_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);
		int heat = 1;

		fixture.setHeat(heat);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
	}

	/**
	 * Run the void setOdds(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testSetOdds_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);
		double odds = 1.0;

		fixture.setOdds(odds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
	}

	/**
	 * Run the void setPrimary_expected(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testSetPrimary_expected_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);
		double primary_expected = 1.0;

		fixture.setPrimary_expected(primary_expected);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
	}

	/**
	 * Run the void setPrimary_odds(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testSetPrimary_odds_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);
		double primary_odds = 1.0;

		fixture.setPrimary_odds(primary_odds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
	}

	/**
	 * Run the void setTarget(CEntity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testSetTarget_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);
		CEntity target = new CEntity(new Aero(), new TestBot("", "", 1));

		fixture.setTarget(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
	}

	/**
	 * Run the void setToHit(ToHitData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testSetToHit_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);
		ToHitData toHit = new ToHitData();

		fixture.setToHit(toHit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
	}

	/**
	 * Run the void setWeapon(Mounted) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	@Test
	public void testSetWeapon_1()
		throws Exception {
		EquipmentType equipmentType = new EquipmentType();
		equipmentType.setInternalName("");
		Mounted mounted = new Mounted(new Aero(), equipmentType);
		AttackOption fixture = new AttackOption(new CEntity(new Aero(), new TestBot("", "", 1)), mounted, 1.0, new ToHitData(), 1);
		fixture.setExpected(1.0);
		fixture.setPrimary_expected(1.0);
		fixture.setOdds(1.0);
		fixture.setToHit(new ToHitData());
		fixture.setWeapon(new Mounted(new Aero(), new EquipmentType()));
		fixture.setAmmoLeft(1);
		fixture.setPrimary_odds(1.0);
		fixture.setHeat(1);
		fixture.setTarget(new CEntity(new Aero(), new TestBot("", "", 1)));
		fixture.addModifier(null);
		Mounted weapon = new Mounted(new Aero(), new EquipmentType());

		fixture.setWeapon(weapon);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.EquipmentType.addLookupName(EquipmentType.java:313)
		//       at megamek.common.EquipmentType.setInternalName(EquipmentType.java:309)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/13 1:29 AM
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
	 * @generatedBy CodePro at 5/13/13 1:29 AM
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
	 * @generatedBy CodePro at 5/13/13 1:29 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AttackOptionTest.class);
	}
}