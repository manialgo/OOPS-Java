/*
Problem 20: Days and Working Hours
Package Name: programs_w3_v2
File Name: DaysAndWorkingHours.java
Create an enum:
  Day
with:
  MONDAY
  TUESDAY
  WEDNESDAY
  THURSDAY
  FRIDAY
  SATURDAY
  SUNDAY
Each enum constant should store the number of working hours.
For example:
  MONDAY → 8
  TUESDAY → 8
  ...
  SUNDAY → 0
Use an enum constructor to initialize the hours.
Display each day and its working hours.
Focus: Enum constructor
*/

package programs_w3_v2;

enum Day {
	MONDAY(8),
	TUESDAY(8),
	WEDNESDAY(8),
	THURSDAY(8),
	FRIDAY(8),
	SATURDAY(8),
	SUNDAY(0);
	
	private final int workingHours;
	
	private Day(int workingHours) {
		this.workingHours = workingHours; 
	}
	
	public int getWorkingHours() {
		return this.workingHours;
	}
}

public class DaysAndWorkingHours {
	public static void main(String[] args) {
		for(Day daysAndHours : Day.values()) {
			System.out.println(daysAndHours + " -> " + daysAndHours.getWorkingHours());
		}
	}
}
