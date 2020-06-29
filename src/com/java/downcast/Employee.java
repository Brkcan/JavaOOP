package com.java.downcast;

public class Employee implements Comparable{

	protected int no;
	protected String name;
	protected int year;
	protected String department;
	
	public static final int BASE_SALARY=500;

	public Employee() {
		super();
	}

	public Employee(int no, String name, int year, String department) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public void employeeInfo() {
		System.out.println("Employee Info  : ");
	}
	
	public void work() {
		System.out.println("Employee");
	}

	@Override
	public int compareTo(Object o) {
		Employee other = (Employee) o;
		int result = 0;
		if(no == other.no)
			result = 0;
		else if(no < other.no)
			result = -1;
		else 
			result = 1;
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + no;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (no != other.no)
			return false;
		return true;
	}
	
	
}
