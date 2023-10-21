package com.sunbeam;

import java.util.Random;
import java.util.stream.Stream;

public class Demo7 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		Stream<Integer> strm = Stream.generate(()->r.nextInt(10)).limit(10);
		int result = strm.reduce(0,(a,b)->a+b);
		System.out.println(result);
	}

}
