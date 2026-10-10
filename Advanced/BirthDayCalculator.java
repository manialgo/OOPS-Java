/*
Problem 24: Birthday Calculator
Package Name: programs_w3_v2
File Name: BirthDayCalculator.java
Ask the user to enter:
  Name
  Date of Birth
Calculate and display:
  Name
  Date of Birth
  Current Date
  Age
Follow-up
Calculate approximately how many:
  Years
  Months
  Days
the person has been alive.
Concepts:
  User input
  Date/time API
  Parsing
  Date calculations
*/

package programs_w3_v2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class BirthDayCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine().trim();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate current = LocalDate.now();
		
		LocalDate birthDate = null;
		while(birthDate == null) {
			System.out.print("Enter the Date of Birth: (dd-MM-yyyy)");
			String input = sc.nextLine().trim();
			try {
				birthDate = LocalDate.parse(input, formatter);
				if(birthDate.isAfter(current)) {
					System.out.println("Date of birth cannot be in the future. Please re-enter.");
					birthDate = null;
				}
			} catch(DateTimeParseException e) {
				System.out.println("Invalid format or date! Use dd-MM-yyyy (e.g., 15-08-2002).");
			}
		}
		
		Period agePeriod = Period.between(birthDate, current);
		int totalDaysAlive = (int) ChronoUnit.DAYS.between(birthDate, current);
		
		System.out.println("\n---- Birthday Summary ----");
		System.out.println("Name: " + name);
		System.out.println("Date of Birth: " + birthDate.format(formatter));
		System.out.println("Current Date: " + current.format(formatter));
		System.out.println("Age: " + agePeriod.getYears() + " years old");

		System.out.println("\n---- Calculation ----");
		System.out.println(
				agePeriod.getYears() + " years " +
				agePeriod.getMonths() + " months and " +
				agePeriod.getDays() + " days"
				);
		System.out.println("Total days alive: " + totalDaysAlive + " days");
		sc.close();
	}
}
