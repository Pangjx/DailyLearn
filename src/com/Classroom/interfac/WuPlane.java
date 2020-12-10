package com.Classroom.interfac;

public class WuPlane extends Weapon{

	public WuPlane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WuPlane(String name, int attackValue) {
		super(name, attackValue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"发射导弹，造成敌人"+this.getAttackValue()+"伤害");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"空中飞行");
	}

}
