package com.pjxpro.Object;
import java.util.Scanner;
public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out .println("请输入三个员工的名字、年龄、职位");
		Employee emp1 = new Employee(sc.next(), sc.nextInt(), sc.next());
		Employee emp2 = new Employee(sc.next(), sc.nextInt(), sc.next());
		Employee emp3 = new Employee(sc.next(), sc.nextInt(), sc.next());
		
	}

}
