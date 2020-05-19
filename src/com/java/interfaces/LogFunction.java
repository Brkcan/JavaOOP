package com.java.interfaces;

public class LogFunction implements Math{

	private static final String name = "log";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg) {
		return 1 * (arg);
	}
	

	
}
