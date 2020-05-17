package com.java.factory;

public class Manager extends Employee{
	
	private String departmentManaged;
	
	public Manager(int no, String name, int year, String department, String departmentManaged) {
		super(no, name, year, department);
		this.departmentManaged = department;
	}

	
}
