package com.java.ifadeler;

public class WhileDemo {

	public static void main(String[] args) {
		
		int r = (int) (100 * Math.random());
		
		while(r < 90) {
			r = (int) (100 * Math.random());
			System.out.println(r);
		}
	}
}
