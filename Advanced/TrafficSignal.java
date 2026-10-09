/*
Problem 19: Traffic Signal
Package Name: programs_w3_v2
File Name: TrafficSignal.java
Create an enum:
  TrafficLight	
with:
  RED
  YELLOW
  GREEN
Use a switch statement to display the appropriate instruction:
  RED → Stop
  YELLOW → Get Ready
  GREEN → Go
Focus: Basic enum
*/

package programs_w3_v2;

public class TrafficSignal {
	enum TrafficLight{
		RED,
		YELLOW,
		GREEN,
	}
	
	public static void main(String[] args) {
		TrafficLight light = TrafficLight.RED;
		switch(light) {
			case RED:
				System.out.println("RED → Stop");
				break;
			case YELLOW:
				System.out.println("YELLOW → Get Ready");
				break;
			case GREEN:
				System.out.println("GREEN → Go");
				break;
			default:
				System.out.println("Unknown Signal");
		}
		
/* Java 14+ (modern switch case syntax)		
		switch(light) {
			case RED -> System.out.println("RED -> Stop");
			case YELLOW -> System.out.println("YELLOW → Get Ready");
			case GREEN -> System.out.println("GREEN → Go");
			default -> System.out.println("Unknown Signal");
		}
*/
    
	}
}
