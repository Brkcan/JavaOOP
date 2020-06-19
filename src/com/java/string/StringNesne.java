package com.java.string;

public class StringNesne {

	public static void main(String[] args) {

		String s1 = new String("Java");
		String s2 = new String("Java");
		
		if(s1 == s2) {
			System.out.println("Aynı deger, aynı referans");
		}else {
			System.out.println("Farklı heap, farklı referans");
		}
		
		String s3 = "Java";
		String s4 = "Java";
		if(s3 == s4) {
			System.out.println("Aynı deger, aynı referans");
		}else {
			System.out.println("Farklı heap, farklı referans");
		}
		
		String java = "I love";
		String java1 = "Java";
		String java2 = java.concat(" " + java1);
		java += java1;
//		System.out.println(java2);
		System.out.println(java == java2);
		System.out.println(java);
		
		String java3 = "Test";
		String java4 = "Test1";
		java3 += java4;
		System.out.println(java3);
		
		StringBuffer sb = new StringBuffer();
		sb.append("Burak");
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Can");
	
		StringBuffer sb2 = sb.append(sb1);
		System.out.println(sb2);
	}

}
