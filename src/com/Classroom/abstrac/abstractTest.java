package com.Classroom.abstrac;

import java.util.ArrayList;


public class abstractTest {
	public static void main(String[] args) {
  ArrayList<Animal> list =new ArrayList<Animal>();
  Bird   yingwu  = new Bird("����");
  Bird   dayan   = new Bird("����");
  Fish   jinyu  = new Fish("����");
  Fish  jinli = new Fish("����");
  cow  niu = new cow("��ţ");
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
