package com.sunbeam;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		StringClass s=new StringClass();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String value ");
		String str1=sc.next();
		try
		{
			s.setStr(str1);
			System.out.println(s);
		}
		catch(RuntimeException exception)
		{
			exception.printStackTrace();
		}
		

	}

}
