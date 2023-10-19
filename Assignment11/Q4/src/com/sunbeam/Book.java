package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Book {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book() {
		
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
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter isbn :");
		this.isbn= sc.next();
		System.out.println("Enter price :");
		this.price=sc.nextDouble();
		System.out.println("Enter Author Name :");
		this.authorName=sc.next();
		System.out.println("Enter Quantity :");
		this.quantity=sc.nextInt();
	}
	@Override
	public int hashCode() {
		int hash = Objects.hash(this.isbn);
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		Book other = (Book)obj;
		if(this.isbn.equals(other.isbn))
			return true;
		else
			return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}


	
}
