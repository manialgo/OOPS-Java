// PROBLEM NUMBER 9

package problems_w3_v2;

import java.lang.Math;

class Shape {
	public double getArea() {
		return 0.0;
	}
}

class Rectangle extends Shape{
	private int length;
	private int width;
	
	Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	@Override	
	public double getArea() {
		return length * width;
	}
}

class Circle extends Shape{
	private int radius;
	
	Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
}

public class ShapeCalc {
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(12, 45);
		System.out.println("Area of Rectangle: " + rectangle.getArea());
		
		Circle circle = new Circle(12);
		System.out.println("Area of Circle: " + circle.getArea());
	}
	
}