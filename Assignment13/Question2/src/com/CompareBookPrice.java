package com;

import java.util.Comparator;

public class CompareBookPrice implements Comparator<Book>
{

	@Override
	public int compare(Book arg0, Book arg1) {
		int dff=Double.compare(arg0.getPrice(), arg1.getPrice());
		return dff;
	}
	
}
