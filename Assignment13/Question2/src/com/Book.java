package com;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Book implements Serializable
{
   String isbn;
   double price;
   String authorName;
   int quantity;
   
   public Book()
   {
	   
   }

public Book(String isbn, double price, String authorName, int quantity) {
	super();
	this.isbn = isbn;
	this.price = price;
	this.authorName = authorName;
	this.quantity = quantity;
}

public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getAuthorName() {
	return authorName;
}

public void setAuthorName(String authorName) {
	this.authorName = authorName;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

@Override
public String toString() {
	return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity + "]";
}

public void accept()
{
  Scanner sc=new Scanner(System.in);
	
  System.out.println("Enter isbn no of Book");
  this.isbn= sc.next();
  System.out.println("Enter the Price Book");
  this.price=sc.nextDouble();
  System.out.println("Enter author name no of Author Name");
  this.authorName=sc.next();
  System.out.println("Enter the of books Quantity");
  this.quantity=sc.nextInt();
}

@Override
public int hashCode() {
	return Objects.hash(isbn);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	return Objects.equals(isbn, other.isbn);
}




}










