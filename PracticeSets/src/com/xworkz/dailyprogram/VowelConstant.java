package com.xworkz.dailyprogram;

public class VowelConstant {

    char ch;

    public static String vowelConstant(char ch){
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return "Vowels";
        }
        return "Constants";
    }

    public static void main(String[] args){
        System.out.println(vowelConstant('a'));
    }
}
