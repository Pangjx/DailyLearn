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
		System.out.println(this.getName()+"��ըĿ�꣬��ɵ���"+this.getAttackValue()+"���˺�");
		
	}

	@Override
	public void move() {
		System.out.println(this.getName()+"��շ���");
	}

}
