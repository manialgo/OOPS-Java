/*
Problem 13: Computer System
File Name: ComputerInformation.java
Package Name: problems_w3_v2
Create a class:
  Computer
Inside it create an inner class:
  Processor
Computer should contain:
  brand
Processor should contain:
  Cores
  speed
Create an inner-class object and display the complete computer configuration.
Focus: Inner classes
*/

package problems_w3_v2;

class Computer {
	private String brand;
	
	Computer(String brand) {
		this.brand = brand;
	}
	
	class Process{
		private int cores;
		private double speed;

		Process(int cores, double speed) {
			this.cores = cores;
			this.speed = speed;
		}

		public void display() {
			System.out.println("*** Computer Information ***");
			System.out.println("Brand: " + brand);
			System.out.println("Cores: " + this.cores);
			System.out.println("Speed: " + this.speed);		
		}
		
	}
	
}

public class ComputerInformation {
	public static void main(String[] args) {
		Computer parentClass = new Computer("Lenovo");
		Computer.Process childClass = parentClass.new Process(5, 2.5);
		
		childClass.display();
	}

}
