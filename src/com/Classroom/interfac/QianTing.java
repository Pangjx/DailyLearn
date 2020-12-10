package com.Classroom.interfac;

public class QianTing extends Weapon{
	private int deeps;
	
	
	public int getDeeps() {
		return deeps;
	}

	public void setDeeps(int deeps) {
		this.deeps = deeps;
	}
	
	public QianTing(String name, int attackValue, int deeps) {
		super(name, attackValue);
		this.deeps = deeps;
	}	

	public QianTing() {
		super();
	}

	public QianTing(String name, int attackValue) {
		super(name, attackValue);
	}

	@Override
	public void attack() {
		System.out.println(this.getName()+"击中海上目标，炸毁"+this.getAttackValue()+"艘船");
	}

	@Override
	public void move() {
		System.out.println(this.getName()+"海中潜行");
	}
	
	public void qian(){
		System.out.println(this.getName()+"潜入水底"+this.getDeeps()+"米");
	}

}
