package com.Classroom.interfac;

public class Test {

	public static void main(String[] args) {
		Tank t = new Tank("��Ӱ̹��",100);
		t.attack();
	    t.move();
	    WuPlane W = new WuPlane("��ӥ��",200);
		W.attack();
	    W.move();
	    Weapon wp = new QianTing("��η��Ǳͧ",1000);
	    wp.attack();
	    wp.move();
	}

}
