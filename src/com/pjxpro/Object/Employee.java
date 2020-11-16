package com.pjxpro.Object;

public class Employee {
	private String name;
	private int age;
	private String position;
	private int salary;

	public Employee(String name, int age, String position) {
		super();
		this.name = name;
		this.age = age;
		
		if (position.equals("售后服务") || position.equals("销售员"))
			this.position = position;
		else
			this.position = "售后服务";

		if (this.age >= 18 && this.age <= 20)
			this.salary = 1000;
		else if (this.age <= 25)
			this.salary = 1500;
		else if (this.age <= 30)
			this.salary = 2000;
		else if (this.age <= 40)
			this.salary = 3000;
		else if (this.age <= 50)
			this.salary = 3500;
		else
			this.salary = 4000;
	  System.out.println("姓名:"+this.name+"\n"+"职位:"+this.position+"\n"+"工资:"+this.salary);
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
	
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {

	}

}
