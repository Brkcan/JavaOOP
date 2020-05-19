package com.java.interfaces;

public class Calculater {
	
	private int functionCount;
	private int currentCount = 0;
	
	private Math[] math;
	
	private double argument;

	public Calculater(int functionCount) {
		this.functionCount = functionCount;
		math = new Math[functionCount];
	}
	public void addFunction(Math maths) {
		math[currentCount] = maths;
		currentCount++;
	}
	
	public double doCalculater(String functionName, double arg) {
		double result = 0.0;
		boolean isFunctionFound = false;
		for (Math maths: math) {
			if(functionName.equalsIgnoreCase(maths.getName())) {
				result = maths.calculate(arg);
				isFunctionFound = true;
			}
		}
		if(!isFunctionFound) {
			System.out.println("no such function found");
		}
		return result;
	}
	public void listMathFuntion() {
		System.out.println("Available function : ");
		for(Math maths: math) {
			System.err.println(maths.getName());
		}
	}
}
