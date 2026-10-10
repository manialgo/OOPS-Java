/*
Problem 23: Current Date
Package Name: programs_w3_v2
File Name: CurrentDate
Write a Java program that displays:
  Current date
  Current time
  Current date and time
Use Java's modern date/time API.
Also display:
  Day
  Month
  Year
Focus: java.time
*/

package programs_w3_v2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateAndTime{
	private final LocalDateTime current = LocalDateTime.now();
	
	private final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	private final DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
	private final DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
	
	public void display() {
		System.out.println("Date: " + current.format(dateFormat));
		System.out.println("Time: " + current.format(timeFormat));
		System.out.println("Date and Time: " + current.format(dateTimeFormat));
		
		System.out.println("\n---Information Bulletin---");
		System.out.println("Day of Month: " + current.getDayOfMonth());
		System.out.println("Day of Week: " + current.getDayOfWeek());
		System.out.println("Month: " + current.getMonth() + "(" + current.getMonthValue() + "th Month)");
		System.out.println("Year: " + current.getYear());
	}
}

public class CurrentDate {
	public static void main(String[] args) {
		DateAndTime obj = new DateAndTime();
		obj.display();
	}
}
