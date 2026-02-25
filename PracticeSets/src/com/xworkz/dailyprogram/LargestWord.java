package com.xworkz.dailyprogram;
import java.util.Scanner;

public class LargestWord {
    public String findLargestWord(String str){
        String[] words = str.split("\\s+");
        String largest="";
        for(String word:words){
            if(word.length() > largest.length()){
                largest=word;
            }
        }
        return largest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LargestWord lw = new LargestWord();

        System.out.println("Enter a String:");
        String input = sc.nextLine();

        String largest= lw.findLargestWord(input);
        System.out.println("The largest word is:"+largest);

        sc.close();
    }
}
