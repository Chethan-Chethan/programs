package com.xworkz.dailyprogram;

class GfG{


    public static String isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

//madam
        while (left < right) {

            if (s.charAt(left) != s.charAt(right))
                return "It is not panlindrom";

            left++;
            right--;
        }

        return "It is panlindrome";
    }

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(isPalindrome(s));
    }
}
