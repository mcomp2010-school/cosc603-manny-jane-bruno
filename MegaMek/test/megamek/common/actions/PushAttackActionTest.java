package megamek.common.actions;

import org.junit.*;
import megamek.common.IGame;
import megamek.common.Aero;
import megamek.common.BipedMech;
import megamek.common.Coords;
import megamek.common.Targetable;
import megamek.common.ToHitData;
import megamek.common.Game;
import megamek.common.Entity;
import static org.junit.Assert.*;

/**
 * The class <code>PushAttackActionTest</code> contains tests for the class <code>{@link PushAttackAction}</code>.
 *
 * @generatedBy CodePro at 5/13/13 12:18 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class PushAttackActionTest {
	/**
	 * Run the PushAttackAction(int,int,Coords) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:18 AM
	 */
	@Test
	public void testPushAttackAction_1()
		throws Exception {
		int entityId = 1;
		int targetId = 1;
		Coords targetPos = new Coords();

		PushAttackAction result = new PushAttackAction(entityId, targetId, targetPos);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getTargetType());
		assertEquals(1, result.getTargetId());
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the PushAttackAction(int,int,int,Coords) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:18 AM
	 */
	@Test
	public void testPushAttackAction_2()
		throws Exception {
		int entityId = 1;
		int targetType = 1;
		int targetId = 1;
		Coords targetPos = new Coords();

		PushAttackAction result = new PushAttackAction(entityId, targetType, targetId, targetPos);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getTargetType());
		assertEquals(1, result.getTargetId());
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the ToHitData toHit(IGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:18 AM
	 */
	@Test
	public void testToHit_1()
		throws Exception {
		PushAttackAction fixture = new PushAttackAction(1, 1, new Coords());
		IGame game = new Game();

		ToHitData result = fixture.toHit(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at megamek.common.actions.PushAttackAction.toHit(PushAttackAction.java:133)
		//       at megamek.common.actions.PushAttackAction.toHit(PushAttackAction.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:18 AM
	 */
	@Test
	public void testToHitIsImpossible_1()
		throws Exception {
		IGame game = new Game();
		Entity ae = new BipedMech();
		Targetable target = new Aero();

		String result = PushAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:18 AM
	 */
	@Test
	public void testToHitIsImpossible_2()
		throws Exception {
		IGame game = new Game();
		Entity ae = new BipedMech();
		Targetable target = new Aero();

		String result = PushAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:18 AM
	 */
	@Test
	public void testToHitIsImpossible_3()
		throws Exception {
		IGame game = new Game();
		Entity ae = new BipedMech();
		Targetable target = new Aero();

		String result = PushAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:18 AM
	 */
	@Test
	public void testToHitIsImpossible_4()
		throws Exception {
		IGame game = new Game();
		Entity ae = new BipedMech();
		Targetable target = new Aero();

		String result = PushAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:18 AM
	 */
	@Test
	public void testToHitIsImpossible_5()
		throws Exception {
		IGame game = new Game();
		Entity ae = new BipedMech();
		Targetable target = new Aero();

		String result = PushAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:18 AM
	 */
	@Test
	public void testToHitIsImpossible_6()
		throws Exception {
		IGame game = new Game();
		Entity ae = new BipedMech();
		Targetable target = new Aero();

		String result = PushAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:18 AM
	 */
	@Test
	public void testToHitIsImpossible_7()
		throws Exception {
		IGame game = new Game();
		Entity ae = new BipedMech();
		Targetable target = new Aero();

		String result = PushAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:18 AM
	 */
	@Test
	public void testToHitIsImpossible_8()
		throws Exception {
		IGame game = new Game();
		Entity ae = new BipedMech();
		Targetable target = new Aero();

		String result = PushAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Run the String toHitIsImpossible(IGame,Entity,Targetable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:18 AM
	 */
	@Test
	public void testToHitIsImpossible_9()
		throws Exception {
		IGame game = new Game();
		Entity ae = new Aero();
		Targetable target = new Aero();

		String result = PushAttackAction.toHitIsImpossible(game, ae, target);

		// add additional test code here
		assertEquals("A friendly unit can never be the target of a direct attack.", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/13 12:18 AM
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
	 * @generatedBy CodePro at 5/13/13 12:18 AM
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
	 * @generatedBy CodePro at 5/13/13 12:18 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PushAttackActionTest.class);
	}
}