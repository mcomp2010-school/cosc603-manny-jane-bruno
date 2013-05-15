package megamek.common.actions;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractEntityActionTest</code> contains tests for the class <code>{@link AbstractEntityAction}</code>.
 *
 * @generatedBy CodePro at 5/13/13 12:21 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class AbstractEntityActionTest {
	/**
	 * Run the int getEntityId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testGetEntityId_1()
		throws Exception {
		AbstractEntityAction fixture = new DodgeAction(1);

		int result = fixture.getEntityId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setEntityId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:21 AM
	 */
	@Test
	public void testSetEntityId_1()
		throws Exception {
		AbstractEntityAction fixture = new DodgeAction(1);
		int entityId = 1;

		fixture.setEntityId(entityId);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(AbstractEntityActionTest.class);
	}
}