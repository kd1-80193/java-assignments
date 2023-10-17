package com.app.geometry;

import java.util.Scanner;

public class Point2D {

	protected double x;
	protected double y;

	public Point2D() {
		this.x = 0;
		this.y = 0;
	}

	public Point2D(double x, double y) {
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

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	

}
