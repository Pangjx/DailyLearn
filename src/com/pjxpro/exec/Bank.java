package com.pjxpro.exec;

public class Bank {

	public void saveMoney(Card c, double money) {
		double newbalance = c.getBalance();
		newbalance += money;
		c.setBalance(newbalance);
		System.out.println("��ǰ�˻�:"+c.getNum());
		System.out.println("��Ǯ�ɹ���Ŀǰ���:" + c.getBalance());
	}

	public void withDrawMoney(Card c, double money) {

		if (c.getBalance() < money)
			System.out.println("�˻�����");
		else {
			double newbalance = c.getBalance();
			newbalance -= money;
			c.setBalance(newbalance);
			System.out.println("��ǰ�˻�:"+c.getNum());
			System.out.println("ȡǮ:" + money);
			System.out.println("ȡǮ�ɹ���Ŀǰ���:" + c.getBalance());
		}
	}

}
