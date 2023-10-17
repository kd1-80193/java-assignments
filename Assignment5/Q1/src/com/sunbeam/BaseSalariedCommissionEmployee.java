package com.sunbeam;

import java.util.Scanner;

public class BaseSalariedCommissionEmployee extends CommissionEmployee {
	double baseSalary;

	public BaseSalariedCommissionEmployee() {
		super();
	}

	public BaseSalariedCommissionEmployee(String fname, String lname, int ssnumber, int grossSales,
			float commissionRate, double baseSalary) {
		super(fname, lname, ssnumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base Salary- ");
		baseSalary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "BaseSalariedCommissionEmployee [baseSalary=" + baseSalary + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void calculateSalary() {
		// super.calculateSalary();
		double totalsalary = 0;
		totalsalary = ((this.baseSalary + (this.baseSalary * 0.10)) + (getGrossSales() * (getCommissionRate() / 100)));
		System.out.println("Total Salary = " + totalsalary);
	}

}
