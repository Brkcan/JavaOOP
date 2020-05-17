package com.java.ifadeler;

public class BreakAndContinuewithLabelDemo {

	public static void main(String[] args) {
		
		int[][] arrayOfInts = {{32, 87, 3, 589}, {12, 1076, 2000, 12}, {622, 127, 12, 955}};
		int searchfor = 12;
		
		int i = 0;
		int j = 0;
		boolean foundIt = false;
		
		search: for (; i < arrayOfInts.length; i++) {
			System.out.println(arrayOfInts.length);
			for (j=0; j < arrayOfInts[i].length; j++) {
				System.out.println(arrayOfInts[i].length);
				if(arrayOfInts[i][j]  == searchfor) {
					foundIt = true;
					System.out.println(searchfor + " " + "i : " + i +" " + "j : " +  j);
					break search;
				}
			}
		}
	}
}
