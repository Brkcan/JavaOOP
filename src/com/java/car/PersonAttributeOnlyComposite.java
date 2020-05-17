package com.java.car;

import java.util.List;

public class PersonAttributeOnlyComposite {

	protected String tckn;
	protected String firstName;
	protected String lastName;
	
	CarAttributeOnlyComposite car;

	@Override
	public String toString() {
		return "PersonAttributeOnlyComposite [tckn=" + tckn + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", car=" + car + "]";
	}

	
	
}
