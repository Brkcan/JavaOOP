package com.java.polimo;

public class Directory extends Manager{
	
	protected int bonus;
	
	public static final int BASE_SALARY=500;


	public Directory(int no, String name, int year, String department, String departmentManaged, int bonus) {
		super(no, name, year, department, departmentManaged);
		this.bonus = bonus;
	}
	
	@Override
	public int salary() {
		return (super.salary() + bonus);
	}
	
}
