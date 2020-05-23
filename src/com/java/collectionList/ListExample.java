package com.java.collectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		
		List list = new ArrayList(10);
		list.add(3);
		list.add("Burak");
		list.add("Veli");
		list.add(3);
		
		
		System.out.println(list.contains("Burak"));
		System.out.println(list.get(2));
		System.out.println(list.indexOf(3));
		System.out.println(list.lastIndexOf(3));
		
		list.set(2, 9);
		System.out.println(list.get(2));
		
		System.out.println("------------");
		
		
		ListIterator iter = list.listIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("------------");

		while(iter.hasPrevious()) {
			System.out.println(iter.previous());
		}
	}
}
