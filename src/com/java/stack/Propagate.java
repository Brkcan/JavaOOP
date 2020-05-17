package com.java.stack;

public class Propagate {

	public  void method1(int n) {
		method2(n);
	}
	
	public void method2(int n) {
		method3(n);
	}
	
	public void method3(int n) {
		for (int i = 0; i < 5; i++) {
			if(i % 2 == 0) {
				System.out.println(i/n);
			}
		}
	}
	
	public static void main(String[] args) {
		Propagate propagate = new Propagate();
		propagate.method1(1);
	}

	
}
