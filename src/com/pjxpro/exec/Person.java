package com.pjxpro.exec;
import java.util.*;
public class Person {
	private String name;
	private int yhcard;

	public Person(String name, int yhcard) {
		super();
		this.name = name;
		this.yhcard = yhcard;
	}

	public void check(Card c) {
		System.out.println(c.getBalance());
	}

	public void withDrawMoney(Card c) {
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		System.out.println("������Ҫȡ������Ǯ");
		double money=sc.nextDouble();
		b.withDrawMoney(c, money);
		

	}

	public void saveMoney(Card c) {
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		System.out.println("������Ҫ�������Ǯ");
		double money=sc.nextDouble();
		b.saveMoney(c, money);
	;
	}
}
