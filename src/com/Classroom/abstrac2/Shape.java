package com.Classroom.abstrac2;

public abstract class Shape {
	private String name;
	abstract void area();
   
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Shape() {
	super();
}
public Shape(String name) {
	super();
	this.name = name;
};
   
}
