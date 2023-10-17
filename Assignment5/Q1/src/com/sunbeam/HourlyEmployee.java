package com.sunbeam;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	double hourlyWage;
	float hoursWorked;

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(String fname, String lname, int ssnumber, double hourlyWage, float hoursWorked) {
		super(fname, lname, ssnumber);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hourly Wage- ");
		hourlyWage = sc.nextDouble();
		System.out.print("Enter hourly Worked- ");
		hoursWorked = sc.nextFloat();

	}

	@Override
	public void calculateSalary() {
		double overTime = 0;
		if (0 < this.hoursWorked && this.hoursWorked <= 40) {
			System.out.println("Total salary = " + hourlyWage * hoursWorked);
		} else if (this.hoursWorked > 40) {
			overTime = ((this.hoursWorked-40) * (1.5 * hourlyWage));
			System.out.println("TOtal Salary With Overtime = " + (overTime + (hourlyWage * 40)));
		} else
			System.out.println("0 Hours Worked");
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hourlyWage=" + hourlyWage + ", hoursWorked=" + hoursWorked + ", toString()="
				+ super.toString() + "]";
	}

}
