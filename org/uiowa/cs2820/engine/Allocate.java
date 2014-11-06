package org.uiowa.cs2820.engine;

import java.util.BitSet;

public class Allocate {

	private BitSet allocationSet;
	
	public Allocate() {
		allocationSet = new BitSet();
		//Checkpoint.restore(file)
		
	}
	
	// Changed method name to be different from class/constructor name
	public int allocateArea() {
		int areaNumber;
		if (allocationSet.isEmpty()) {
			areaNumber = 0;
		} else { // Initially using a crude method to get the next available area...
			areaNumber = allocationSet.nextClearBit(0);
		}
		// and mark it as now in use
		allocationSet.set(areaNumber);
		
		//Checkpoint.save(file)		
		return areaNumber;
	}
	
	// Changed to match previous method
	public void freeArea(int areaNumber) {
		//To throw an exception if no areas are allocated or no?
			allocationSet.clear(areaNumber);
		
		//Checkpoint.save(file)
	}
	
	public int size() {
		return allocationSet.cardinality();
	}
}
