package com.java.enums;

public enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	
	
	public static void main(String[] args) {
		String nameOfDay = Day.FRIDAY.name();
		System.out.println(nameOfDay);
		
		int ordinal = Day.TUESDAY.ordinal();
		System.out.println(ordinal);
		
		
		Day[] day = Day.values();
		for(Day days : day) {
			System.out.println(days);
			
			
		System.out.println("****************");
		
		System.out.println(Day.MONDAY.toString());
		
		boolean b1 = Day.MONDAY == Day.MONDAY;
		System.out.println(b1);
		
		boolean b2 = Day.MONDAY == Day.TUESDAY;
		System.out.println(b2);
		}
	}
}
