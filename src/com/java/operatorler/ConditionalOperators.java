package com.java.operatorler;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = b1 & b2;
		boolean b4 = b1 | b2;
		boolean b5 = b1 ^ b2;
		
		System.err.println(b1);
		System.err.println(b2);
		System.err.println(b3);
		System.err.println(b4);
		System.err.println(b5);

		
		if((getOne() == 7) && (getTwo() == 2)) {
			System.out.println("Value1 is 1 AND value2 is 2");
		}
		if((getOne() == 8) || (getTwo() == 1)) {
			System.out.println("value1 is 1 OR value2 is 1");
		}
	}

	private static int getTwo() {
		return 1;
	}

	private static int getOne() {
		// TODO Auto-generated method stub
		return 1;
	}
}
