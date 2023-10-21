package com.sunbeam;

import java.util.stream.Stream;

//Calculate the factorial of the given number using stream operations
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=6;
		Stream <Integer> strm= Stream.iterate(1, i->i+1).limit(m);
		int result = strm.reduce(1, (a,e)->a*e);
		System.out.println("Factorial is:"+result);
	}

}
