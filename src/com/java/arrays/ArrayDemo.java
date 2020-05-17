package com.java.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {

	int[] intArray = new int[10];
	Pizza[] pizzalar = new Pizza[3];
	boolean[] flags = {true, false};
	Random r = new Random();

	
	public ArrayDemo() {
		for (int i = 0; i < intArray.length; i++) {
			int random = r.nextInt();
			int sayi = random % 100;
			intArray[i] = sayi;
		}
		pizzalar[0] = new  Pizza("Peynirli");
		pizzalar[1] = new  Pizza("Sucuklu");
		pizzalar[2] = new  Pizza("Sebzeli");
	}
	
	public void print(int[] copy) {
		//System.out.println(intArray[5]);
		System.out.println(flags[1]);
		System.out.println(pizzalar[2].name);
		for (int i = 0; i < copy.length; i++) {
			System.err.println(copy[i] );
		}
	}
	
	public static void main(String[] args) {
		ArrayDemo arrayDemo = new ArrayDemo();
		//arrayDemo.copy();
		//arrayDemo.copyRange();
		//arrayDemo.search(3);
		arrayDemo.sort();
	}
	public void copy() {
		System.out.println("\nCopying the range of the array : ");
		int[] copy = Arrays.copyOf(intArray, 6);
		print(copy);
	}
	public void copyRange() {
		System.out.println("\nCopying the rage of the array : ");
		int[] copy = Arrays.copyOfRange(intArray, 0, 3);
		print(copy);
	}
	
	public void search(int key) {
		System.out.println("\nSearching in array ");
		int index = Arrays.binarySearch(intArray, key);
		//System.out.println("Index of " +key+ ":" + index);
	}
	
	
	public void sort() {
		System.out.println("\n SORTİNG AN ARRAY");
		Arrays.sort(intArray);
		print(intArray);
	}
	
	
	
}
