package com.xworkz.dailyprogram;

import java.util.Scanner;

public class PrimeRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean result = PrimeNumber.isPrime(number);

        if (result) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is not a Prime number");
        }

        sc.close();
    }
}
