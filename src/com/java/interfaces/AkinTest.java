package com.java.interfaces;

public class AkinTest {
	
	public static void main(String[] args) {
	
		
		Akin akin4 = new  AkinJavaEgitmeni();
		akin4.say();
		
		
		
		Akin akin = new Akin();
		AkinJavaEgitmeni akinJavaEgitmeni = new AkinJavaEgitmeni();
		akin = akinJavaEgitmeni;
		
			if(akin instanceof AkinJavaEgitmeni) {
			AkinJavaEgitmeni egitmeni = (AkinJavaEgitmeni) akin;
			egitmeni.javaAnlat();
			
		}
		
	}

}
