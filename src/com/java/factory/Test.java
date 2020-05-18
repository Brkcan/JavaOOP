package com.java.factory;

public class Test {
	
	public static void main(String[] args) {
		Employee employee = new Employee(1, "burak", 6, "IT");
		int salary = employee.salary();
		employee.work();
		System.out.println("salary :  " + salary);
		employee.printInfo();
		
		System.out.println("************************");
		
		Manager manager = new Manager(2, "Burak", 3, "IT", "Müdür");
		int salaryManager = manager.salary();
		System.out.println(salaryManager);
		manager.work();
		manager.printInfo();
		
		System.out.println("************************");
		
		Directory directory = new Directory(3, "burak", 1, "IT", "IT", 3000);
		int salaryDirectory = directory.salary();
		System.out.println(salaryDirectory);
		directory.printInfo();
		
		System.out.println("????????????????");
		
		employee = new Manager(2, "Burak", 3, "IT", "Müdür");
		employee.work();
		
		System.out.println("------------------");
		
		Employee employee3 = new Employee(1, "burak", 6, "IT");
		Manager manager3 = null;
		if(employee3 instanceof Directory) {
			Directory manager4 = (Directory) employee3;
			manager4.work();
		}
		System.out.println("000000000");
		
		System.out.println("??????????????????");
		HR hr = new HR(salaryDirectory, null, salaryDirectory, null);
		Employee employee2 = hr.getAnEmployee();
		for(int i = 0; i < 5; i++) {
			employee2.work();
		}
	}

}
