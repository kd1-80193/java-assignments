package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 5. Store Books in HashMap<> so that for given isbn, book can be 
 * searched in fastest possible time. Do we need to write equals() 
 * and hashCode() in Book class?
 */
public class TesterHashSet {
	
	public static int menu() {
		int choice;
		System.out.println("0. Exit ");
		System.out.println("1. Insert in map");
		System.out.println("2. find in map");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		

		int choice;
		// declare map: key=isbn, value=Book object
		Map<String,Book> map = new HashMap<>();
		
		while ((choice = menu())!=0 ) {
			
			switch (choice) {
			case 1:
				Book b = new Book();
				b.accept();
				map.put(b.getIsbn(), b);
				break;
				
			case 2:

				System.out.println("Enter isbn : ");
				String isbn = new Scanner(System.in).next();
				Book f = map.get(isbn);
				System.out.println(f.toString()); 
				break;
				
			default:
				break;
			}
			
			
		}
	}

}
