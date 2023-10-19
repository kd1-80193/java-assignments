package com.sunbeam;

import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Student() {
		
	}
	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void accept() {
		System.out.println("Enter the roll no :");
		this.roll = new Scanner(System.in).nextInt();
		System.out.println("Enter the name :");
		this.name = new Scanner(System.in).next();
		System.out.println("Enter the City :");
		this.city = new Scanner(System.in).next();
		System.out.println("Enter the marks :");
		this.marks = new Scanner(System.in).nextInt();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [rollno="+roll+", name="+name+", city="+city+", Marks="+marks+"]";
	}
}
