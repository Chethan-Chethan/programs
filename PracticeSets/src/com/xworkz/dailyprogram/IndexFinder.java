package com.xworkz.dailyprogram;

public class IndexFinder {

    public void findIndexes(String input, char ch) {

        int firstIndex = input.indexOf(ch);///java 0123
        if (firstIndex == -1) {//
            System.out.println("Character not found in the string.");
        } else {
            System.out.println("Character found at index: " + firstIndex);
        }
    }
}
