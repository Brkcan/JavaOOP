package com.java.composition;

public class Engine {

	private int volume;
	private int horsePower;
	
	
	public Engine(int volume, int horsePower) {
		this.volume = volume;
		this.horsePower = horsePower;
	}

	public void start() {
		System.out.println("Engine Start");
	}
	
	public void stop() {
		System.out.println("Engine stop");
	}

}
