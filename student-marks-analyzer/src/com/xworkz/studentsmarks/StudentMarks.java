package com.xworkz.studentsmarks;

public class StudentMarks {

    static void displayMarks(String[] students, int[] marks) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " : " + marks[i]);
        }
    }

    static void findTopper(String[] students, int[] marks) {
        int max = marks[0];
        int index = 0;

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
                index = i;
            }
        }

        System.out.println("\nTopper: " + students[index] + " with marks " + max);
    }

    static void calculateAverage(int[] marks) {
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        double average = (double) sum / marks.length;
        System.out.println("Average Marks: " + average);
    }


    static void countPassFail(int[] marks) {
        int pass = 0;
        int fail = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 40) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("Passed: " + pass);
        System.out.println("Failed: " + fail);
    }
}
