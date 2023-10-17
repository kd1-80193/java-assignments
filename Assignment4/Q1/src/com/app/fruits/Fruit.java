package com.app.fruits;

import java.util.Objects;
import java.util.Scanner;

public class Fruit {
	String color;
	double weight;
	String name;
	boolean isFresh;

	public Fruit() {
		this.color = "Red";
		this.weight = 10.00;
		this.name = "Strawberry";
		this.isFresh = true;
	}

	public Fruit(String color, double weight, String name) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Fruit Color - ");
		color = sc.next();
		System.out.print("Enter Fruit Weight - ");
		weight = sc.nextDouble();
		System.out.print("Enter Fruit Name - ");
		name = sc.next();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String taste() {
		return "no specific taste";
	}
	public boolean fresh()
	{
		if(isFresh==true)
		{
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return isFresh == other.isFresh;
	}

}
