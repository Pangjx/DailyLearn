package com.p30.exer;

public class ComparableCircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparableCircle c1 = new ComparableCircle(3.4);   // ���Է����Ӵ�����ʵ���࣬����ͨ�������super����circle
		ComparableCircle c2 = new ComparableCircle(3.4);
		int compareValue = c1.compareTo(c2);
		if (compareValue > 0) {
			System.out.print("C1�����");
		} else if (compareValue < 0) {
			System.out.print("C2�����");
		} else {
			System.out.print("c1��c2����һ����");
		}
	} 

}
