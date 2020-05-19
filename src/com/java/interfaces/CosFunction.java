package com.java.interfaces;

public class CosFunction implements Math{
	
	private static final String name = "Cos";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg) {
		return 0;
	}


}
