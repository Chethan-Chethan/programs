package com.xworkz.dailyprogram;

public class MissingMultiplesOfNumber {

    public static void main(String[] args) {

        int[] arr = {5, 10, 20, 30};
        int n = 30;

        System.out.println("Missing multiples of 5 are:");

        for (int i = 5; i <= n; i = i + 5) {   // generate multiples of 5

            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                        found = true;
                        break;
                    }
                }

            if (found == false) {
                System.out.println(i);
                }
            }
        }
}
