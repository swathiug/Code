package com.mycom.abstractclasses;

public abstract class Shape {
	
	float area;
	public abstract void computeArea(); // abstract method
	
	public void showArea() {
		System.out.println("Area = " + area);
	}
}
