package testerfive;

import java.util.Scanner;

import javax.security.auth.kerberos.KerberosKey;
import javax.swing.plaf.basic.BasicBorders.MenuBarBorder;

import com.sunbeam.*;

public class PayrollTest {
	public static int menu() {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("0. EXIT ");
		System.out.println("1. Add Salaried Employee ");
		System.out.println("2. Add Hourly Employee ");
		System.out.println("3. Add Commission Employee ");
		System.out.println("4. Add Base Salary Commission Employee");
		System.out.println("5. Display All Employee ");
		System.out.print(" Enter your choice - ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int counter = 0;

		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Strength ");
		int totalEmployee = sc.nextInt();
		Employee[] employee = new Employee[totalEmployee];
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				if (counter < totalEmployee) {
					employee[counter] = new SalariedEmployee();
					employee[counter++].acceptData();
				} else
					System.out.println("Overflow We cant add SalariedEmployee");
			}
				break;
			case 2: {
				if (counter < totalEmployee) {
					employee[counter] = new HourlyEmployee();
					employee[counter++].acceptData();
				} else
					System.out.println("Overflow We cant add HourlyEmployee");
			}
				break;
			case 3: {
				if (counter < totalEmployee) {
					employee[counter] = new CommissionEmployee();
					employee[counter++].acceptData();

				} else
					System.out.println("Overflow We cant add CommissionEmployee");
			}
				break;
			case 4: {
				if (counter < totalEmployee) {
					employee[counter] = new BaseSalariedCommissionEmployee();
					employee[counter++].acceptData();

				} else
					System.out.println("Overflow We cant add BaseSalariedCommissionEmployee");
			}
				break;
			case 5: {
				for (int i = 0; i < counter; i++) {
					System.out.println(employee[i].toString());
					employee[i].calculateSalary();
				}
			}
				break;
			default:
				System.out.println("Entered Wrong Domain");
			}
		}
		System.out.println("Thank you!!!");

	}

}
