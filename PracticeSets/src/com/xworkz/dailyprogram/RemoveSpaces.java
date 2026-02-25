package com.xworkz.dailyprogram;
import java.util.Scanner;
public class RemoveSpaces {


        public String removeSpaces(String str) {
            return str.replace(" ", "");
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            RemoveSpaces rs = new RemoveSpaces();

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            String result = rs.removeSpaces(input);

            System.out.println("String after removing spaces: " + result);

            sc.close();
        }
}

