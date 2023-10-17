package com.sunbeam;

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle();

		try {
			c.acceptData();
			//c.setMyDiameter(-100);
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
