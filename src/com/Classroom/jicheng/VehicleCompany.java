package com.Classroom.jicheng;

public class VehicleCompany {
	public void rental(Person p,Vehicle v,int d){
		if(v instanceof Bus || v instanceof Car || v instanceof ElectricVehicle)
		{
	    System.out.println(p.getName()+"��"+v.getName()+d+"��"+"һ����Ҫ"+v.getPrice()*d+"Ԫ");
		v.maintain();
		}
	}
}
