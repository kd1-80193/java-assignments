package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainQ1 {

	public static void main(String[] args) {

		Set<Book> set = new HashSet<Book>();

		set.add(new Book("ISBN01", "BOOK 1", "Author 1", 10));
		set.add(new Book("ISBN03", "BOOK 2", "Author 2", 30));
		set.add(new Book("ISBN06", "BOOK 3", "Author 3", 50));
		set.add(new Book("ISBN04", "BOOK 5", "Author 5", 70));
		set.add(new Book("ISBN04", "BOOK 5", "Author 5", 70)); // duplicates are not allowed
		set.add(new Book(null, "BOOK 5", "Author 5", 70)); 
		set.add(new Book(null, "BOOK 5", "Author 5", 70)); // only one null is allowed
		
//		for (Book s : set)
//		System.out.println(s);

		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book B = itr.next();
			System.out.println(B);

		}
	}

}
