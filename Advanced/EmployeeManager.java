/*
Problem 11: Employee and Manager
File Name: EmployeeManager.java
Package Name: problems_w3_v2
Create:
Employee
   ↓
Manager
Employee:
	name
	salary
Manager:
	department
Use super to access the parent class constructor or attributes.
Display all information.
Focus: super
*/

package problems_w3_v2;

class Employee {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void displayEmployee() {
		System.out.println("Name : " + getName());
		System.out.println("Salary: " + getSalary());
	}
	
}

class Manager extends Employee {
	private String department;
	
	Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	@Override
	public void displayEmployee() {
		super.displayEmployee();
		System.out.println("Department: " + this.department);
	}
	
}

public class EmployeeManager {

	public static void main(String[] args) {
		Manager branchManager = new Manager("Sherlock", 2_50_000, "Human Resource");
		
		branchManager.displayEmployee();
	}

}
