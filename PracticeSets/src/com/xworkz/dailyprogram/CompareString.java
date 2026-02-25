package com.xworkz.dailyprogram;
import java.util.Scanner;
public class CompareString {

    public boolean isEqual(String s1,String s2){
        return s1.equals(s2);
    }
    public boolean isEqualIgnoreCase(String s1,String s2){
        return s1.equalsIgnoreCase(s2);
    }

    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        CompareString comp = new CompareString();

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();


        if (comp.isEqual(s1, s2)) {
            System.out.println("Strings are equal (case sensitive)");
        } else {
            System.out.println("Strings are NOT equal (case sensitive)");
        }


        if (comp.isEqualIgnoreCase(s1, s2)) {
            System.out.println("Strings are equal (ignore case)");
        } else {
            System.out.println("Strings are NOT equal (ignore case)");
        }

        sc.close();
    }
}
