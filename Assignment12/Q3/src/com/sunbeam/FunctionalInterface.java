package com.sunbeam;


import java.util.Scanner;

//@FunctionalInterface
interface Arithmetic {
    double calc(double num1, double num2);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Enter the second number: ");
                    double num2 = scanner.nextDouble();
                    calculate(num1, num2, (x, y) -> x + y);
                    break;
                case 2:
                    System.out.println("Enter the first number: ");
                    double num3 = scanner.nextDouble();
                    System.out.println("Enter the second number: ");
                    double num4 = scanner.nextDouble();
                    calculate(num3, num4, (x, y) -> x - y);
                    break;
                case 3:
                    System.out.println("Enter the first number: ");
                    double num5 = scanner.nextDouble();
                    System.out.println("Enter the second number: ");
                    double num6 = scanner.nextDouble();
                    calculate(num5, num6, (x, y) -> x * y);
                    break;
                case 4:
                    System.out.println("Enter the first number: ");
                    double num7 = scanner.nextDouble();
                    System.out.println("Enter the second number: ");
                    double num8 = scanner.nextDouble();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }

    static void calculate(double num1, double num2, Arithmetic op) {
        double result = op.calc(num1, num2);
        System.out.println("Result: " + result);
    }
}
