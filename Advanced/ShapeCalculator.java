/*
Problem 9: Shape Calculator
File Name: ShapeCalc.java
Package Name: problems_w3_v2
Create a base class:
	Shape
and a child class:
	Circle
The circle should calculate its area using Java's Math.PI.
Create a circle object and display its area.
Follow-up :
Add another child class:
	Rectangle
Use the same Shape parent class.
Calculate the area of both shapes.

Concepts:
	Inheritance
	Java API
	Math.PI
*/

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

public class ShapeCalculator {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(12, 45);
		System.out.println("Area of Rectangle: " + rectangle.getArea());
		
		Circle circle = new Circle(12);
		System.out.println("Area of Circle: " + circle.getArea());
	}
}
