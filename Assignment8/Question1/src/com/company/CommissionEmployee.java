package com.company;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
	private double commissionRate;
	private double grossSales;
	
	public CommissionEmployee() {
		super();
	}
	
	public CommissionEmployee(String firstName, String lastName, String ssn,double commissionRate,double grossSales) {
		super(firstName, lastName, ssn);
		
	}
	

	public double getCommissionRate() {
		return commissionRate;
	}


	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}


	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	
	@Override
	public void accept() {
		Scanner sc=new Scanner(System.in);
		super.accept();
		System.out.println("Enter the Commission Rate = ");
		commissionRate=sc.nextDouble();
		System.out.println("Enter the Gross Sales = ");
		grossSales=sc.nextDouble();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Commission Rate = "+ commissionRate);
		System.out.println("Gross Sales = "+ grossSales);
	}

	
	@Override
	public String toString() {
		return "CommissionEmployee [commissionRate=" + commissionRate + ", grossSales=" + grossSales + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public double calculations() {
		return (double)(this.commissionRate * this.grossSales);
	}
	

}
