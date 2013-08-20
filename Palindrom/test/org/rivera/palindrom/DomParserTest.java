package org.rivera.palindrom;

import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DomParserTest {

	DomParser Dom1 = null;
	ArrayList<Node> nodeList= null;
	@Before
	public void setUp() throws Exception {
		Dom1 = new DomParser();
		nodeList = new ArrayList<Node>();
	}

	@After
	public void tearDown() throws Exception {
	 Dom1 = null;
	 nodeList= null;
	}

	@Test
	public void testParseXMLValid() {
		nodeList.add(new Node("b","1"));
		nodeList.add(new Node("c","2"));
		ArrayList<Node> actual = Dom1.parseXML("<? hello ?> <a><b>1</b><c>2</c></a>","a");
		Assert.assertEquals(nodeList, actual);
	}

}
