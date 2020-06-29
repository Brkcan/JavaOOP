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
		
		Directory director = new Directory(3, "Test", 3, "It", "It", 4000);
		office.paySalary(director);
	
		Manager maneger3 = new Directory(3, "Test", 10, "It", "It", 4000);
		office.paySalary(maneger3);
		
		employee = manager;
		office.paySalary(employee);
		
		
		System.out.println("-----HR------");
		
		HR hr = new HR();
		Employee e = hr.getEmployee();
		e.work();
		
		System.out.println("-------------------------");
		
		Employee employee2 = new Directory(3, "Test", 3, "It", "It", 4000);
		System.out.println(employee2.salary());
		employee2.employeeInfo();
		if(employee2 instanceof Directory) {
			Directory directory2 = (Directory) employee2;
			directory2.directoryInfo();
		}
	}

}
