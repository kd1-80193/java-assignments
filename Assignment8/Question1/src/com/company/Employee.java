package com.company;

import java.util.Scanner;

abstract public class Employee {
	private String firstName;
	private String lastName;
	private String ssn;//social security number
	
	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Name = ");
		firstName=sc.next();
		System.out.println("Enter the Last Name = ");
		lastName=sc.next();
		System.out.println("Enter the Social Security Number = ");
		ssn=sc.next();
	}
	public void display() {
		System.out.println("First Name = "+ firstName);
		System.out.println("Last Name = "+ lastName);
		System.out.println("SSN = "+ ssn);
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
	}
	public abstract double calculations();
	
	
	

}
