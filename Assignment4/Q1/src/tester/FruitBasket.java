package tester;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.MenuBarBorder;

import com.app.fruits.*;

public class FruitBasket {

	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("0. EXIT ");
		System.out.println("1. Add Mango.");
		System.out.println("2. Add Orange.");
		System.out.println("3. Add Apple.");
		System.out.println("4. Display names of fruits in the basket.");
		System.out.println("5. Display taste of fresh fruits,in the basket.");
		System.out.println("6. Display tastes of stale fruits in the basket.");
		System.out.println("7. Mark a fruit as stale.");
		System.out.println("8. Mark all sour fruits stale.");
		System.out.print("Enter Your Choice ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Basket");
		int basketsize = sc.nextInt();
		int counter = 0;
		int choice;
		Fruit arr[] = new Fruit[basketsize];
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				if (counter < basketsize) {
					arr[counter] = new Mango();
					arr[counter++].accept();
				} else
					System.out.println("Basket is Full we cannot add Mango");
			}
				break;
			case 2: {
				if (counter < basketsize) {
					arr[counter] = new Orange();
					arr[counter++].accept();
				} else
					System.out.println("Basket is Full we cannot add Mango");
			}
				break;
			case 3: {
				if (counter < basketsize) {
					arr[counter] = new Apple();
					arr[counter++].accept();
				} else
					System.out.println("Basket is Full we cannot add Red");
			}
				break;
			case 4: {
				//Traditional For loop
//				for(int i=0;i<counter;i++)
//				{
//					if(arr[i].getName()!=null)
//					{
//						System.out.println( arr[i].getName().toString());
//					}
//				}
				for (Fruit a : arr) {
					if (a.getName() != null) {
						System.out.println(a.getName().toString());
					}
				}
			}
				break;
			case 5: {
				for (Fruit a : arr) {
					if (a.getIsFresh()) {
						System.out.println(a.toString());
					}
				}
			}
				break;
			case 6: {
				for (int i = 0; i < counter; i++) {
					if (!arr[i].getIsFresh()) {
						System.out.println(arr[i].taste());
					}
				}

			}
				break;
			case 7: {
				Scanner scn = new Scanner(System.in);
				System.out.println("Enter index to Mark fruit as stale");
				int index = scn.nextInt();
				if (index >= 0 && index < basketsize) {
					arr[index].setFresh(false);

				} else
					System.out.println("Invalid Index");

			}
				break;
			case 8: {
				for (Fruit f : arr) {
					if (f.taste().equals("sour")){
						f.setFresh(false);
					} else
						System.out.println("sour taste fruit is not added");

				}
			}
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
		System.out.println("Thank you !!!");
	}
}
