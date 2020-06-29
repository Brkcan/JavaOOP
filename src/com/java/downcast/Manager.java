package com.java.downcast;

public class Manager extends Employee{
	
	private String departmentManaged;
	
	public Manager() {
	}

	public Manager(int no, String name, int year, String department, String departmentManaged) {
		super(no, name, year, department);
		this.departmentManaged = department;
	}

	public void work() {
		System.out.println("Manager");
	}
	
	public void manage() {
		System.out.println("Manage");
	}

}
