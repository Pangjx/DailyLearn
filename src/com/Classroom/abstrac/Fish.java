package com.Classroom.abstrac;

public class Fish extends Animal {

	public Fish(String name) {
		super(name,0);
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
		 System.out.print(this.getName()+"有"+this.getLegs()+"条腿在"+"swimming");
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"吃虾米");
	}
	
    
}
