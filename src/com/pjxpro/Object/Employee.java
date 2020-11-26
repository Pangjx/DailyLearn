package com.pjxpro.Object;
/*
 * 类名只能用public, abstract & final 修饰
 * 修饰符public>protected>private 
 * 子类重写父类的方法修饰符只能变大，不能变小。
 * 构造构造方法用 public, protected & private修饰
 * this或者super调用静态方法时 注意实例对象是否进入了内存
 *       类的加载，当使用一个类时，首先要加载这个类的字节码文件到内存，类变量和类方法随着类的加载进入内存
 *       对象的加载，对象是生成时才出现的
 *       实例方法是对象调用时才出现的
 *       一个类中如果有父类，先加载父类的；so Object是第一个进内存的
 */
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
