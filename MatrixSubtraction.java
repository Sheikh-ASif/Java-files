package com.AsifjavaTutorial;

import java.util.Scanner;

public class MatrixSubtraction {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get dimensions of matrices from the user
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Declare two matrices
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] resultMatrix = new int[rows][columns];

        // Input matrix1 from the user
        System.out.println("Enter elements of matrix1:");
        inputMatrix(matrix1, sc);

        // Input matrix2 from the user
        System.out.println("Enter elements of matrix2:");
        inputMatrix(matrix2, sc);

        // Perform addition of matrices
        addMatrices(matrix1, matrix2, resultMatrix);

        // Display the result matrix
        System.out.println("Subtraction of the matrices is:");
        displayMatrix(resultMatrix);

        // Close the scanner to avoid resource leak
        sc.close();
    }

    // Function to input elements of a matrix
    public static void inputMatrix(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Function to add two matrices
    public static void addMatrices(int[][] matrix1, int[][] matrix2, int[][] resultMatrix) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
    }

    // Function to display elements of a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
