package com.Classroom.abstrac;

public class cow extends Animal {

	
	public cow() {
		super();
		
	}
	public cow(String name) {
		super(name,4);
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"���۲�");
	}
	@Override
	public void move() {
		 System.out.print(this.getName()+"��"+this.getLegs()+"������"+"����");
	}
  
}
