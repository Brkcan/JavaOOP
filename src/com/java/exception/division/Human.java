package com.java.exception.division;

public class Human {

	public static void main(String[] args) {
		try {
			throw new Annoyance();
		} catch (Sneeze s) {
			System.out.println("Sneeze");
		} catch (Annoyance a) {
			System.out.println("Annoyance");
		} catch (Exception ex) {
			System.out.println("Exception");
		}
	}
}
class Annoyance extends Exception{
	
}

class Sneeze extends Annoyance{
	
}
