package com.java.interfaces;

public class SinFunction implements Math{
	
	private static final String name = "Sin";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg) {
		return 2*3+(arg);
	}

}
