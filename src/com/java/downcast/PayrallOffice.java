package com.java.downcast;

public class PayrallOffice {
	
	public void paySalary(Employee employee) {
		if(employee instanceof Directory) {
			System.out.println("Hosgeldiniz efendim :) ");
		}
		double salary = employee.salary();
		System.out.println(salary + " " + employee.getName());
	}

}
