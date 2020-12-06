package com.Classroom.abstrac2;

public class Rectangle extends Shape{
	private int side;
	private int side1;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+"Ãæ»ý:"+side*side1);
	}

	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(String name,int side, int side1) {
		super(name);
		this.side = side;
		this.side1 = side1;
	}
	
}
