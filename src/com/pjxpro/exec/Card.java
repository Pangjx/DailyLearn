package com.pjxpro.exec;

public class Card {
	private double balance;
	private int num;
	private int pass;

	public Card() {
	}

	public Card(int num, int pass, double balance) {
		super();
		this.balance = balance;
		this.num = num;
		this.pass = pass;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	// public void saveMoney(Card c,double money){
	// this.balance+=money;
	// }
	//
	// public int withDrawMoney(double money){
	// if(balance<money)
	// return 0;
	// else{
	// balance=balance-money;
	// return 1;
	// }
	// }
	//
}
