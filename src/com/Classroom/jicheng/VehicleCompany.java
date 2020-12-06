package com.Classroom.jicheng;

public class VehicleCompany {
	public void rental(Person p,Vehicle v,int d){
		if(v instanceof Bus || v instanceof Car || v instanceof ElectricVehicle)
		{
	    System.out.println(p.getName()+"租"+v.getName()+d+"天"+"一共需要"+v.getPrice()*d+"元");
		v.maintain();
		}
	}
}
