package com.java.polimo;

public class PayrallOffice {

	public void paySalary(Employee employee) {
		double salary = employee.salary();
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		PayrallOffice office = new  PayrallOffice();
		Employee employee = new Employee(1, "Burak", 3, "IT");
		office.paySalary(employee);
		
		Manager manager = new Manager(2, "can", 6, "ıt", "null");
		office.paySalary(manager);
	
	
		employee = manager;
		office.paySalary(employee);
	}

}
