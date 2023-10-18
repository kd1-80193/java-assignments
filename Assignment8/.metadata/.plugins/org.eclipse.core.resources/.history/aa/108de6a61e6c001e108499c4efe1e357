package com.company;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee() {
		super();
	}
	public SalariedEmployee(String firstName, String lastName, String ssn,double weeklySalary) {
		super(firstName, lastName, ssn);
		
	}
	

	public double getWeeklySalary() {
		return weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public void accept() {
		Scanner sc=new Scanner(System.in);
		super.accept();
		System.out.println("Enter Weekly Salary = ");
		weeklySalary=sc.nextDouble();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Weekly Salary = "+ weeklySalary);
	}

	
	
	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + "]";
	}


	@Override
	public double calculations() {
		
		return weeklySalary;
	}

}
