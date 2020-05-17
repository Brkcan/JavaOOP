package com.java.enums;

public enum Size {

	SMALL("S", 1),MEDIUM("M",2),LARGE("L",3),EXTRA_LARGE("XL", 4);


	private String abbreviation;
	private int no;
	
	Size(String abbreviation, int no) {
		this.abbreviation = abbreviation;
		this.no = no;
	}
	
	public String getAbbreviation() {
		return abbreviation;
	}
	
	public int getNo() {
		return no;
	}
	
	public static void main(String[] args) {
		String s = Size.SMALL.name();
		System.out.println(s);
		int i = Size.LARGE.ordinal();
		System.out.println(i);
		
		int no1 = Size.MEDIUM.getNo();
		System.out.println(no1);
	}
}

