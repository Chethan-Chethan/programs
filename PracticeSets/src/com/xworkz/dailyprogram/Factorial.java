package com.xworkz.dailyprogram;

public class Factorial {

    public static int findFactorial(int n) {

        int fact = 1;// 6 24
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
