package com.java.abstracts;

public class Manager extends Employee{
	
	private String departmentManaged;
	
	public Manager(int no, String name, int year, String department, String departmentManaged) {
		super(no, name, year, department);
		this.departmentManaged = department;
	}

	@Override
	public void work() {
		System.out.println("manager work");
	}

	
}
