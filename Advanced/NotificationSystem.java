/*
Problem 18: Notification System
Package Name: programs_w3_v2
File Name: NotificationSystem.java
Create an interface:
  Notification
With:
  void send();
Create an anonymous implementation for sending:
  Email
Then create another anonymous implementation for:
  SMS
Call both.
Follow-up
Now create a normal class:
  WhatsAppNotification
that implements the same interface.
Compare the normal implementation with the anonymous implementations.
Concepts:
  Interface
  Anonymous class
  Polymorphism
*/

package programs_w3_v2;

interface Notification {
	void send();
}

class WhatsAppNotification implements Notification{
	@Override
	public void send() {
		System.out.println("WhatsApp Notification.");
	}
}

public class NotificationSystem {
	public static void main(String[] args) {
		Notification email = new Notification() {
			@Override
			public void send() {
				System.out.println("E-Mail Notification.");
			}
		};
		
		Notification sms = new Notification() {
			@Override
			public void send() {
				System.out.println("SMS Notification.");
			}
		};
		
		Notification wn = new WhatsAppNotification();
		
		email.send();
		sms.send();
		wn.send();
	}
}
