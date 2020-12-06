package com.Classroom.jicheng;

public class Car extends Vehicle{ //轿车
    
	
	public Car(String name) {
		super(name);
		if(name=="宝马")
			super.setPrice(200);
		else if(name=="奔驰")
			super.setPrice(300);
		else if(name=="奥拓")
			super.setPrice(50);
		else 
			super.setPrice(0);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void maintain() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+"保养轿车：需要加油");
	}


	
	
  
  
}
