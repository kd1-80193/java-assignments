package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 4. Use TreeSet to store all books in descending order of price. 
 * Natural ordering for the Book should be isbn (do not change it). 
 * Display them using iterator()
 * and descendingIterator().
 */
public class TesterTreeSet {
	

	public static void main(String[] args) {
		// local class
		class Desc implements Comparator<Book> {
			@Override
			public int compare(Book b1, Book b2) {
				return (int) (b1.getPrice()-b2.getPrice());
			}
		}
		Desc com = new Desc();
		
		TreeSet<Book> treset = new TreeSet<>(com);

		Book b;
		b = new Book("var2", 599.00, "Abhi", 2);
		treset.add(b);
		b = new Book("var4", 299.00, "Krisha", 3);
		treset.add(b);
		b = new Book("var1", 799.00, "Varad", 1);
		treset.add(b);
		b = new Book("var4", 799.00, "Rutvik", 7);
		treset.add(b);
		b = new Book("var1", 899.00, "Mor", 2);
		treset.add(b);
		b = new Book("var5", 499.00, "Rohit", 4);
		treset.add(b);
		b = new Book("var3", 699.00, "jags", 3);
		treset.add(b);
	
		System.out.println("************ITERATOR****************");
		
		Iterator<Book> itr = treset.iterator();
		while (itr.hasNext()) {
			Book book = (Book) itr.next();
			System.out.println(book);
		}
		
		System.out.println("*************DESCENDING_PRICE***************");
		
		Iterator<Book> itr1 = treset.descendingIterator();
		while (itr1.hasNext()) {
			Book book = (Book) itr1.next();
			System.out.println(book);
		}
	}
}