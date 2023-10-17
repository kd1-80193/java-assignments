package com.app.fruits;

public class Apple extends Fruit {

	public Apple() {
		super();

	}

	public Apple(String color, double weight, String name) {
		super(color, weight, name);

	}
	@Override
	public String taste()
	{
		return "sweet n sour";
	}

	@Override
	public String toString() {
		return "Apple [taste()=" + taste() + ", toString()=" + super.toString() + "]";
	}	
	

}
