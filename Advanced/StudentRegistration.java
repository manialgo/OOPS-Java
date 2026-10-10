/*
Problem 22: Student Registration
Package Name: programs_w3_v2
File Name: StudentRegistration.java
Take the following information from the user:
  Name
  Age
  Department
  CGPA
Create a Student object using the entered values.
Display the complete student information.
Validate that:
  Age > 0
  CGPA between 0 and 10
Focus: Scanner + objects
*/

package programs_w3_v2;

import java.util.Scanner;
class Student {
	private String name;
	private int age;
	private String department;
	private double cgpa;
	
	public Student(String name, int age, String department, double cgpa) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.cgpa = cgpa;
	}
	
	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Department: " + this.department);
		System.out.println("CGPA: " + this.cgpa);
	}
}

public class StudentRegistration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name of the student: ");
		String name = sc.nextLine();
				
		int age;
		do {
			System.out.print("Enter age: ");
			age = sc.nextInt();
			sc.nextLine();
			if(age <= 0) {
				System.out.println("Age should be greater than 0.");
			}
		} while(age <= 0);
		
		System.out.print("Enter Department of the student: ");
		String department = sc.nextLine();
		
		double cgpa;
		do {
			System.out.print("Enter CGPA: ");
			cgpa = sc.nextDouble();
			sc.nextLine();
			if(cgpa < 0 || cgpa > 10.00) {
				System.out.println("CGPA should be in the range [0, 10.00]");
			}
		} while(cgpa < 0 || cgpa > 10.00);
		
		Student stu = new Student(name, age, department, cgpa);
		
		stu.display();
		sc.close();
	}
}
