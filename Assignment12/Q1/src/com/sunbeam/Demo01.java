package com.sunbeam;

public class Demo01 {

	public static void main(String[] args) {
		Emp[] arr =new Emp[3];
		arr[0]= new Manager(200.30,50600.10);
		arr[1]= new Labour(400,50.00);		
		arr[2]= new Clerk(5000.00);
		
		double totalIncome = Emp.calTotalIncome(arr);
		System.out.println("Total income:" +totalIncome);

	}

}