/*
Problem 17: Anonymous Greeting
Package Name: programs_w3_v2
File Name: AnonymousClass.java
Create an interface:
  Greeting
with:
  void sayHello();
Create an anonymous class that implements Greeting.
Call sayHello().
Do not create a separate class for the implementation.
Focus: Anonymous classes
*/

package programs_w3_v2;

interface Greeting {
	void sayHello();
}

public class AnonymousClass {
	public static void main(String[] args) {
		Greeting obj = new Greeting() {
			public void sayHello() {
				System.out.println("Hello World !");
			}
		};
		obj.sayHello();
	}
}
