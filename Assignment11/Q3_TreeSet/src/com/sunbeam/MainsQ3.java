package com.sunbeam;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainsQ3 {

	public static void main(String[] args) {

		class BookNameComparator implements Comparator<Book> {
			@Override
			public int compare(Book arg0, Book arg1) {
				int diff = arg0.getIsbn().compareTo(arg1.getIsbn());
				return diff;
			}

		}
		BookNameComparator comp = new BookNameComparator();

		TreeSet<Book> set = new TreeSet<Book>(comp);

		set.add(new Book("ISBN01", "BOOK 1", "Author 1", 10));
		set.add(new Book("ISBN03", "BOOK 2", "Author 2", 30));
		set.add(new Book("ISBN06", "BOOK 3", "Author 3", 50));
		set.add(new Book("ISBN04", "BOOK 4", "Author 4", 40));
		set.add(new Book("ISBN04", "BOOK 5", "Author 5", 70));
		//set.add(new Book(null, "BOOK 6", "Author 6", 40)); // TreeSet not accept null value.Throws NullPointerException.

//		for (Book s : set)
//		System.out.println(s);

		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book B = itr.next();
			System.out.println(B);

		}
	}
}
