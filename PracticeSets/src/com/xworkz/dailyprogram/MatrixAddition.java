package com.xworkz.dailyprogram;

public class MatrixAddition {

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

}
