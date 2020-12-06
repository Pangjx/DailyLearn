package com.Classroom.jicheng;

public class Bus extends Vehicle{
	
	public Bus(String name) {
		super(name);
		if(name=="五菱")
			super.setPrice(800);
		else if(name=="长安")
			super.setPrice(1500);
		else 
			super.setPrice(0);
		// TODO Auto-generated constructor stub
	}
	@Override
	void maintain() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+"保养客车：需要清洁");
	}
     
}
