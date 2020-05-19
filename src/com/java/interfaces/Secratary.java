package com.java.interfaces;

public class Secratary extends Employee{
	
	public Secratary(int no, String name, int year, String department) {
		super(no, name, year, department);
	}	

	public void work() {
		System.out.println("Secretary working");
	}

}
