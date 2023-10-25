package com.sunbeam;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.println("0. Exit");
		System.out.println("1. Insert User");
		System.out.println("2. Update User");
		System.out.println("3. Delete User.");
		System.out.println("4. Display All.");
		System.out.println("5. Display By Id.");
		System.out.print("Enter Choice - ");
		int choice = sc.nextInt();
		System.out.println("----------------------------");
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				try (UserDao dao = new UserDao()) {
					System.out.println("Enter First name");
					String fname = sc.next();
					System.out.println("Enter last name");
					String lname = sc.next();
					System.out.println("Enter Email");
					String email = sc.next();
					System.out.println("Enter Password");
					String passwd = sc.next();
					System.out.println("Enter BirthDate");
					String dob = sc.next();
					user.setFname(fname);
					user.setLname(lname);
					user.setEmail(email);
					user.setPasswd(passwd);
					user.setDob(dob);
					int cnt = dao.insertUser(user);
					System.out.println("User Added :" + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				break;
			case 2: {
				// update
				try (UserDao dao = new UserDao()) {

					System.out.println("Enter Id to be updated");
					int id = sc.nextInt();
					System.out.println("Enter First name");
					String fname = sc.next();
					System.out.println("Enter last name");
					String lname = sc.next();
					System.out.println("Enter Password");
					String passwd = sc.next();

					user.setFname(fname);
					user.setLname(lname);
					user.setPasswd(passwd);
					user.setId(id);
					int cnt = dao.updateUser(user);
					System.out.println("User Updated :" + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				break;
			// delete
			case 3: {
				try (UserDao dao = new UserDao()) {
					System.out.println("Enter ID to be Deleted");
					int id = sc.nextInt();
					user.setId(id);
					int cnt = dao.deleteUser(user);
					System.out.println("User Deleted :" + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
				break;
			case 4: {
				// displayALl
				try (UserDao dao = new UserDao()) {
					List<User> list = new ArrayList<>();
					list = dao.displayAll();
					list.forEach(e -> System.out.println(e));
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
				break;
			case 5: {
				try (UserDao dao = new UserDao()) {
					System.out.println("Enter ID to Display");
					int id = sc.nextInt();
					user.setId(id);
					List<User> list = new ArrayList<>();
					list = dao.findById(user);
					list.forEach(e -> System.out.println(e));
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			}
		}
	}

}
