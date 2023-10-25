package com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	/*3. Write a program that inputs 4 lines and stored them in a text ﬁle. 
	 *   Use BuﬀeredWriter class.
	 * */
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	 
		try(FileWriter fW = new FileWriter("File.txt"))
		{
			try(BufferedWriter bw=new BufferedWriter(fW))
			{
				for(int i=0;i<=4;i++)
				{
					System.out.println("Enter the line");
					String line=sc.nextLine();
					bw.write(line);
					bw.newLine();
				}
			}
			
		} catch (IOException e) {
			
		}
		System.out.println("Your text successfully writen in file.txt");
		
		

	}

}
