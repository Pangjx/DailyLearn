package com.pjxpro.fengzhuang;

public class Fish extends Animal {

	public Fish(String name) {
		super(name, 0);
		// TODO Auto-generated constructor stub
	}
    public String getName(String name) {
       return this.getName();
    }
    public void setName(String name) {
        this.setName(name);
     }
    public int getLegs() {
		return super.getLegs();
	}
	public void setLegs(int legs) {
		this.setLegs(legs);
	}
	@Override
	public void move() {
		 System.out.print(this.getName()+"ÓĞ"+this.getLegs()+"ÌõÍÈÔÚ"+"swimming");
	}
	
    
}
