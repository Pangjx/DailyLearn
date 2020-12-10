package com.Classroom.interfac;

public abstract class Weapon {
	private String name;
	private int attackValue;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAttackValue() {
		return attackValue;
	}
	
	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
	}
	
	public Weapon(String name, int attackValue) {
		super();
		this.name = name;
		this.attackValue = attackValue;
	}
	
	public Weapon() {
		super();
	}
	
	public abstract void attack();
	public abstract void move();
	
	public void changeValue(int m){
		this.attackValue = this.attackValue-m;
	}
	
}
