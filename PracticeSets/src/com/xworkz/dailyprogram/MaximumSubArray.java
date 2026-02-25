package com.xworkz.dailyprogram;

public class MaximumSubArray {

    // Method to find maximum subarray sum
    public static int findMaxSubarray(int[] arr) {

        int maxSoFar = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);// 5

            maxSoFar = Math.max(maxSoFar, currentSum);// 5
        }

        return maxSoFar;
    }
}
