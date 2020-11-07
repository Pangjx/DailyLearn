package com.p30.exer;

public class ComparableCircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparableCircle c1 = new ComparableCircle(3.4);   // 测试方法接触不到实例类，可以通过对象的super传入circle
		ComparableCircle c2 = new ComparableCircle(3.4);
		int compareValue = c1.compareTo(c2);
		if (compareValue > 0) {
			System.out.print("C1对象大");
		} else if (compareValue < 0) {
			System.out.print("C2对象大");
		} else {
			System.out.print("c1和c2对象一样大");
		}
	} 

}
