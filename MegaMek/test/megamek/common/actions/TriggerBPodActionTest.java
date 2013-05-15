package megamek.common.actions;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TriggerBPodActionTest</code> contains tests for the class <code>{@link TriggerBPodAction}</code>.
 *
 * @generatedBy CodePro at 5/13/13 12:14 AM
 * @author manny01
 * @version $Revision: 1.0 $
 */
public class TriggerBPodActionTest {
	/**
	 * Run the TriggerBPodAction(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:14 AM
	 */
	@Test
	public void testTriggerBPodAction_1()
		throws Exception {
		int entityId = 1;
		int equipId = 1;
		int targetId = 1;

		TriggerBPodAction result = new TriggerBPodAction(entityId, equipId, targetId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getTargetId());
		assertEquals(1, result.getPodId());
		assertEquals(1, result.getEntityId());
	}

	/**
	 * Run the int getPodId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:14 AM
	 */
	@Test
	public void testGetPodId_1()
		throws Exception {
		TriggerBPodAction fixture = new TriggerBPodAction(1, 1, 1);

		int result = fixture.getPodId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getTargetId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/13 12:14 AM
	 */
	@Test
	public void testGetTargetId_1()
		throws Exception {
		TriggerBPodAction fixture = new TriggerBPodAction(1, 1, 1);

		int result = fixture.getTargetId();

		// add additional test code here
		assertEquals(1, result);
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
		new org.junit.runner.JUnitCore().run(TriggerBPodActionTest.class);
	}
}