package org.rivera.palindrom;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class EngineTest.
 */
public class EngineTest {

	/** The Engine test. */
	Engine EngineTest = null;
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		EngineTest = new Engine();
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
		EngineTest = null;
	}

	/**
	 * SetFileName Method - Check for Invalid Args.
	 */
	@Test
	public void testIsParlindrom_true() {
		Assert.assertTrue(EngineTest.isPalindrom("12321"));
	}
	
	/**
	 * Test is parlindrom_true pun1.
	 */
	@Test
	public void testIsParlindrom_truePun1() {
		Assert.assertTrue(EngineTest.isPalindrom("1;;2.3.2;;1"));
	}
	
	/**
	 * Test is parlindrom_true pun2.
	 */
	@Test
	public void testIsParlindrom_truePun2() {
		Assert.assertTrue(EngineTest.isPalindrom("Don't nod"));
	}
	
	/**
	 * Test is parlindrom_true pun3.
	 */
	@Test
	public void testIsParlindrom_truePun3() {
		Assert.assertTrue(EngineTest.isPalindrom("race car"));
	}
	
	/**
	 * Test is parlindrom_true pun4.
	 */
	@Test
	public void testIsParlindrom_truePun4() {
		Assert.assertTrue(EngineTest.isPalindrom("A man, a plan, a canal: Panama."));
	}
	
	/**
	 * Test clean string_caps1.
	 */
	@Test
	public void testCleanString_caps1() {
		String strExpected = EngineTest.cleanString("HELLo WoRld");
		Assert.assertEquals("helloworld", strExpected);
	}
	
	/**
	 * Test clean string_caps2.
	 */
	@Test
	public void testCleanString_caps2() {
		String strExpected = EngineTest.cleanString("HELLO WORLD");
		Assert.assertEquals("helloworld", strExpected);
		
	}
	
	/**
	 * Test clean string_caps3.
	 */
	@Test
	public void testCleanString_caps3() {
		String strExpected = EngineTest.cleanString("hello world");
		Assert.assertEquals("helloworld", strExpected);
		
	}
	
	/**
	 * Test clean string_pun1.
	 */
	@Test
	public void testCleanString_pun1() {
		String strExpected = EngineTest.cleanString("!hello.,? world<>");
		Assert.assertEquals("helloworld", strExpected);	
	}
	
	/**
	 * Test clean string_pun2.
	 */
	@Test
	public void testCleanString_pun2() {
		String strExpected = EngineTest.cleanString("Too bad – I hid a boot");
		System.out.println(strExpected);
		Assert.assertEquals("toobadihidaboot", strExpected);	
	}

	/**
	 * Test clean string_pun3.
	 */
	@Test
	public void testCleanString_pun3() {
		String strExpected = EngineTest.cleanString("Test.:;?! World123");
		System.out.println(strExpected);
		Assert.assertEquals("testworld123", strExpected);	
	}
	
	
}
