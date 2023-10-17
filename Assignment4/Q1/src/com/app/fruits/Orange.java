package com.app.fruits;

public class Orange extends Fruit{

	public Orange() {
		super();
		
	}

	public Orange(String color, double weight, String name) {
		super(color, weight, name);
		
	}
	@Override
	public String taste()
	{
		return "sour";
	}

	@Override
	public String toString() {
		return "Orange [taste()=" + taste() + ", toString()=" + super.toString() + "]";
	}

	
}
