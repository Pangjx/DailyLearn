package com.Classroom.abstrac2;

public class Triangle extends Shape{
	private int side;
	private int side1;
	private int side2;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		if(side+side1>side2 &&side1+side2>side&&side2+side>side1){
		System.out.print(super.getName()+"面积:");
		System.out.printf("%.2f",Math.sqrt((side+side1+side2)*(side1+side2-side)*(side+side-side1)*(side+side1-side2))/3);
		System.out.println();
		}else
			System.out.println("构不成三角形");
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
	
	public Triangle(String name,int side, int side1, int side2) {
		super(name);
		this.side = side;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
