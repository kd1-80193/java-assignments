package com.sunbeam;

public class Person implements Displayable{
	int empid;
	String name;
	double salary;
	
//	public void acceptEmployee() {
//		System.out.println("Inside Employee acceptEmployee()");
//	}
	
//	public void printEmployee() {
//		System.out.println("Inside Employee printEmployee()");	
//	}
	
	public Person(int i, String string, double d) {
		this.empid=i;
		this.name=string;
		this.salary=d;
	}
//	@Override
//	public void acceptData() {
//		System.out.println("Inside Employee acceptEmployee()");
//	}
	@Override
	public void displayData() {
		System.out.println("Inside Employee printEmployee()");	
	}
	@Override
	public String toString() {
		return "Person [empid=" + empid + ", name=" + name + ", salary=" + salary + ", toString()=" + super.toString()
				+ "]";
	}
}