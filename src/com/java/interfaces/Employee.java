package com.java.interfaces;

public class Employee implements Worker{

	protected int no;
	protected String name;
	protected int year;
	protected String department;
	
	public static final int BASE_SALARY=500;

	public Employee(int no, String name, int year, String department) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
	}
	
	public void printInfo() {
		System.out.println("no :"  +  no);
		System.out.println("name : " + name);
		System.out.println("year : " + year);
		System.out.println("department : " + department);
	}
	
	public int salary() {
		return year * BASE_SALARY + 100;
	}
	
	@Override
	public void work() {
		System.out.println("Employee working");
	}

	@Override
	public void parent() {
		System.out.println("Parent Employee");
	}

}
