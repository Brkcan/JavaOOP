package com.java.wrapper;

public class WrapperExample {

	public static void main(String[] args) {

		int i = 8;
		Integer iObject = i; // Boxing 
		System.out.println(iObject);
		
		String iString = iObject.toString();
		
		int ii = iObject;     // Unboxing
		System.out.println(ii);
		
		int iii = Integer.parseInt("18"); // Nesne yaratmadan string degeri int alma
		System.out.println(iii);
		
		String s2 = "false";
		boolean b = Boolean.parseBoolean(s2);
		System.out.println(!b);
	}

}
