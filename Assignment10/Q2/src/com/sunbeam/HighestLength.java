package com.sunbeam;

import java.util.*;

/*2. Create a list of strings. Find the string with highest length using Collections.max().*/
public class HighestLength {

	public static void main(String[] args) {

		List<String> str = new ArrayList<String>();

		Collections.addAll(str, "John", "Moses", "Jack", "Henry", "Patric", "joeroot");

		class LengthComparator implements Comparator<String> {
			public int compare(String s1, String s2) {
				int diff = s1.length() - s2.length();
				return diff;
			}
		}
		LengthComparator comparator = new LengthComparator();
		String s2 = Collections.max(str, comparator);
		System.out.println(s2);

		String s1 = Collections.min(str, new LengthComparator());
		System.out.println(s1);

	}

}
