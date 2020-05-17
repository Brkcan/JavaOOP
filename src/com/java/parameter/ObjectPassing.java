package com.java.parameter;

public class ObjectPassing {
	public static void main(String[] args) {
		
		ObjectPassing o = new ObjectPassing();
		
		W w = new W(3, false);
		o.f(w);
		System.out.println("main içi sys " + w.i + ' ' + w.b);
	}
	
	public void f(W objectW) {
		System.out.println(objectW);
		objectW.i = 5;
		objectW.b = true;
		W ww = new W(8, true);
		objectW = ww;
		objectW.i = 12;
		objectW.b  = false;
		System.out.println(objectW.i + "" + objectW.b);
	}

}


class W {
	int i;
	boolean b;
	
	public W(int i, boolean b) {
		this.i = i;
		this.b = b;
	}

	@Override
	public String toString() {
		return "W [i=" + i + ", b=" + b + "]";
	}
	
	
}