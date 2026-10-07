/*
Problem 12: Payment System
File Name: PaymentProcessing
Package Name: problems_w3_v2

Create a parent class:
	Payment
with:
	pay()
Create:
	CreditCard
	UPI
	Cash
Override pay() in each class.
Each child class should use super somewhere meaningful, such as calling a parent method.
Store different payment objects using a Payment reference and call pay().
Follow-up
Add:
	NetBanking
without changing the existing payment-processing logic.
Concepts:
Inheritance
Polymorphism
Method overriding
super
*/

package problems_w3_v2;

class Payment {
	private double amountToPay;
	private double accountBalance;
	
	public Payment(double amountToPay, double accountBalance) {
		this.amountToPay = amountToPay;
		this.accountBalance = accountBalance;
	}
	
	public void pay() {
		if(this.amountToPay > this.accountBalance) {
			System.out.println("Insufficient Balance!");
		} else {
			this.accountBalance -= this.amountToPay;
			System.out.println("Items delivered ! Thank you!");
		}
		System.out.println("Account Balance: " + this.accountBalance);
	}
	
}

class CreditCard extends Payment {
	private final int SYSTEM_PIN = 1234;
	private int userPin;
	
	CreditCard(double amountToPay, double accountBalance, int userPin) {
		super(amountToPay, accountBalance);
		this.userPin = userPin;
	}
	
	@Override
	public void pay() {
		if(this.userPin == SYSTEM_PIN) {
			super.pay();
		} else {
			System.out.println("System PIN mismatch !");
		}
	}
	
}

class UPI extends Payment {
	private final String upiID = "12456789@okhdfcbank";
	private String userUPIID;
	
	UPI(double amountToPay, double accountBalance, String userUPIID) {
		super(amountToPay, accountBalance);
		this.userUPIID = userUPIID;
	}
	
	@Override
	public void pay() {
		if(userUPIID.equals(upiID)) {
			super.pay();
		} else {
			System.out.println("System UPI ID mismatch !");
		}
	}
  
}

class Cash extends Payment {
	
	Cash(double amountToPay, double accountBalance) {
		super(amountToPay, accountBalance);
	}
	
	@Override
	public void pay() {
		super.pay();
	}

}

class NetBanking extends Payment {
	private final String NEFT_ID = "abcd";
	private String userNeftID;
	
	NetBanking(double amountToPay, double accountBalance, String userNeftID) {
		super(amountToPay, accountBalance);
		this.userNeftID = userNeftID;
	}
	
	@Override
	public void pay() {
		if(userNeftID.equals(NEFT_ID)) {
			super.pay();
		} else {
			System.out.println("NEFT ID Mismatch");
		}
	} 
  
}

public class PaymentProcessing {

	public static void process(Payment payment) {
		payment.pay();
	}
	
	public static void main(String[] args) {
		
		Payment paymentQueue[] = {
				new CreditCard(950, 1_00, 1234),
				new UPI(950, 1000, "123456@axisbank"),
				new Cash(950, 1000),
				new NetBanking(950, 1000, "hello")
		};
		
		for(Payment payment : paymentQueue) {
			//payment.pay();
			process(payment);
		}
/*		
		Payment cc = new CreditCard(950, 1_00, 1234);
		Payment upi = new UPI(950, 1000, "123456@axisbank");
		Payment cash = new Cash(950, 1000);
		Payment nb = new NetBanking(950, 1000, "hello");
		
		cc.pay();
		upi.pay();
		cash.pay();
		nb.pay();
*/		
	}
}
