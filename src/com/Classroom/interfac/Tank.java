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
		System.out.println(this.getName()+"�����ڵ�����ɵ���"+this.getAttackValue()+"�˺�");
		
	}

	@Override
	public void move() {
		System.out.println(this.getName()+"����ǰ��");
		
	}
	
	public void attack(int m){
		
	}

}
