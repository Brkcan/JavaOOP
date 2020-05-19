package com.java.interfaces;

import java.util.Scanner;

public class CalculaterMain {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		Calculater calculater = new Calculater(3);
		calculater.addFunction(new SinFunction());
		calculater.addFunction(new CosFunction());
		calculater.addFunction(new LogFunction());

		calculater.listMathFuntion();
		String name = in.next();
		System.out.println("deger giriniz.");
		double argument = in.nextDouble();
		System.out.println(calculater.doCalculater(name, argument));
		
	}

}
