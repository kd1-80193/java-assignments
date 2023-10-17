/*Q3. Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.*/

package com.sunbeam;

import java.util.Scanner;

class DrivingCost {
	float miles;
	float gasolinecost;
	double avgpergallon;
	int parkingfee;
	int tolls;

	public DrivingCost() {

	}

	public DrivingCost(float miles, float gasolinecost, double avgpergallon, int parkingfee, int tolls) {
		this.miles = miles;
		this.gasolinecost = gasolinecost;
		this.avgpergallon = avgpergallon;
		this.parkingfee = parkingfee;
		this.tolls = tolls;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total miles driven. = ");
		miles = sc.nextFloat();
		System.out.print("Enter Cost per gallon of gasoline. = ");
		gasolinecost = sc.nextFloat();
		System.out.print("Enter Average miles per gallon. = ");
		avgpergallon = sc.nextDouble();
		System.out.print("Enter Parking fees per day. = ");
		parkingfee = sc.nextInt();
		System.out.print("Enter Tolls per day. = ");
		tolls = sc.nextInt();
	}

	public double calculateDailyCost() {
		double dailycost = tolls + parkingfee + ((gasolinecost * miles) / avgpergallon);
		return dailycost;
	}

	public void dislpay() {
		System.out.println("Daily cost = " + calculateDailyCost());
	}
}

public class TestCost {

	public static void main(String[] args) {
		DrivingCost dc = new DrivingCost();
		dc.accept();
		dc.calculateDailyCost();
		dc.dislpay();
	}

}
