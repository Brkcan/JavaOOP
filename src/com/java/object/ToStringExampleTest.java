package com.java.object;

public class ToStringExampleTest {
	
	public static void main(String[] args) {
		Car c1 = new  Car(2012, "Mercedes", "CLK200", 450);
		System.out.println(c1.toString());
		System.out.println(c1.hashCode());
		System.out.println(c1.getClass().getName());

	}

}
