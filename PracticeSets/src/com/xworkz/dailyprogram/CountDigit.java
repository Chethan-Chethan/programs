package com.xworkz.dailyprogram;

public class CountDigit {
    public static int countDigit(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c))
            {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args){
        String text = "Welcome to Java Programming 1970";

        int result = countDigit(text);
        System.out.println("Digits:"+result);
    }
}
