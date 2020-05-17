package com.java.object;

public class Car {

	private int year;
	private String brand;
	private String model;
	private int power;
	
	public Car(int year, String brand, String model, int power) {
		super();
		this.year = year;
		this.brand = brand;
		this.model = model;
		this.power = power;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", brand=" + brand + ", model=" + model + ", power=" + power + "]";
	}
	
	
}
