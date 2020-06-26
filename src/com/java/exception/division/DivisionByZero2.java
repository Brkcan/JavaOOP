package com.java.exception.division;

public class DivisionByZero2 {

	public static void main(String[] args) {
		try {
			divide(20,0); 
		} catch (ArithmeticException ex) {
			System.out.println("" + ex.getMessage());
		}
	}
	
	public static void divide(int num1, int num2) {
		System.out.println("num1 : "  + num1 + " " +"num2 : " + num2);
		int division = num1 / num2;
		
		System.out.println("" + division);
	}

}
