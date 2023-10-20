package com.sunbeam;

public class Manager implements Emp {
	private double basicSalary;
	private double dearanceAllowance;
	
public Manager() {
		
		this.basicSalary =0.00;
		this.dearanceAllowance = 0.00;
	}
	
	public Manager(double basicSalary, double dearanceAllowance) {
		
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}


	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearanceAllowance() {
		return dearanceAllowance;
	}

	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double getSal() {
		
		return this.basicSalary+this.dearanceAllowance;
	}
	public double calcIncentives() 
	{
		
		return (0.20*basicSalary); //(20% of basicSalary)
	}
}