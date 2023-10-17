package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public abstract class Employee {
	protected String fname;
	protected String lname;
	protected int ssnumber;

	public Employee() {

	}

	public Employee(String fname, String lname, int ssnumber) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.ssnumber = ssnumber;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getSsnumber() {
		return ssnumber;
	}

	public void setSsnumber(int ssnumber) {
		this.ssnumber = ssnumber;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name- ");
		fname = sc.next();
		System.out.print("Enter Last Name- ");
		lname = sc.next();
		System.out.print("Enter Social Security Number- ");
		ssnumber = sc.nextInt();
	}

	abstract public void calculateSalary();

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", ssnumber=" + ssnumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fname, lname, ssnumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(fname, other.fname) && Objects.equals(lname, other.lname) && ssnumber == other.ssnumber;
	}

}
