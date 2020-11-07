package com.pjxpro.exec;

public class Bank {

	public void saveMoney(Card c, double money) {
		double newbalance = c.getBalance();
		newbalance += money;
		c.setBalance(newbalance);
		System.out.println("当前账户:"+c.getNum());
		System.out.println("存钱成功，目前余额:" + c.getBalance());
	}

	public void withDrawMoney(Card c, double money) {

		if (c.getBalance() < money)
			System.out.println("账户余额不足");
		else {
			double newbalance = c.getBalance();
			newbalance -= money;
			c.setBalance(newbalance);
			System.out.println("当前账户:"+c.getNum());
			System.out.println("取钱:" + money);
			System.out.println("取钱成功，目前余额:" + c.getBalance());
		}
	}

}
