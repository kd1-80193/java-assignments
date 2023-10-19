package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainQ2 {

	public static void main(String[] args) {

		Set<Book> set = new LinkedHashSet();

		set.add(new Book("ISBN01", "BOOK 1", "Author 1", 10));
		set.add(new Book("ISBN03", "BOOK 2", "Author 2", 30));
		set.add(new Book("ISBN06", "BOOK 3", "Author 3", 50));
		set.add(new Book("ISBN04", "BOOK 4", "Author 4", 40));
		set.add(new Book("ISBN07", "BOOK 5", "Author 5", 70));
		set.add(new Book("ISBN08", null, "Author 6", 80));
		set.add(new Book("ISBN09", null, "Author 7", 40));  // LinkedHashSet accept only one null value.

//		for (Book s : set)
//		System.out.println(s);

		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book B = itr.next();
			System.out.println(B);

		}
	}

}
