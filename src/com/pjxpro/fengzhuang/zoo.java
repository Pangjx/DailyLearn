package com.pjxpro.fengzhuang;

import java.util.ArrayList;

public class zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Animal> list =new ArrayList<Animal>();
         Bird   yingwu  = new Bird("ğĞğÄ");
         Bird   dayan   = new Bird("´óÑã");
         Fish   jinyu  = new Fish("½ğÓã");
         Fish  jinli = new Fish("½õÀğ");
         list.add(yingwu);
         list.add(dayan);
         list.add(jinyu);
         list.add(jinli);
         for(Animal a: list) {
        	 a.move();
        	 System.out.println();
         }
	}

}
