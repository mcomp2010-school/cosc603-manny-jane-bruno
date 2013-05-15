package megamek.common.actions;

import org.junit.*;
import megamek.common.IGame;
import megamek.common.Aero;
import megamek.common.Targetable;
import megamek.common.ToHitData;
import megamek.common.Game;
import megamek.common.Entity;
import static org.junit.Assert.*;

/**
 * The class <code>ThrashAttackActionTest</code> contains tests for the class <code>{@link ThrashAttackAction}</code>.
 *
 * @generatedBy CodePro at 5/13/13 12:16 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class ThrashAttackActionTest {
	/**
	 * Run the ThrashAttackAction(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testThrashAttackAction_1()
		throws Exception {
		int entityId = 1;
		int targetId = 1;

		ThrashAttackAction result = new ThrashAttackAction(entityId, targetId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getTargetType());
		assertEquals(1, result.getTargetId());
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the ThrashAttackAction(int,Targetable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testThrashAttackAction_2()
		throws Exception {
		int entityId = 1;
		Targetable target = new Aero();

		ThrashAttackAction result = new ThrashAttackAction(entityId, target);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getTargetType());
		assertEquals(-1, result.getTargetId());
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the ThrashAttackAction(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testThrashAttackAction_3()
		throws Exception {
		int entityId = 1;
		int targetType = 1;
		int targetId = 1;

		ThrashAttackAction result = new ThrashAttackAction(entityId, targetType, targetId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getTargetType());
		assertEquals(1, result.getTargetId());
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the int getDamageFor(Entity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testGetDamageFor_1()
		throws Exception {
		Entity entity = new Aero();

		int result = ThrashAttackAction.getDamageFor(entity);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_1()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_2()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_3()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_4()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_5()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_6()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_7()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_8()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_9()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_10()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_11()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_12()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_13()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_14()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test
	public void testToHit_15()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Attacker or target not valid
		//       at megamek.common.actions.ThrashAttackAction.toHit(ThrashAttackAction.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testToHit_16()
		throws Exception {
		ThrashAttackAction fixture = new ThrashAttackAction(1, 1);
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/13 12:16 AM
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
	 * @generatedBy CodePro at 5/13/13 12:16 AM
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
	 * @generatedBy CodePro at 5/13/13 12:16 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ThrashAttackActionTest.class);
	}
}