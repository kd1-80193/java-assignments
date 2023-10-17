package com.sunbeam;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class Circle {
	private Point2D centrePoint;
	private double myDiameter;

	Circle() {
		this.centrePoint = new Point2D(0, 0);
		this.myDiameter = 100;
	}

	public Circle(double x, double y, double myDiameter) {

		this.centrePoint = new Point2D(x, y);
		this.myDiameter = myDiameter;
	}

	public void acceptData() throws NegitiveDiameterException{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Diameter - ");
		myDiameter = sc.nextDouble();
		if(myDiameter<0)
			throw new NegitiveDiameterException("Negitive Diameter",myDiameter);
		this.centrePoint.acceptPoint();
	}

	public void setMyDiameter(double myDiameter) throws NegitiveDiameterException {
		if (myDiameter <0)
			throw new NegitiveDiameterException("Diameter Should Not Be Negitive", myDiameter);
		else
			this.myDiameter = myDiameter;
	}

	@Override
	public String toString() {
		return "Circle [centrePoint=" + centrePoint + ", myDiameter=" + myDiameter + "]";
	}

}
