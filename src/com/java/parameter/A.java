package com.java.parameter;

public class A {
	
	int i;
	
	public static void f(A a) {
		a.i++;
	}

	public static void main(String[] args) {
		A a = new A();
		a.i = 5;
		System.out.println(a.i);
		 f(a);
		System.out.println(a.i);
	}

}
