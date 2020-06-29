package com.java.downcast;

public class Directory extends Manager{
	
	protected int bonus;
	
	public static final int BASE_SALARY=500;

	public Directory() {
	}

	public Directory(int no, String name, int year, String department, String departmentManaged, int bonus) {
		super(no, name, year, department, departmentManaged); 
		this.bonus = bonus;
	}
	
	@Override
	public int salary() {
		return (super.salary() + bonus);
	}
	
	public void directoryInfo() {
		System.out.println("Directory Info : ");
	}
	
	public void work() {
		System.out.println("Directory");
	}

}
