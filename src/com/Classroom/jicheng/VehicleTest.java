package com.Classroom.jicheng;

import java.util.ArrayList;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person p = new Person("王先生");
      ArrayList<Vehicle> arry= new ArrayList();
      arry.add(new Car("宝马"));
      arry.add(new Car("奔驰"));
      arry.add(new Car("奥拓"));
      arry.add(new Car("长安"));
      arry.add(new Car("五菱"));
//      VehicleCompany vm = new VehicleCompany();
//      Vehicle  s[]  = new Vehicle[5];
//        s[0] = new Car("宝马");
//        s[1] = new Car("奔驰");
//        s[2] = new Car("奥拓");
//        s[3] = new Car("长安");
//        s[4] = new Bus("五菱");
       for(int i=0;i<5;i++){
//        vm.rental(p,s[i], 3);
       }
      
	}

}
