package com.sunbeam;

import java.util.Comparator;

class ArraySortComparator implements Comparator<Double> {

	@Override
	public int compare(Double arr1, Double arr2) {
		int diff = arr1.compareTo(arr2);

		return diff;
	}
}

public class GenericSort {
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Double[] arr1 = { 5.5, 3.3, 1.1, 4.4, 2.2 };

		for (Double ele : arr1) {
			System.out.println(ele);
		}
		System.err.println("------------------------");

		ArraySortComparator comp = new ArraySortComparator();
		selectionSort(arr1, comp);

		for (Double ele : arr1) {
			System.out.println(ele);
		}
	}

}
