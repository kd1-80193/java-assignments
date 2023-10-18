package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

class Student implements Comparable<Student> {
	private int roll;
	private String name;
	private String city;
	private double marks;

	public Student() {

	}

	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, marks, name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(city, other.city)
				&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name) && roll == other.roll;
	}

	@Override
	public int compareTo(Student s1) {
		int diff = this.roll - s1.roll;
		return diff;
	}

}

public class Test {

	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student(101, "Rohit", "Pune", 88);
		arr[1] = new Student(102, "Virat", "Delhi", 77);
		arr[2] = new Student(101, "Gautam", "Chennai", 97);
		arr[3] = new Student(103, "Gill", "Delhi", 90);
		arr[4] = new Student(104, "Lord", "Mumbai", 67);
		for (Student ele : arr) {
			System.out.println(ele);
		}
		System.err.println("-------------------------------------------------------------");

		class StudCityComparator implements Comparator<Student> {
			@Override
			public int compare(Student arr1, Student arr2) {
				int diff = -arr1.getCity().compareTo(arr2.getCity());
				if (diff == 0) {
					diff = -Double.compare(arr1.getMarks(), arr2.getMarks());
				}
				if (diff == 0) {
					diff = arr1.getName().compareTo(arr2.getName());
				}
				return diff;
			}
		}
		System.err.println("-------------------------------------------------------------");
		StudCityComparator comparator1 = new StudCityComparator();
		Arrays.sort(arr, comparator1);
		for (Student ele : arr) {
			System.out.println(ele);
		}
//seperate comparing
//		class StudNameComparator implements Comparator<Student> {
//			@Override
//			public int compare(Student arr1, Student arr2) {
//				int diff = arr1.getName().compareTo(arr2.getName());
//				return diff;
//			}
//		}
//
//		StudNameComparator comparator2 = new StudNameComparator();
//
//		Arrays.sort(arr, comparator2);
//		System.err.println("-------------------------------------------------------------");
//		for (Student ele : arr) {
//			System.out.println(ele);
//		}
//		class StudMarksComparator implements Comparator<Student> {
//			@Override
//			public int compare(Student arr1, Student arr2) {
//				int diff = Double.compare(arr1.getMarks(), arr2.getMarks());
//				return diff;
//			}
//		}
//
//		StudMarksComparator comparator3 = new StudMarksComparator();
//
//		Arrays.sort(arr, comparator3);
//		System.err.println("-------------------------------------------------------------");
//		for (Student ele : arr) {
//			System.out.println(ele);
//		}
	}

}
