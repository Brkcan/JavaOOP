package com.java.car;

public class CarAttributeOnlyComposite {
	
	protected String make;
	protected String model;
	protected String year;
	protected int speed;
	protected int distance;
	
	PersonAttributeOnlyComposite owner;

	@Override
	public String toString() {
		return "CarAttributeOnlyComposite [make=" + make + ", model=" + model + ", year=" + year + ", speed=" + speed
				+ ", distance=" + distance + ", owner=" + owner + "]";
	}
	
	

}
