package megamek.common.actions;

import org.junit.*;
import megamek.common.Coords;
import static org.junit.Assert.*;

/**
 * The class <code>DisplacementAttackActionTest</code> contains tests for the class <code>{@link DisplacementAttackAction}</code>.
 *
 * @generatedBy CodePro at 5/13/13 12:14 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class DisplacementAttackActionTest {
	/**
	 * Run the DisplacementAttackAction(int,int,Coords) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:14 AM
	 */
	@Test
	public void testDisplacementAttackAction_1()
		throws Exception {
		int entityId = 1;
		int targetId = 1;
		Coords targetPos = new Coords();

		DisplacementAttackAction result = new DisplacementAttackAction(entityId, targetId, targetPos);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getTargetType());
		assertEquals(1, result.getTargetId());
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the DisplacementAttackAction(int,int,int,Coords) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:14 AM
	 */
	@Test
	public void testDisplacementAttackAction_2()
		throws Exception {
		int entityId = 1;
		int targetType = 1;
		int targetId = 1;
		Coords targetPos = new Coords();

		DisplacementAttackAction result = new DisplacementAttackAction(entityId, targetType, targetId, targetPos);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getTargetType());
		assertEquals(1, result.getTargetId());
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the Coords getTargetPos() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:14 AM
	 */
	@Test
	public void testGetTargetPos_1()
		throws Exception {
		DisplacementAttackAction fixture = new DisplacementAttackAction(1, 1, 1, new Coords());

		Coords result = fixture.getTargetPos();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coords (0, 0); 0101", result.toString());
		assertEquals("(1, 1)", result.toFriendlyString());
		assertEquals(false, result.isXOdd());
		assertEquals("0101", result.getBoardNum());
	}

	/**
	 * Run the void setTargetPos(Coords) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:14 AM
	 */
	@Test
	public void testSetTargetPos_1()
		throws Exception {
		DisplacementAttackAction fixture = new DisplacementAttackAction(1, 1, 1, new Coords());
		Coords targetPos = new Coords();

		fixture.setTargetPos(targetPos);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/13 12:14 AM
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
	 * @generatedBy CodePro at 5/13/13 12:14 AM
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
	 * @generatedBy CodePro at 5/13/13 12:14 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DisplacementAttackActionTest.class);
	}
}