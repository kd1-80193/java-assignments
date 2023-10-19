package com.sunbeam;

import java.util.*;

/*Perform add, delete, ﬁnd, sort, edit functionality in a menu driven program*/
public class TestEmployee {

	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0. EXIT ");
		System.out.println("1. Add Employee ");
		System.out.println("2. Delete Employee ");
		System.out.println("3. Find Employee ");
		System.out.println("4. Sort Linked List ");
		System.out.println("5. DisplayAll");
		System.out.println("6. Update/Edit");
		System.out.println("Enter your choice ");
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		LinkedList<Employee> list = new LinkedList<Employee>();
		Scanner sc = new Scanner(System.in);
		Employee emp;
		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				emp = new Employee();
				emp.acceptData();
				list.addLast(emp);
			}
				break;
			case 2: {
//				System.out.println("Enter index to remove");
//				int index = sc.nextInt();
//				if (index < list.size()) {
//					list.remove(index);}
				list.removeFirst();
				
			}
				break;
			case 3:// find
			{
				System.out.println("Enter index to find ");
				int index = sc.nextInt();
				if (index < list.size()) {
					emp = list.get(index);
					System.out.println(emp);
				}
				//list.getFirst();
			}
				break;
			case 4: {
				class SortComparator implements Comparator<Employee> {
					@Override
					public int compare(Employee e1, Employee e2) {
						int diff = e1.getId() - e2.getId();
						return diff;
					}
				}
				SortComparator comparator = new SortComparator();
				list.sort(comparator);

			}
				break;
			case 5: {
				Iterator<Employee> itr = list.iterator();
				while (itr.hasNext()) {
					emp = itr.next();
					System.out.println(emp);
				}
			}
				break;
			case 6: // edit
			{
				System.out.println("Enter emp id to be modified: ");
				int id = sc.nextInt();
				Employee key = new Employee();
				key.setId(id);
				int index = list.indexOf(key);
				if (index == -1) {
					System.out.println("Employee Not Found");
				} else {
					emp = list.get(index);
					System.out.println("Employee found " + emp);
					Employee e = new Employee();
					e.acceptData();
					list.set(index, e);
				}
			}
			}

		}
	}

}
