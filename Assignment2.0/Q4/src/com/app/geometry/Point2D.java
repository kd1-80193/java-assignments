/*Q4. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-
ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return
string form of point's x & y co-ords
Hint : public String getDetails())
Add isEqual method to Point2D class :a boolean returning method : must return true if n only if
both points are having same x,y co-ords or false otherwise.
Add calculateDistance method to calculate distance between current point and specified point &
return the distance to the caller.*/

package com.app.geometry;

import java.util.Scanner;

public class Point2D {

	double x;
	double y;

	public Point2D() {
		this.x = 0;
		this.y = 0;
	}

	public Point2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void acceptPoint() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter point x = ");
		x = sc.nextDouble();
		System.out.print("Enter point y = ");
		y = sc.nextDouble();

	}

	public String getDetails() {
		return x + " " + y;
	}

	public boolean isEqual(Point2D point) {
		if (this.x == point.x && this.y == point.y) {
			return true;
		} else
			return false;
	}

	public double calculateDistance(Point2D point) {
		double x = this.x - point.x;
		double y = this.y - point.y;
		return Math.sqrt(Math.pow(x, 2) + Math.pow(x, 2));
	}

}
