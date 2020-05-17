package com.java.arrays;

public class MultiDimArray {
	
	static void prt(String s) {
		System.out.println(s);
	}
	static void prt(int i) {
		System.out.println(i);
	}
	
	
	
	public static void main(String[] args) {
		int[][] a = {{1, 2, 3}, {4, 5, 6, 7, 8}};
		
		int[][] b = new int[2][];
		b[0] = new int[3];
		b[1] = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				prt(" " +  "a[" + i + "][" + j + "]=" + " " + a[i][j]);
			}
		}
	}

}
