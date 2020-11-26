package com.pjxpro.fengzhuang;

import java.util.ArrayList;
/*
 * 继承时父子不同包，子类可以继承父类的public、protected修饰的变量和方法
 * 父子同包，子类可以继承父类非私有的变量和方法
 */
public class zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Animal> list =new ArrayList<Animal>();
         Bird   yingwu  = new Bird("鹦鹉");
         Bird   dayan   = new Bird("大雁");
         Fish   jinyu  = new Fish("金鱼");
         Fish  jinli = new Fish("锦鲤");
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
