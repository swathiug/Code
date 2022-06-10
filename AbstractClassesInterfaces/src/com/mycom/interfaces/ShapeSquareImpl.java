package com.mycom.interfaces;

public class ShapeSquareImpl implements IShape{
	int side, area, perimeter;
	
	public ShapeSquareImpl() {
		side = 6;
	}

	@Override
	public void computeArea() {
		area = side * side;
		
	}

	@Override
	public void computePerimeter() {
		perimeter = 4 * side;
		
	}

	@Override
	public void showArea() {
		System.out.println("Area of square = " + area);
		
	}
	

}
