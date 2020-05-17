package com.java.object;

public class EqualityExample {

	public static void main(String[] args) {
		Product product = new Product(11,"Kan epe", 169.0);
		Product product2 = new Product(11, "Kanepe", 170.0);
		
		if(product == product2) {
			System.out.println("The same");
		}else {
			System.out.println("Different");
		}
		
		boolean b = product.equals(product2);
		if(b) {
			System.out.println("The same");
		}else {
			System.out.println("Different");
		}
	}
}
