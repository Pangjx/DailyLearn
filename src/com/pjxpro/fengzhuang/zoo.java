package com.pjxpro.fengzhuang;

import java.util.ArrayList;
/*
 * �̳�ʱ���Ӳ�ͬ����������Լ̳и����public��protected���εı����ͷ���
 * ����ͬ����������Լ̳и����˽�еı����ͷ���
 */
public class zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Animal> list =new ArrayList<Animal>();
         Bird   yingwu  = new Bird("����");
         Bird   dayan   = new Bird("����");
         Fish   jinyu  = new Fish("����");
         Fish  jinli = new Fish("����");
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
