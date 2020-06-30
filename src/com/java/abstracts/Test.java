package com.java.abstracts;

public class Test {

	public static void main(String[] args) {
		Manager manager = new Manager(1);
		manager.printInfo();
		manager.work();
		
		
		Directory directory = new Directory(2);
		directory.printInfo();
		directory.work();
	}
}
