/*Q1. (Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded".*/

package com.sunbeam;

import java.util.Scanner;

class CreditCalculator
{
	int accno;
	int balance;
	int chargeditems;
	int totalcredits;
	int creditlimit;
	public CreditCalculator() {
	}
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter account no = ");
		accno=sc.nextInt();
		System.out.print("Enter account balance = ");
		balance=sc.nextInt();
		System.out.print("Enter total items charged = ");
		chargeditems=sc.nextInt();
		System.out.print("Enter total credits applied = ");
		totalcredits=sc.nextInt();
		System.out.print("Enter credit limit = ");
		creditlimit=sc.nextInt();
	}
	public int calculate()
	{
		int balance;
		balance=this.balance+this.chargeditems-this.totalcredits;
		return balance;
	}
	
	public void display()
	{
		if(calculate()>this.creditlimit)
		{
			System.out.println("Credit limit exceeded");
				
		}
		else
			System.out.println("New Balance= "+calculate());
	}
}
public class Test {

	public static void main(String[] args) {
		CreditCalculator cc=new CreditCalculator();
		cc.accept();
		cc.calculate();
		cc.display();

	}

}
