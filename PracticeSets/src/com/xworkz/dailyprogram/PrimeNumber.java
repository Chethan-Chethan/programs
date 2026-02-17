package com.xworkz.dailyprogram;

public class PrimeNumber {

    // Method to check whether number is Prime
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
