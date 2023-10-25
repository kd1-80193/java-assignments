package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static int menu() {

		int choise;
		Scanner sc = new Scanner(System.in);
		System.out.println("0. EXIT");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Search a book with given isbn (hint - indexOf())");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn.");
		System.out.println("6. Reverse the list (hint - Collections.reverseList())");
		System.out.println("7. Save books in ﬁle");
		System.out.println("8. load books from ﬁle.");
		choise = sc.nextInt();
		return choise;
	}
	
	/*1. In menu-driven program of Books (with ArrayList - Day12 Q1) add two more menus. 
	 *   Save books in ﬁle and load books from ﬁle. Use DataOutputStream
     *   and DataInputStream.
	 * */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Book> arr = new ArrayList<Book>();
		CompareBookPrice c = new CompareBookPrice();
		
		int choise;
		while (0 != (choise = menu())) {
			switch (choise) {
			case 1:// 1. Add new book in list
			{
				Book bk = new Book();
				bk.accept();

				if (arr.contains(bk)) {
					System.out.println("Book is alredy present in library");
					Iterator<Book> itr = arr.iterator();
					while (itr.hasNext()) {
						Book b1 = itr.next();
						if (b1.getIsbn().equals(bk.getIsbn())) {
							b1.setQuantity(b1.getQuantity() + bk.getQuantity());
							System.out.println("Quantity increases successfully");
							break;
						}
					}
				} else {
					arr.add(bk);
					System.out.println("Book added susscessfully");
				}

			}
				break;

			case 2:// 2. Display all books in forward order.
			{
				Iterator<Book> itr = arr.iterator();
				while (itr.hasNext()) {
					Book b = itr.next();
					System.out.println(b);
				}
			}
				break;

			case 3:// 3. Search a book with given isbn (hint - indexOf())
			{
				System.out.println("Enter the isbn no of book for get the book");
				String isbn = sc.next();
				Book b = new Book();
				b.setIsbn(isbn);
				int i = 0;
				int temp=0;
				Iterator<Book> itr = arr.iterator();
				while (itr.hasNext()) {
					Book b1 = itr.next();
					if (b.getIsbn().equals(b1.getIsbn())) {
						temp=i;
						break;
					}
					i++;
				}
				System.out.println("Book is found at index no : " + temp);
			}

				break;

			case 4:// Delete a book at given index.
			{
				System.out.println("Enter the index no at which you want delete the book");
				int index = sc.nextInt();
				arr.remove(index);
				System.out.println("Book is remove successfully");
			}
				break;

			case 5:// Delete a book with given isbn.
			{
				System.out.println("Enter the isbn no of book for get the book");
				String isbn = sc.next();
				Book b = new Book();
				b.setIsbn(isbn);
				int i = 0;
				int temp=0;
				Iterator<Book> itr = arr.iterator();
				while (itr.hasNext()) {
					Book b1 = itr.next();
					if (b.getIsbn().equals(b1.getIsbn())) {
						temp=i;
						break;
					}
					i++;
				}
				arr.remove(temp);
				System.out.println("Book is found at index : "+temp+" and remove successfully");
				break;
			}

			case 6:// 
			{
				Collections.reverse(arr);
				System.out.println("List reverse is successfully");
				Iterator<Book> itr = arr.iterator();
				while (itr.hasNext()) {
					Book b = itr.next();
					System.out.println(b);
				}

				break;
			}
			case 7:// 7.Save books in ﬁle
			{
				int temp=0;

				try(FileOutputStream fout = new FileOutputStream("books.bin")) {
					try(DataOutputStream dout = new DataOutputStream(fout)) {
						for(Book book : arr) {
							dout.writeUTF(book.getIsbn());
							dout.writeUTF(book.getAuthorName());
							dout.writeDouble(book.getPrice());
							dout.writeInt(book.getQuantity());
						}
						temp=1;
					} // dout.close();
				} // fout.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				if(temp==1) {
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("Books Are Sucessfully writen in File");
				}
				break;
			}
			case 8:// 8. load books from ﬁle.
			{
				int temp=0;
				try(FileInputStream fin = new FileInputStream("books.bin")) {
					try(DataInputStream din = new DataInputStream(fin)) {
						while(true) {
							Book book = new Book();
		
							book.setIsbn(din.readUTF());
							book.setAuthorName(din.readUTF());
							book.setPrice(din.readDouble());
							book.setQuantity(din.readInt());
							
							//System.out.println(book);
							arr.add(book);//
							
							temp=1;
							
						}
						
					 // temp=1;
					} 
					// din.close();
					
				} // fin.close();
				
				catch (EOFException e) {
					// do nothing
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				if(temp==1)
				{
					System.out.println("-------------------------------------------------------------------------");
					System.out.println("Book are successfully load from file");
				}
				

				break;
			}
		}
		System.out.println("-------------------------------------------------------------------------");

		System.out.println("THANK YOU FOR USING THE APPLICATION");

	}
	}

}
