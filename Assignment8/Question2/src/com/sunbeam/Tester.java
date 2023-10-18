package com.sunbeam;

class Box<T> {
	private T obj;
	public void set(T val) {
		this.obj=val;
	}
	public T get() {
		return this.obj;
	}
}


public class Tester {
		public static void printDisplayableBox(Box<? extends Displayable> b) {
			b.get().displayData();
		}
		public static void printAnyBox(Box<?>b) {
			System.out.println(b.get().toString());
		}

	public static void main(String[] args) {
		Box<Person>b1=new Box<>();
		b1.set(new Person(1,"Suyash",0.0));
		
	
		Box<Date>b2=new Box<>();
		b2.set(new Date(31,05,2000));
		
		printAnyBox(b1);
		printAnyBox(b2);
		
		printDisplayableBox(b1);
		printDisplayableBox(b2);

	}

}
