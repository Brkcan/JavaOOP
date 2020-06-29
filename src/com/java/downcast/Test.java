package com.java.downcast;

public class Test {

	public static void main(String[] args) {
		
		PayrallOffice office = new PayrallOffice();
		
//		Employee e = new Manager();
//		Manager m = (Manager) e;
//		m.manage();

		
		Employee e2 =  new Manager();
		e2.employeeInfo(); 
		if(e2 instanceof Manager) {
			Manager m2 = (Manager) e2;
			m2.manage();
		}
		
		
		Directory directory = new Directory();
		office.paySalary(directory);
		
		
		System.out.println("-----------------");
		
		Employee employee = new Employee();
		office.paySalary(employee);
	}

}
