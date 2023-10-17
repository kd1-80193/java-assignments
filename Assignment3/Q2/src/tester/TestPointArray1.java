package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.print("Enter size = ");
		int size = sc.nextInt();
		Point2D point[] = new Point2D[size];

		for (int i = 0; i < point.length; i++) {
			point[i] = new Point2D();
		}
		for (int i = 0; i < point.length; i++) {
			point[i].acceptPoint();
		}

		do {
			System.out.println("***********************************");
			System.out.println("0.EXIT");
			System.out.println("1.DISPLAY DETAIS OF SPECIFIC POINT ");
			System.out.println("2.DSPLAY ALL POINTS");
			System.out.println("3.CALCULATE DISTANCE ");
			System.out.print("ENTER CHOICE:: ");
			choice = sc.nextInt();
			System.out.println("***********************************");
			switch (choice) {
			case 1: {
				// 1.Display details of a specific point
				System.out.print("Enter index for specific Point = ");
				int index = sc.nextInt();
				if (index < 0 || index >= point.length) {
					System.out.println("Invalid Index pls retry ");
				} else {
					point[index].display();
				}
			}
				break;
			case 2: {
				// 2.Display x, y co-ordinates of all points
				System.out.println("x, y co-ordinates of all points");
				for (Point2D elements : point) {
					elements.display();
				}
			}
				break;
			case 3: {
				// 3.User i/p : 2 indices for the points , validate the indices
				System.out.print("Enter index of strt point n end point");
				int index1 = sc.nextInt();
				int index2 = sc.nextInt();
				if (index1 >= 0 && index1 < point.length) {
					if (index2 >= 0 && index2 < point.length) {
						if (point[index1].isEqual(point[index2])) {
							System.out.println("The two points are equal.");
						} else {
							double distance = point[index1].calculateDistance(point[index2]);
							System.out.println("Distance = " + distance);
						}
					} else
						System.out.println("Invalid Index pls retry ");
				} else
					System.out.println("Invalid Index pls retry ");
			}
				break;
			}
		} while (choice != 0);
		System.out.println("Thank you!!!");

	}

}
