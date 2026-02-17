package com.xworkz.dailyprogram;

import java.util.Scanner;

public class ArmstrongRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean result = Armstrong.isArmstrong(number);

        if (result) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }

        sc.close();
    }
}
