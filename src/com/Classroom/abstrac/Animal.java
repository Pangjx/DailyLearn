package com.Classroom.abstrac;

public abstract class Animal {
	private String name;
	private int legs;
	
     public String getName() {
		return name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal() {
		super();
	}


	public Animal(String name, int legs) {
		super();
		this.name = name;
		this.legs = legs;
	}

	abstract void eat();

	abstract void move();
}
