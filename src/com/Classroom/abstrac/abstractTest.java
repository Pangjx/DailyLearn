package com.Classroom.abstrac;

import java.util.ArrayList;


public class abstractTest {
	public static void main(String[] args) {
  ArrayList<Animal> list =new ArrayList<Animal>();
  Bird   yingwu  = new Bird("ğĞğÄ");
  Bird   dayan   = new Bird("´óÑã");
  Fish   jinyu  = new Fish("½ğÓã");
  Fish  jinli = new Fish("½õÀğ");
  cow  niu = new cow("ÀÏÅ£");
  list.add(yingwu);
  list.add(dayan);
  list.add(jinyu);
  list.add(jinli);
  list.add(niu);
  for(Animal a: list) {
 	 a.move();
 	 a.eat();
 	 System.out.println();
  }
	}
}
