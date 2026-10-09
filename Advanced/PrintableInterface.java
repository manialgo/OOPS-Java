/*
Problem 16: Printable Objects
Package Name: programs_w3_v2
File Name: PrintableInterface.java
Create an interface:
	Printable
with:
	void print();
Create:
	Document
	Photo
	Invoice
Implement Printable in all three classes.
Each should provide its own implementation of print().
Focus: Interfaces
*/

package programs_w3_v2;

interface Printable {
	void print();
}

class Document implements Printable {
	@Override
	public void print() {
		System.out.println("General documents formats: .pdf, .word, .xlsx, .pptx, .txt");
	}
}

class Photo implements Printable {
	@Override
	public void print() {
		System.out.println("General photo formats: .jpeg, .jpg, .png");
	}
}

class Invoice implements Printable {
	@Override
	public void print() {
		System.out.println("Invoices are from order purchase");
	}
}

public class PrintableInterface {
	public static void main(String[] args) {
		Printable docs = new Document();
		Printable pic = new Photo();
		Printable invoice = new Invoice();
		docs.print();
		pic.print();
		invoice.print();
	}
}
