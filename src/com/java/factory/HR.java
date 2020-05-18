package com.java.factory;

public class HR extends Employee{

	public HR(int no, String name, int year, String department) {
		super(no, name, year, department);
	}

	public Employee getAnEmployee() {
		Employee employee = new Employee(1, "burak", 6, "IT");
		System.out.println("HR");
		return employee;
	}
	
	public void work() {
		System.out.println("HR Employee");
	}
}
