package com.Classroom.interfac;

public class Test {

	public static void main(String[] args) {
		Tank t = new Tank("»ÃÓ°Ì¹¿Ë",100);
		t.attack();
	    t.move();
	    WuPlane W = new WuPlane("ºÚÓ¥»ú",200);
		W.attack();
	    W.move();
	    Weapon wp = new QianTing("ÎÞÎ·ºÅÇ±Í§",1000);
	    wp.attack();
	    wp.move();
	}

}
