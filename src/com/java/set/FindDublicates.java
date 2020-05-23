package com.java.set;

import java.util.HashSet;
import java.util.Set;

public class FindDublicates {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i = 0; i < args.length; i++) {
			if(!set.add(args[i])) {
				System.out.println("duplicates: " + args[i]);
				set.remove(i);

			}
			System.out.println(args[i]);

		}
		
	}
}
