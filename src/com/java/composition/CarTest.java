package com.java.composition;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car car = new Car("Mercedes Benz","CLK 200","2013",2);
		car.start();
		car.go(1000);
		car.accelerate(100);
		car.stop();
		Engine engine = new Engine(1, 2);
		//System.out.println(car.engine);
		
	}

}
