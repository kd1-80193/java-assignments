package com.sunbeam;

import java.util.Objects;

public class Book {
	private String isbn;
	private String bookName;
	private String authorName;
	private int quantity;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
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
	public Book(String isbn, String bookName, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	
			
}