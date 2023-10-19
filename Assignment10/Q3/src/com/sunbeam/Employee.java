package com.sunbeam;

import java.util.*;

public class Employee {
	protected int id;
	protected String fname;
	protected double salary;
	protected int age;

	public Employee() {

	}

	public Employee(int id, String fname, double salary, int age) {

		this.id = id;
		this.fname = fname;
		this.salary = salary;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", salary=" + salary + ", age=" + age + "]";
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id- ");
		this.id = sc.nextInt();
		System.out.print("Enter First Name- ");
		this.fname = sc.next();
		System.out.print("Enter your Salary- ");
		this.salary = sc.nextDouble();
		System.out.print("Enter age ");
		this.age = sc.nextInt();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return id == other.id;
	}

}
