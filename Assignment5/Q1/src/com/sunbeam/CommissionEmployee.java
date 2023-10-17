package com.sunbeam;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
	int grossSales;
	float commissionRate;

	public CommissionEmployee() {
		super();

	}

	public CommissionEmployee(String fname, String lname, int ssnumber, int grossSales, float commissionRate) {
		super(fname, lname, ssnumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}

	public float getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(float commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Gross Sales- ");
		grossSales = sc.nextInt();
		System.out.print("Enter Commission Rate- ");
		commissionRate = sc.nextFloat();
	}

	@Override
	public void calculateSalary() {
		double totalSalary = 0;
		totalSalary = (grossSales * (commissionRate / 100));
		System.out.println("Total Salary = " + totalSalary);
	}

	@Override
	public String toString() {
		return "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", toString()="
				+ super.toString() + "]";
	}
}
