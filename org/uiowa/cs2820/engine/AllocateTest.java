package org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AllocateTest {
	
	private Allocate testAllocate;
	
	@Before
	public void setUp() {
		testAllocate = new Allocate();
	}
	
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
	


}
