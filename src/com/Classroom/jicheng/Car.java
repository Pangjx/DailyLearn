package com.Classroom.jicheng;

public class Car extends Vehicle{ //�γ�
    
	
	public Car(String name) {
		super(name);
		if(name=="����")
			super.setPrice(200);
		else if(name=="����")
			super.setPrice(300);
		else if(name=="����")
			super.setPrice(50);
		else 
			super.setPrice(0);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void maintain() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+"�����γ�����Ҫ����");
	}


	
	
  
  
}
