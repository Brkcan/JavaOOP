package com.java.staticDemo;

public class StaticDemo {
	
	public static int i = 10;
	
	static double a = Math.PI;
	
	public static void increment() {
		i++;
	}
	
	public static void main(String[] args) {
		
		System.out.println(StaticDemo.a);
		
		System.out.println(StaticDemo.i);
		
		StaticDemo.increment();
		
		System.out.println(StaticDemo.i);
		
		StaticDemo st1 = new StaticDemo();
		StaticDemo st2 = new StaticDemo();
		
		st1.increment();
		
		System.out.println(st1.i);
		
		st2.increment();
		
		System.out.println(st2.i);
		
		
	}

}
