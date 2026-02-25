package com.xworkz.dailyprogram;

import JavaPrograms.IndexFinder;

import java.util.Scanner;

public class IndexRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = scanner.nextLine();
        System.out.println("Enter a character to find:");
        char ch = scanner.next().charAt(0);

        IndexFinder finder = new IndexFinder();

        finder.findIndexes(str, ch);

        scanner.close();
    }
}
