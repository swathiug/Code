package com.mycom.abstractclasses;

public class Circle extends Shape{
	private float radius;

	@Override
	public void computeArea() {
		radius = 3.141f;
		area = (float)Math.PI * radius * radius;
		
	}

}
