package com.sunbeam;

import java.util.stream.IntStream;

//Create an IntStream to represent numbers from 1 to 10. 
//Call various functions like sum(), summaryStatistics() and observe the output.

public class Demo8 {

	public static void main(String[] args) {
		
		IntStream strm1=IntStream.range(1, 10);
		int total = strm1.sum();
//		for(IntStream ele :strm1)
//		System.out.println(ele);
		System.out.println(total);
		
		IntStream strm2 = IntStream.range(1, 10);
		System.out.println(strm2.summaryStatistics());
		
		
	}

}
