package com.md1104.neibulei;

public class Person {
    String name = "С��";
    public void eat() {
    	System.out.println("�˳Է�");
    }
    /*
     * BirdΪPerson���ڲ���
     */
    
    class Bird{
    	String name ="�ž�";
    	public void display(String name) {
    		System.out.println(name);
    		System.out.println(this.name);
    		System.out.println(Person.this.name);
    		
    	}
    }
    
    
}
