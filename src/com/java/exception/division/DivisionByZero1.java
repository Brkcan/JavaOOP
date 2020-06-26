package com.java.exception.division;

public class DivisionByZero1 {
	
	public static void main(String[] args) {
		
		divide(20,5);

	}

	public static void divide(int num1, int num2) {
		int division = num1 / num2;
		System.out.println(division);
	}
}
