package com.java.exception;

public class RaisingExample {

	public static void main(String[] args){
			try {
				doSometing();

			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("After doSometing...");

	}
	public static void doSometing() throws Throwable{
		doSometingElse();
	}
	
	public static void doSometingElse() throws Throwable{
		throwAThrowable();
	}
	public static void throwAThrowable() throws Throwable{
		Throwable throwable = new Throwable();
		throw throwable;
	}
}
