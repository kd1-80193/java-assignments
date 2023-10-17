package tester;

import com.app.geometry.Point2D;

public class PointTest {

	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		p1.acceptPoint();
		p1.getDetails();
		Point2D p2 = new Point2D();
		p2.acceptPoint();
		p2.getDetails();

		if (p1.isEqual(p2)) {
			System.out.println("The two points are equal.");
		} else {
			System.out.println("The two points are not equal.");
		}
		double distance = p1.calculateDistance(p2);
		System.out.println("Distance between Point 1 and Point 2: " + distance);

	}

}

/*
 * Write TestPoint class , in package "tester" , with a main method, Accept co
 * ordinates of 2 points from user (Scanner) --to create 2 points (p1 & p2) Use
 * getDetails method to display point details.(p1's details & p2's details)
 * Invoke isEqual & display if points are same or different (i.e p1 & p2 are
 * located at the same
 */
