package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	 
		try(FileReader fR = new FileReader("File.txt"))
		{
			try(BufferedReader bR=new BufferedReader(fR))
			{
				String line;
				while((line=bR.readLine())!=null)
				{
					System.out.println(line);
				}
			}
			
		} catch (IOException e) {
			
		}
		System.out.println("Your text successfully Read from file.txt");
		
		

	}

}
