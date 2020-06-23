package com.java;

import java.util.Scanner;

public class ScannerUtils {

	static Scanner sc; 
	 
	public static String read(String prompt) {
		System.out.println(prompt);
		sc = new Scanner(System.in);
		System.out.println("Dosya Dizini iste...");
		return sc.next();
	}
	 
}
