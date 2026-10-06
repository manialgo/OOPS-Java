/*
Problem 8: Vehicle Hierarchy
Package Name: problems_w3_v2
File Name: Car.java
To Create:
Vehicle (main class)
   ↓
  Car   (sub class)
Vehicle should contain:
	brand
	speed
Car should contain:
	numberOfDoors
Create a Car object and display all information.
Focus: Basic inheritance
*/

package problems_w3_v2;

class Vehicle {
    private String brand;
    private double speed;
    
    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }
    
    public String getBrand() {
    	return brand;
    }
    
    public double getSpeed() {
    	return speed;
    }
}

public class Car extends Vehicle{
	private int numberOfDoors;
	
	public Car(String brand, double speed, int numberOfDoors) {
		super(brand, speed);
		this.numberOfDoors = numberOfDoors;
	}

	public void display() {
    	System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Number Of Doors: " + numberOfDoors);
    }
    
	public static void main(String[] args) {
		Car subClass = new Car("BMW", 125.25, 5);
		
		subClass.display();
	}
}
