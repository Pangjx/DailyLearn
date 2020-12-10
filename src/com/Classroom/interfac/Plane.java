package com.Classroom.interfac;

public class Plane extends Weapon{

	
	public Plane() {
		super();
	}

	public Plane(String name, int attackValue) {
		super(name, attackValue);
	}

	@Override
	public void attack() {
		System.out.println(this.getName()+"轰炸目标，造成敌人"+this.getAttackValue()+"的伤害");
		
	}

	@Override
	public void move() {
		System.out.println(this.getName()+"天空飞行");
	}

}
