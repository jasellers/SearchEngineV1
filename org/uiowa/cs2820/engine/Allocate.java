package org.uiowa.cs2820.engine;

import java.util.BitSet;

public class Allocate {

	private BitSet allocationSet;
	
	
	public Allocate() {
		
		//Checkpoint.restore(file)
		
	}
	
	// Changed method name to be different from class/constructor name
	public int allocateArea() {
		
		//Checkpoint.save(file)
		int next = 0;
		//next = allocationSet.nextClearBit(fromIndex);
		return next;
	}
	
	// Changed to match previous method
	public void freeArea(int areaNumber) {

			allocationSet.clear(areaNumber);
		
		//Checkpoint.save(file)
	}
}
