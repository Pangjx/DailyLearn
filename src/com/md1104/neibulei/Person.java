package com.md1104.neibulei;

public class Person {
    String name = "小明";
    public void eat() {
    	System.out.println("人吃饭");
    }
    /*
     * Bird为Person的内部类
     */
    
    class Bird{
    	String name ="杜鹃";
    	public void display(String name) {
    		System.out.println(name);
    		System.out.println(this.name);
    		System.out.println(Person.this.name);
    		
    	}
    }
    
    
}
