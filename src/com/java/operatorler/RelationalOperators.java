package com.java.operatorler;

import java.util.Random;

public class RelationalOperators {

	public static void main(String[] args) {
		
		Random random = new Random();
		int i = random.nextInt() % 100;
		int j = random.nextInt() % 100;

		prt("i = " + i);
		prt("j = " + j);
		prt("i > j = " + (i > j));
		prt("i < j = " + (i < j));
		prt("i <= j = " + (i <= j));
		prt("i >= j = " + (i >= j));
		
		String s1 = new String("String");
		String s2 = new String("String");
		
		if(s1 == s2) {
			prt("same");
		}
		else {
			prt("diff");
		}
	}

	public static void prt(String string) {
		System.err.println(string);
	}
}
