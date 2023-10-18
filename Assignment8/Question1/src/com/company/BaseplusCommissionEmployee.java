package com.company;

import java.util.Scanner;

public class BaseplusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	
	public BaseplusCommissionEmployee() {
		super();
	}

	public BaseplusCommissionEmployee(String firstName, String lastName, String ssn, double commissionRate,
			double grossSales,double baseSalary) {
		super(firstName, lastName, ssn, commissionRate, grossSales);
		
	}
	

	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public void accept() {
		Scanner sc=new Scanner(System.in);
		super.accept();
		System.out.println("Enter the Base Salary = ");
		baseSalary=sc.nextDouble();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Base Salary = "+ baseSalary*1.1);
	}

	
	@Override
	public String toString() {
		return "BaseplusCommissionEmployee [baseSalary=" + baseSalary + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calculations() {
		return (double)(this.baseSalary + super.calculations());
	}
	
	
	

}
