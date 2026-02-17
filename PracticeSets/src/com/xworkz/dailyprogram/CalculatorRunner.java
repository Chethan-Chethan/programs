package com.xworkz.dailyprogram;

import java.util.Scanner;

public class CalculatorRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Simple Calculator =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Power");
        System.out.println("7. Square");
        System.out.println("8. Square Root");

        System.out.print("Choose operation (1-8): ");
        int choice = sc.nextInt();

        double num1, num2, result = 0;

        switch (choice) {

            case 1:
                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                result = Calculator.add(num1, num2);
                break;

            case 2:
                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                result = Calculator.subtract(num1, num2);
                break;

            case 3:
                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                result = Calculator.multiply(num1, num2);
                break;

            case 4:
                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                result = Calculator.divide(num1, num2);
                break;

            case 5:
                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                result = Calculator.modulus(num1, num2);
                break;

            case 6:
                System.out.print("Enter base and exponent: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                result = Calculator.power(num1, num2);
                break;

            case 7:
                System.out.print("Enter a number: ");
                num1 = sc.nextDouble();
                result = Calculator.square(num1);
                break;

            case 8:
                System.out.print("Enter a number: ");
                num1 = sc.nextDouble();
                result = Calculator.squareRoot(num1);
                break;

            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}
