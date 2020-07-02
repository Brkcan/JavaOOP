package com.java.abstracts;

public abstract class Employee {

	protected int no;
	protected String name;
	protected int year;
	protected String department;
	
	public static final int BASE_SALARY=500;

	
	public Employee(int no) {
		this.no = no;
	}

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
	public abstract void work();

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	
}
