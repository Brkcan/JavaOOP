package com.java.init;

public class InitializerBlocks {

	int i;
	{
		i = 8;
	}
	
	public static void main(String[] args) {
		
		InitializerBlocks initializerBlocks = new InitializerBlocks();
		int k = initializerBlocks.i;
		System.out.println(k);
	}
}
