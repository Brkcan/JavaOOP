package com.java.composition;

import java.util.Arrays;

public class Car {

	private String make;
	private String model;
	private String year;
	private int doorCount;
	private Wheel[] wheels = new Wheel[4];
	protected Engine engine;
	protected Door[] door;
	protected Transmission transmission;
	
	private int speed;
	private int distance;
	
	public Car() {
	}

	public Car(String make, String model, String year, int doorCount) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.doorCount = doorCount;
		
		engine = new Engine(2300,175);
		
		transmission = new Transmission();
		
		wheels[0] = new Wheel("left-front");
		wheels[1] = new Wheel("Right-front");
		wheels[2] = new Wheel("left-rear");
		wheels[3] = new Wheel("Right-rear");
		
		door  = new  Door[this.doorCount];
		door[0] = new Door("Left-front");
		door[1] = new Door("Right-front");
		
		if(this.doorCount == 4) {    
			door[2] = new  Door("Left-rear");
			door[3] = new  Door("Right-rear");
		}
	}
	
	public void start() {
		engine.start();
	}
	public void go(int newDistance) {
		for(int i = 0; i< door.length;i++) {
			if(door[i].isClosed() == true) {
				door[i].close();
			}
		}
		distance += newDistance;
	}
	
	public void accelerate(int newSpeed) {
		speed = newSpeed;
	}
	public void stop() {
		speed = 0;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", doorCount=" + doorCount + ", wheels="
				+ Arrays.toString(wheels) + ", engine=" + engine + ", door=" + Arrays.toString(door) + ", transmission="
				+ transmission + ", speed=" + speed + ", distance=" + distance + "]";
	}
	
	
}
