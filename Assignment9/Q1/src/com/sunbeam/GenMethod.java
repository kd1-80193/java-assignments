package com.sunbeam;

public class GenMethod {

	public static <T extends Number> T findMin(T arr[]) {
		T min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].doubleValue() < min.doubleValue()) {
				min = arr[i];
			}
		}

		return min;

	}

	public static void main(String[] args) {
		Integer[] arr1 = { 22, 33, 11, 9, 44, 55, 15 };
		Integer min1 = findMin(arr1);
		
		System.out.println(min1);
		System.err.println("-----------------------");
		
		Double[] arr2 = { 5.5, 2.2, 1.1, 3.3, 6.6 };
		Double min2 = findMin(arr2);
		System.out.println(min2);
	}

}
