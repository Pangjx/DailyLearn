package com.Classroom.jicheng;

public class ElectricVehicle extends Vehicle{

	public ElectricVehicle(String name) {
		super(name);
		if(name=="�ŵ�")
			super.setPrice(20);
		else if(name=="����")
			super.setPrice(50);
		else if(name=="����")
			super.setPrice(80);
		else 
			super.setPrice(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	void maintain() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+"�����綯������Ҫ��̥");
	}

}
