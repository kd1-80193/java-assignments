package com.sunbeam;

public class Date implements Displayable {
	int day;
	int month;
	int year;
	
//	public void acceptDate() {
//		System.out.println("Inside Date acceptDate()");
//	}
	
//	public void displayDate() {
//		System.out.println("Inside Date displayDate()");
//	}
	
	public Date(int i, int j, int k) {
		this.day=i;
		this.month=j;
		this.year=k;
	}

//	@Override
//	public void acceptData() {
//		System.out.println("Inside Date acceptDate()");	
//	}
	
	@Override
	public void displayData() {
		System.out.println("Inside Date displayDate()");
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + ", toString()=" + super.toString() + "]";
	}
}