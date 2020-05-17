package com.java.string;

public class StringBufferAndStringBuilderExample {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder();
	    processString(buffer);
	}

	private static void processString(StringBuffer buffer) {
		buffer.append("I love you java :)");
		System.out.println(buffer);
		System.out.println("Reverse : " + buffer.reverse());
		System.out.println("Reverse : " + buffer.reverse());
		System.out.println("Reverse : " + buffer.replace(11,15,"C++"));
		buffer.setCharAt(4, ',');
		System.out.println(buffer);
		buffer.replace(buffer.length()-1, buffer.length() + 2, "asdff");
		System.out.println(buffer);
	}
}
