package com.company;

import java.util.Scanner;

public class HourlyEmployee extends Employee{
	private double wages;
	private double hours;
	
	public HourlyEmployee() {
		super();

	}
	
	public HourlyEmployee(String firstName, String lastName, String ssn,double wages,double hours) {
		super(firstName, lastName, ssn);
		
	
	}
	

	public double getWages() {
		return wages;
	}


	public void setWages(double wages) {
		this.wages = wages;
	}


	public double getHours() {
		return hours;
	}


	public void setHours(double hours) {
		this.hours = hours;
	}
	
	@Override
	public void accept() {
		Scanner sc=new Scanner(System.in);
		super.accept();
		System.out.println("Enter Wages = ");
		wages=sc.nextDouble();
		System.out.println("Enter Hours = ");
		hours=sc.nextDouble();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Wages = "+ wages);
		System.out.println("Hours = "+ hours);
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wages=" + wages + ", hours=" + hours + "]";
	}
	
	@Override
	public double calculations() {
		
		if(this.hours <= 40)
		{
			return (double)(this.wages * this.hours);
		}
		else
		{
			return (double)((40*this.wages) + ((this.hours - 40) * wages * 1.5));
		}
		
	}
	
}
