package com.xworkz.dailyprogram;
import java.util.Scanner;

public class CountCharacter {
    public static int countCharacter(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) { // Kavya shree
            if (str.charAt(i) != ' ')
                count++;

        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word:");
        String str=sc.nextLine();


        int result=countCharacter(str);
        System.out.println("Character count:"+result);
    }
}
