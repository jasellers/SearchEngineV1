package org.uiowa.cs2820.engine;

import java.util.ArrayList;

public class Node {
  // Node is a basic unit in the database
  byte[] Key;  // Key of this node for lookup
  public ArrayList<String> Identifiers; // have to refractor to byteList
  int size;    // for byte List
  
  Node(byte[] f, String id) {
	this.Key = f;
	this.Identifiers = new ArrayList<String>();
	this.Identifiers.add(id);
    }
  
  public void add(String id) { 
	Identifiers.remove(id);
	Identifiers.add(id);
    }
  
  public void del(String id) {
	Identifiers.remove(id);
    }
  

  public int getSize() {
	return Identifiers.size(); // should be byte, testing with ArrayList
    }
  
  /**
  public String toString() {
	  
  }
  */
  
  }
