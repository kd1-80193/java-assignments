package com.company;

class Box<T extends Employee>{
	private T obj;
	public void set(T val) {
		this.obj=val;
	}
	public T get() {
		this.obj.calculations();
		return this.obj;
	}
}

public class Tester {

	public static void main(String[] args) {
		
		HourlyEmployee l1=new HourlyEmployee();
		l1.accept();
		l1.display();

		
		Box<HourlyEmployee> e1=new Box<>();
		e1.set(l1);
		System.out.println(e1.get());
		
		SalariedEmployee l2=new SalariedEmployee();
		l2.accept();
		l2.display();
		
		Box<SalariedEmployee> e2=new Box<>();
		e2.set(l2);
		System.out.println(e2.get());
		
		CommissionEmployee l3=new CommissionEmployee();
		l3.accept();
		l3.display();
		
		Box<CommissionEmployee> e3=new Box<>();
		e3.set(l3);
		System.out.println(e3.get());
		
//		Employee l4=new BaseplusCommissionEmployee();
//		l4.accept();
//		l4.display();
//		
//		Box<Employee> e4=new Box<>();
//		e4.set(l4);
//		System.out.println(e4.get());

		

	}

}
