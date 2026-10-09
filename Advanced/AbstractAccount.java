/*
Problem 14: Banking System
Package Name: programs_w3_V2
File Name: AbstractAccount.java
Create an abstract class:
  Account
with:
  abstract void calculateInterest();
Create:
  SavingsAccount
  CurrentAccount
Implement calculateInterest() differently in each class.
Create objects and display the calculated interest.
Focus: Abstract classes + abstract methods
*/

package problems_w3_v2;

abstract class Account {
	protected double balance;
	// if it's private we need to declare getter and setter method to access
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	abstract void calculateInterest();
}

class SavingsAccount extends Account{
	private double interest;
	
	public SavingsAccount(double balance, double interest) {
		super(balance);
		this.interest = interest;
	}
	
	@Override
	void calculateInterest() {
		double interestAmount = (this.interest * balance) / 100.0;
		System.out.printf("Interest Amount: %.2f\n", interestAmount);
	} 
}

class CurrentAccount extends Account {
	
	CurrentAccount(double balance) {
		super(balance);
	}
	
	@Override
	void calculateInterest() {
		System.out.println("There will be 0% interest rate in current account.");
	}
}

public class AbstractAccount {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(5_000, 3.0);
		CurrentAccount ca = new CurrentAccount(5_000);
		
		sa.calculateInterest();
		ca.calculateInterest();
	}
}
