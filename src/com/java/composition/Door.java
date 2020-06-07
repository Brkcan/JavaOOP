package com.java.composition;

public class Door {

	protected int Door[];
	
	public boolean closeDoor  = true;
	
	public Door(String string) {
		
	}
	
	public boolean isClosed() {
	
		return closeDoor;
	}
	
	public boolean close() {
		closeDoor = false;
		return closeDoor;
	}
}
