package com.java.abstracts;

public class Test {

	public static void main(String[] args) {
		Manager manager = new Manager(1);
		manager.printInfo();
		manager.work();
		
		
		Directory directory = new Directory(2);
		directory.printInfo();
		directory.work();
		
		System.out.println("-------------");
		
		Employee employee = new Manager(6, "Burak", 10, "IT", "IT");
		System.out.println(employee.getName());
	}
}
