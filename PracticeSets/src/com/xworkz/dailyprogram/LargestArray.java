package com.xworkz.dailyprogram;

public class LargestArray {
    public static void main(String[] args) {
        int [] arr ={1,60,500,0,5,30,20};
        int max=arr[0];

        for (int i=1;i<=arr.length-1;i++){
            if (arr[i]>max){
                max=arr[i];
            }
//          System.out.println("largest:" +max);
        }
        System.out.println("largest:" +max);
    }
}
