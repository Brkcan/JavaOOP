package com.java.object;

public class Product {
	
	private int no;
	private String name;
	private double price;

	public Product(int no, String name, double price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (no != other.no)
			return false;
		return true;
	}






	@Override
	public String toString() {
		return "Product [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
