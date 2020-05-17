package com.java.nesne;

public class Nesne {

	public static void main(String[] args) {
		String s1 = new String("s1");
		String s2 = new String("s2");
		@SuppressWarnings("unused")
		String temp = s1;
		s1 = s2;
		s2 = s1;
		//s2 = temp;
		
		System.out.println(s1);
		System.out.println(s2);
		//System.out.println(temp);
		

		
		int i = 5;
		@SuppressWarnings("unused")
		int j = i;
		i = 7;
		
		//System.out.println(j);

	}
}
