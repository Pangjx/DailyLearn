package com.Classroom.abstrac;

public class Cow extends Animal {

	
	public Cow() {
		super();
		
	}
	public Cow(String name) {
		super(name,4);
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"³ÔÄÛ²İ");
	}
	@Override
	public void move() {
		 System.out.print(this.getName()+"ÓĞ"+this.getLegs()+"ÌõÍÈÔÚ"+"¼²ÅÜ");
	}
  
}
