package com.java.string;

public class StringPerformansTest {

	public static void main(String[] args) {
		buildString("Java", 100_000);
		buildStringBuffer("Java", 100_000);
	}

	private static void buildString(String string, int i) {
		long start = System.currentTimeMillis();
		for(int j = 0; j < i; j++) {
			string = string + i;
			//System.out.println(buffer);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
	}

	private static void buildStringBuffer(String string, int i) {
		StringBuffer buffer = new  StringBuffer(string);
		long start = System.currentTimeMillis();
		for(int j = 0; j < i; j++) {
			buffer.append(i);
			//System.out.println(buffer);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
