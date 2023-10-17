package com.sunbeam;

import java.util.Scanner;

public class SalariedEmployee extends Employee {

	private double weeklySalary;

	public SalariedEmployee() {
		super();

	}

	public SalariedEmployee(String fname, String lname, int ssnumber, double weeklySalary) {
		super(fname, lname, ssnumber);
		this.weeklySalary = weeklySalary;
	}

	public void acceptData() {
		super.acceptData();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Weekly Salary- ");
		weeklySalary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void calculateSalary() {
		System.out.println("Total Salary = " + weeklySalary);
	}
}
