package com.sunbeam;

import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BookTest {
	public static int menu()

	{
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("0.  Exit");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete at book given index -- list.remove(index);");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order -- list.sort();");
		System.out.print("Enter your choice - ");
		choice = sc.nextInt();
		System.err.println("----------------------------------------------------------------------");
		return choice;
	}

	public static void main(String[] args) {
		List<Book> arr = new ArrayList<Book>();

		Book book;
		System.out.println("array " + arr.toString());
		int choice = 0;

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				book = new Book();
				book.accept();
				arr.add(book);
			}
				break;
			case 2: {
				for (Book ele : arr) {
					System.out.println(" Book = " + ele);
				}
			}
				break;
			case 3: {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter index to delete book ");
				int index = sc.nextInt();
				arr.remove(index);
				// optional
//				for (int i = 0; i < arr.size(); i++) {
//					if (index == i)
//						arr.remove(i);
//				}
			}
				break;
			case 4: {
				Book key = new Book();
//				Scanner sc = new Scanner(System.in);
//				String isbn = sc.next();
				key.setIsbn("123");
				if (arr.contains(key))
					System.out.println("Found");
				else
					System.out.println("Not Found");
			}
				break;

			case 5: {
				arr.clear();
				// Optional
//				for (int i = 0; i < arr.size(); i++) {
//					arr.remove(i);
//				}
			}
				break;
			case 6: {
				System.out.println(arr.size());
				for (Book ele : arr) {
					System.out.println(ele);
				}
			}
				break;
			case 7: {
				class BookPriceSort implements Comparator<Book> {
					@Override
					public int compare(Book b1, Book b2) {
						int diff = -Double.compare(b1.getPrice(), b2.getPrice());
						return diff;
					}
				}
				BookPriceSort comparator = new BookPriceSort();
				arr.sort(comparator);
			}
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}

}
