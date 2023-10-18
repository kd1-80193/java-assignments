package com.sunbeam;

import java.util.*;

public class CollectionClass {

	public static void main(String[] args) {
		 Collection<String> c = new ArrayList<>(); //allowed Duplicates in insertion sequence
		// Collection<String> c = new HashSet<>(); //on hashcode sorting
		// Collection<String> c = new LinkedHashSet<>(); // sorted in insertion sequence
	//	Collection<String> c = new TreeSet<>();// no duplicates, sorted order asc,no null values Allowed
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add("B");
		 c.add(null);
		 c.add(null);
		 c.add(null);
		System.out.println(c.toString());

	}

}
