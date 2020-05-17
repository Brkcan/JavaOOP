package com.java.stack;

public class radix {

	public static void main(String[] args) {
		int [] radix = new int[2];
		
		for (int i = 1; i < 32; i++) {
			radix[i % 2]++; //+=  radix[i % 2] ;
		}
		System.out.println(radix[1]);
		
		int i = 4;
		int j = 2;
		
		System.out.println(i % j);
	}
	

}
