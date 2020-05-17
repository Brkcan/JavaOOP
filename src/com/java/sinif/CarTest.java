package com.java.sinif;

public class CarTest {

	public static void main(String[] args) {

		Car  car = new Car();
		car.make = "Mercedes";
		car.model = "C200";
		car.year = "2011";
		car.distance = 0;
		car.speed = 0;
		
		System.out.println(car);
		
		car.accelerate(30);
		
		System.out.println(car);
		
		car.go(20);
		
		System.out.println(car);
		
		car.go(20);
		
		System.out.println(car);
	}

}
