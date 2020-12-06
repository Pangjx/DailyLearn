package com.Classroom.jicheng;

public abstract class Vehicle {
	private String name;
	private int price;
	abstract void maintain();  //Î¬»¤
	
	public Vehicle(String name) {
		super();
		this.name = name;
	}

	public Vehicle() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
