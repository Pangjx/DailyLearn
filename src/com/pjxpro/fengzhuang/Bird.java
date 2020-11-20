package com.pjxpro.fengzhuang;

public class Bird extends Animal{

	public Bird(String name) {
		super(name, 2);
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
			// TODO Auto-generated method stub
			super.move();
			 System.out.print(this.getName()+"ÓĞ"+this.getLegs()+"ÌõÍÈÔÚ"+"fly!!!");
		}
		
}
