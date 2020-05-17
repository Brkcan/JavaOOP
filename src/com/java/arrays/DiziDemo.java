package com.java.arrays;

import java.util.Random;

public class DiziDemo {

	public static void main(String[] args) {
		
		int[] intArray = new int[20];
		Random r = new Random();
		System.err.println(r);
		for (int i = 0; i < intArray.length; i++) {
			
			int random = r.nextInt();
			int sayi = random % 100;
			intArray[i] = sayi;
			System.out.println(intArray[i]);
		}
		
	}
}
