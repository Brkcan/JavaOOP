package com.java.car;

import java.util.ArrayList;
import java.util.List;

public class TestAttributeOnluComposite {

	public static void main(String[] args) {
		
		List<PersonAttributeOnlyComposite> list = new ArrayList<PersonAttributeOnlyComposite>();
		
		PersonAttributeOnlyComposite person1 = new PersonAttributeOnlyComposite();
		person1.tckn = "1";
		person1.firstName = "Burak";
		person1.lastName = "Can";
		
		CarAttributeOnlyComposite car1 = new CarAttributeOnlyComposite();
		car1.make = "mercedes";
		car1.model = "E2000";
		car1.year = "2011";
		car1.distance = 299;
		car1.speed = 3000;
		
		CarAttributeOnlyComposite car2 = new CarAttributeOnlyComposite();
		car2.make = "BMW";
		car2.model = "E2000";
		car2.year = "2011";
		car2.distance = 299;
		car2.speed = 3000;
		
		
		person1.car =  car1;
		person1.car =  car2;
		car1.owner = person1;
		
		System.out.println(person1.car.make);
		System.out.println(car1.owner.firstName);
	}
	
}
