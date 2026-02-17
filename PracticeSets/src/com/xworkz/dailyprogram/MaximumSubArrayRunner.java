package com.xworkz.dailyprogram;

import java.util.Scanner;

public class MaximumSubArrayRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = MaximumSubArray.findMaxSubarray(arr);

        System.out.println("Maximum Subarray Sum: " + result);

        sc.close();
    }
}
