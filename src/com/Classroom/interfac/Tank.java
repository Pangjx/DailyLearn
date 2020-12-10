package com.Classroom.interfac;

public class Tank extends Weapon{

	
	public Tank() {
		super();
	}

	public Tank(String name, int attackValue) {
		super(name, attackValue);
	}

	@Override
	public void attack() {
		System.out.println(this.getName()+"发射炮弹，造成敌人"+this.getAttackValue()+"伤害");
		
	}

	@Override
	public void move() {
		System.out.println(this.getName()+"开动前进");
		
	}
	
	public void attack(int m){
		
	}

}
