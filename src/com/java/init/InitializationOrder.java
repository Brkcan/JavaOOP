package com.java.init;

public class InitializationOrder {

	static A a = new A();
	
	public InitializationOrder() {
		System.out.println("InitialOrderConst");
	}
	
	public static void main(String[] args) {
		InitializationOrder initializationOrder = new  InitializationOrder();
	}	
	C c = new C();
	static int [] ints = new int[10];
	static {
		System.out.println("Initializing the array");
		for(int i = 0; i < ints.length; i++) {
			ints[i] = i * 10;
		}
	}
	
}

class A {
	C c = new C();
	public A() {
		System.out.println("İn A");
	}
}

class B{
	public B () {
		System.out.println("İn B");
	}
}

 class C {
	  B b = new B();
	 
	 public C() {
		 System.out.println("İn C");
	 }
	 
	 public void f() {
		 System.out.println("C nin f metodu...");
	 }
 }






