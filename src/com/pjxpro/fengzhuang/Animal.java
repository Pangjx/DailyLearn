package com.pjxpro.fengzhuang;

public  class Animal {
      private String name;
      private int legs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public Animal(String name, int legs) {
		super();
		this.name = name;
		this.legs = legs;
	}
	public  Animal() {
		this.name = "AAA";
		this.legs = 4;
	}
	public void move(){
     System.out.print(this.name+"Moving");
	}
     public void move(int n){
    	 while(n--!=0){
    		 System.out.print(this.name+"Moving");
    	 }
		
	}
	
      
}
