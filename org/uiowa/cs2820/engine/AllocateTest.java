package org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import org.junit.Test;

public class AllocateTest {
	
	private Allocate testAllocate = new Allocate();
	
	@Test
	public void empty_allocate_test() {
		int area = testAllocate.allocateArea();
		assertEquals(area, 0);
	}
	
	@Test
	public void allocate_area_test() {
		int area = 0;
		for (int i=0; i <= 10; i++) {
			area = testAllocate.allocateArea();
		}
		assertEquals(area, 10);
	}
	
	@Test
	public void free_area_test() {
		testAllocate.freeArea(4);
		testAllocate.freeArea(10);
		assertEquals(testAllocate.size(), 8);
	}

}
