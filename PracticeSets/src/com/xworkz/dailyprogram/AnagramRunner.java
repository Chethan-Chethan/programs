package com.xworkz.dailyprogram;
import JavaPrograms.AnagramCheck;
public class AnagramRunner {
    public static void main(String[] args) {

        String s1 = "heart";
        String s2 = "earth";

        boolean result = AnagramCheck.isAnagram(s1, s2);

        if (result) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
