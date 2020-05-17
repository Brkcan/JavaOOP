package com.java.parameter;

public class B {

	public static int f(int e) {
		e++;
		return e;
	}
	public static void main(String[] args) {

		int i = 5;
		System.out.println(i);
		int t = f(i);
		System.out.println(t);
	}

}
