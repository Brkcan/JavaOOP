package com.java.factory;

public class Test {
	
	public static void main(String[] args) {
		Employee employee = new Employee(1, "burak", 6, "IT");
		int salary = employee.salary();
		System.out.println("salary :  " + salary);
		employee.printInfo();
		
		System.out.println("************************");
		
		Manager manager = new Manager(2, "Burak", 3, "IT", "Müdür");
		int salaryManager = manager.salary();
		System.out.println(salaryManager);
		manager.printInfo();
		
		System.out.println("************************");
		
		Directory directory = new Directory(3, "burak", 1, "IT", "IT", 3000);
		int salaryDirectory = directory.salary();
		System.out.println(salaryDirectory);
		directory.printInfo();
	}

}
