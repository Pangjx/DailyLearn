package com.pjxpro.exec;
import java.util.*;
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner  sc = new Scanner(System.in);
		Person p = new Person("ÀèÃ÷", 123456);
		Card c = new Card(123456, 123456, 100000);
		
		
		char n='0';
		boolean flag=true;
		while(flag){
			n =sc.next().charAt(0);
		switch(n){
		case '1':p.check(c); break;
		case '2':p.withDrawMoney(c);break;
		case '3':p.saveMoney(c);break;
		default : flag=false;
		}
	}
	}

}
