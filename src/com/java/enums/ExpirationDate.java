package com.java.enums;

public class ExpirationDate {

	private Month month;
	private String year;
	
	public ExpirationDate(Month month, String year) {
		super();
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "ExpirationDate [month=" + month + ", year=" + year + "]";
	}
	
	
}
