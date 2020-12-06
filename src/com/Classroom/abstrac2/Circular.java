package com.Classroom.abstrac2;

public class Circular extends Shape{
   private int side;

@Override
public void area() {
	// TODO Auto-generated method stub
	System.out.println(super.getName()+"Ãæ»ý:"+3.14*side*side);
}

public int getSide() {
	return side;
}

public void setSide(int side) {
	this.side = side;
}

public Circular() {
	super();
	// TODO Auto-generated constructor stub
}

public Circular(String name,int side) {
	super(name);
	this.side = side;
}
   
}
