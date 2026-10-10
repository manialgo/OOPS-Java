/*
Problem 21: Food Ordering System
Package Name: programs_w3_v2
File Name: FoodOrderingSystem.java
Create an enum:
  Food
containing:
  PIZZA
  BURGER
  PASTA
  SANDWICH
Each should have a price using an enum constructor.
Take the user's food choice using Scanner.
Display:
  Selected Food
  Price
Follow-up
Ask the user for the quantity and calculate the total bill.
Then add a simple discount:
Total >= 1000 → 10% discount
Otherwise → No discount
Concepts:
  Enum
  Enum constructor
  User input
  Conditional logic
*/

package programs_w3_v2;

import java.util.Scanner;

enum Food {
	PIZZA(250.00),
	BURGER(350.00),
	PASTA(450.00),
	SANDWICH(600.00);
	
	private double price;
	
	private Food(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
}

public class FoodOrderingSystem {
	
	private static void foodProcess(Food userFood, int quantity) {
		double billAmount = (userFood.getPrice() * quantity);
		System.out.println("Order details:\n" + userFood.name() + " X " + quantity);
		System.out.printf("Your bill amount: %.2f\n", billAmount);
		if(billAmount >= 1000) {
			double discountAmount = billAmount * 0.1;
			double balanceAmount = billAmount - discountAmount;
			System.out.println("You are eligible for discount of 10%");
			System.out.printf("Discount Amount: %.2f", discountAmount);
			System.out.printf("\nAmount payable: %.2f", balanceAmount);
		} else {
			System.out.println("No discount applied (Orders ₹1,000 and above receive 10% off).");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter food item: (PIZZA, BURGER, PASTA, SANDWICH)");
		String input = sc.next().trim().toUpperCase();
		
		Food userFood = null;
		try {
			userFood = Food.valueOf(input);
		} catch(IllegalArgumentException e) {
			System.out.println("Input mismatch !");
			sc.close();
			return;
		}
		
		System.out.printf("Selected food: %s\nPrice: %.2f", userFood.name(), userFood.getPrice());
		
		System.out.print("\nEnter quantity: ");
		if(sc.hasNext()) {
			int quantity = sc.nextInt();
			if(quantity > 0) {
				foodProcess(userFood, quantity);
			} else {
				System.out.println("Minimum 1 quantity should be ordered !");
			}
		} else {
			System.out.println("Input mismatch !");
		}
		
		
		sc.close();
	}
}
