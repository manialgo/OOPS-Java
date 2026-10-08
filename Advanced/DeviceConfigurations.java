/*
Problem 15: Smart Device
Package Name: programs_w3_v2
File Name: DeviceConfigurations.java
Create an abstract class:
  Device
with:
  abstract void start();
Create a child class:
  SmartPhone
Inside SmartPhone, create an inner class:
  Battery
The battery should contain:
  capacity
  percentage
The SmartPhone should implement start() and display battery information using the inner class.
Follow-up
Add another device:
  Laptop
and give it its own inner Battery class.
Concepts:
  Abstraction
  Inheritance
  Inner classes
*/

package programs_w3_v2;

abstract class Device {
	abstract void start();
}

class SmartPhone extends Device{
	class Battery {
		private double capacity;
		private double percentage;
		
		Battery(double capacity, double percentage) {
			this.capacity = capacity;
			this.percentage = percentage;
		}
		
		public void displayBattery() {
			System.out.println("Capacity: " + this.capacity + " mAh");
			System.out.println("Percentage: " + this.percentage + " %");
			System.out.println();
		}
	}

	private Battery battery;
	
	SmartPhone(double capacity, double percentage) {
		this.battery = new Battery(capacity, percentage);
	}
	
	@Override
	public void start() {
		System.out.println("=== Smart Phone Loading ===");
		battery.displayBattery();
	}
}

class Laptop extends Device {
	class Battery {
		private double capacity;
		private double percentage;
		
		Battery(double capacity, double percentage) {
			this.capacity = capacity;
			this.percentage = percentage;
		}
		
		public void displayBattery() {
			System.out.println("Capacity: " + this.capacity + " mAh");
			System.out.println("Percentage: " + this.percentage + " %");
			System.out.println();
		}
	}
	
	private Battery battery;
	
	public Laptop(double capacity, double percentage) {
		this.battery = new Battery(capacity, percentage);
	}
	
	@Override
	public void start() {
		System.out.println("=== Laptop Loading ===");
		battery.displayBattery();
	} 
}

public class DeviceConfigurations{
	public static void main(String[] args) {
		SmartPhone mobile = new SmartPhone(4500, 56);
		Laptop lap = new Laptop(5000, 86);
		
		mobile.start();
		lap.start();
	}
}
