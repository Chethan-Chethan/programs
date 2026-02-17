                                    package com.xworkz.studentsmarks;

import java.util.Scanner;

public class StudentMarksRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] students = new String[n];
        int[] marks = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i] = sc.nextLine();

            System.out.print("Enter marks of " + students[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n---- Student Marks ----");

        StudentMarks.displayMarks(students, marks);
        StudentMarks.findTopper(students, marks);
        StudentMarks.calculateAverage(marks);
        StudentMarks.countPassFail(marks);

        sc.close();
    }
}

