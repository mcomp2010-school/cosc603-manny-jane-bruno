package megamek.common.actions;

import org.junit.*;
import megamek.common.Minefield;
import megamek.common.Coords;
import static org.junit.Assert.*;

/**
 * The class <code>ClearMinefieldActionTest</code> contains tests for the class <code>{@link ClearMinefieldAction}</code>.
 *
 * @generatedBy CodePro at 5/13/13 12:14 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class ClearMinefieldActionTest {
	/**
	 * Run the ClearMinefieldAction(int,Minefield) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:14 AM
	 */
	@Test
	public void testClearMinefieldAction_1()
		throws Exception {
		int entityId = 1;
		Minefield mf = Minefield.createMinefield(new Coords(), 1, 1, 1);

		ClearMinefieldAction result = new ClearMinefieldAction(entityId, mf);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the Minefield getMinefield() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:14 AM
	 */
	@Test
	public void testGetMinefield_1()
		throws Exception {
		ClearMinefieldAction fixture = new ClearMinefieldAction(1, Minefield.createMinefield(new Coords(), 1, 1, 1));

		Minefield result = fixture.getMinefield();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getType());
		assertEquals("Command-detonated", result.getName());
		assertEquals(0, result.getDepth());
		assertEquals(9, result.getTrigger());
		assertEquals(1, result.getDensity());
		assertEquals(false, result.isSeaBased());
		assertEquals(false, result.isOneUse());
		assertEquals(0, result.getSetting());
		assertEquals(1, result.getPlayerId());
		assertEquals(false, result.hasDetonated());
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
		new org.junit.runner.JUnitCore().run(ClearMinefieldActionTest.class);
	}
}