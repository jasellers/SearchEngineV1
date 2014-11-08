package org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class NodeTest {

	// Current test still uses ArrayList, changing to byteList
	
	@Test
	public void testConstructor() {
		Node test1 = new Node(null, "hello");
		assertEquals(test1.Identifiers.get(0), "hello");
	}
	
	@Test
	public void testAdd() {
		Node test1 = new Node(null, "hello");
		test1.add("world");
		assertEquals(test1.Identifiers.get(1), "world");
	}
	
	@Test
	public void testDel() {
		Node test1 = new Node(null, "hello");
		test1.del("hello");
		assertEquals(test1.Identifiers.size(), 0);
	}
	
	@Test
	public void testgetId() {
		Node test1 = new Node(null, "hello");
		test1.add("hello");
		test1.add("world");
		ArrayList temp = new ArrayList();
		temp.add("hello");
		temp.add("world");
		assertEquals(test1.getIdentifiers(), temp);
	}
	
}
