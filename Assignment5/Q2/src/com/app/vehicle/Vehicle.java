package com.app.vehicle;

import java.util.Objects;
import java.util.Scanner;

public class Vehicle {
	int chasisNo;
	String color;
	double price;
	// object Initializer
	{
		chasisNo = 9007;
	}

	public Vehicle() {
	}

	public Vehicle(String color, double price) {
		this.color = color;
		this.price = price;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Vehicle Chasis No - ");
		chasisNo = sc.nextInt();
		System.out.print("Enter Vehicle color - ");
		color = sc.next();
		System.out.print("Enter Vehicle Price - ");
		price = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return chasisNo == other.chasisNo;
	}

}
