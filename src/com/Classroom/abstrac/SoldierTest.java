package com.Classroom.abstrac;

import java.util.ArrayList;

public class SoldierTest {
	public static void main(String[] args) {
	ArrayList<Soldier> list =new ArrayList<Soldier>();
	SoldierAir   kong  = new SoldierAir();
	SoldierCavalry   qi   = new SoldierCavalry();
	SoldierInfantry   bu  = new SoldierInfantry();
	SoldierTank  tank = new SoldierTank();
	list.add(kong);
	list.add(qi);
	list.add(bu);
	list.add(tank);
	  for(Soldier a:list) {
		  a.forward();
	 	 a.attack();
	 	 a.eat();
	 	 System.out.println();
}
}
}
