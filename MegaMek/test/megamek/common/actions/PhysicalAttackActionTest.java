package megamek.common.actions;

import org.junit.*;
import megamek.common.IGame;
import megamek.common.Aero;
import megamek.common.BipedMech;
import megamek.common.Targetable;
import megamek.common.ToHitData;
import megamek.common.Game;
import megamek.common.Entity;
import static org.junit.Assert.*;

/**
 * The class <code>PhysicalAttackActionTest</code> contains tests for the class <code>{@link PhysicalAttackAction}</code>.
 *
 * @generatedBy CodePro at 5/13/13 12:21 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class PhysicalAttackActionTest {
	/**
	 * Run the PhysicalAttackAction(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testPhysicalAttackAction_1()
		throws Exception {
		int entityId = 1;
		int targetId = 1;

		PhysicalAttackAction result = new PhysicalAttackAction(entityId, targetId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getTargetType());
		assertEquals(1, result.getTargetId());
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the PhysicalAttackAction(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testPhysicalAttackAction_2()
		throws Exception {
		int entityId = 1;
		int targetType = 1;
		int targetId = 1;

		PhysicalAttackAction result = new PhysicalAttackAction(entityId, targetType, targetId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getTargetType());
		assertEquals(1, result.getTargetId());
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_1()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		Entity ae = new BipedMech();
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_2()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = false;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_3()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = false;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_4()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = true;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_5()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = true;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_6()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = true;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_7()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = true;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_8()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = true;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_9()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = false;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_10()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = false;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_11()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = false;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_12()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = false;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_13()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = false;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_14()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = false;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_15()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = false;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the void setCommonModifiers(ToHitData,IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetCommonModifiers_16()
		throws Exception {
		ToHitData toHit = new ToHitData();
		IGame game = new Game();
		BipedMech ae = new BipedMech();
		ae.spotting = false;
		Targetable target = new Aero();

		PhysicalAttackAction.setCommonModifiers(toHit, game, ae, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.Compute.getAttackerMovementModifier(Compute.java:1296)
		//       at megamek.common.actions.PhysicalAttackAction.setCommonModifiers(PhysicalAttackAction.java:176)
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testToHitIsImpossible_1()
		throws Exception {
		IGame game = new Game();
		Entity ae = new Aero();
		Targetable target = null;

		String result = PhysicalAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("target is null", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testToHitIsImpossible_2()
		throws Exception {
		IGame game = new Game();
		Entity ae = new Aero();
		Targetable target = new Aero();

		String result = PhysicalAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testToHitIsImpossible_3()
		throws Exception {
		IGame game = new Game();
		Entity ae = new Aero();
		Targetable target = new Aero();

		String result = PhysicalAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testToHitIsImpossible_4()
		throws Exception {
		IGame game = new Game();
		Entity ae = new Aero();
		Targetable target = new Aero();

		String result = PhysicalAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testToHitIsImpossible_5()
		throws Exception {
		IGame game = new Game();
		Entity ae = new Aero();
		Targetable target = new Aero();

		String result = PhysicalAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testToHitIsImpossible_6()
		throws Exception {
		IGame game = new Game();
		Entity ae = new Aero();
		Targetable target = new Aero();

		String result = PhysicalAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testToHitIsImpossible_7()
		throws Exception {
		IGame game = new Game();
		Entity ae = new Aero();
		Targetable target = new Aero();

		String result = PhysicalAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testToHitIsImpossible_8()
		throws Exception {
		IGame game = new Game();
		Entity ae = new Aero();
		Targetable target = new Aero();

		String result = PhysicalAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testToHitIsImpossible_9()
		throws Exception {
		IGame game = new Game();
		Entity ae = new Aero();
		Targetable target = new Aero();

		String result = PhysicalAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testToHitIsImpossible_10()
		throws Exception {
		IGame game = new Game();
		Entity ae = new Aero();
		Targetable target = new Aero();

		String result = PhysicalAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testToHitIsImpossible_11()
		throws Exception {
		IGame game = new Game();
		Entity ae = new Aero();
		Targetable target = new Aero();

		String result = PhysicalAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
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
	 * @generatedBy CodePro at 5/13/13 12:21 AM
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
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PhysicalAttackActionTest.class);
	}
}