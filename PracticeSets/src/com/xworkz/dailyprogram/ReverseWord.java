package com.xworkz.dailyprogram;

public class ReverseWord {
    public static String reverseEachWord(String sentence){
        String[] words=sentence.split(" ");
        StringBuilder result= new StringBuilder();

        for(String word:words){
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();//ollh
            result.append(reversedWord).append(" ");

        }
        return result.toString().trim();
    }
    public static void main(String[] args){
        String input="Hello World Java Programming";
        String output=reverseEachWord(input);
        System.out.println("Original sentence :\""+input+"\"");
        System.out.println("Sentence with words reversed: \""+ output+"\"");
    }
}
