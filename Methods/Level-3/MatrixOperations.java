import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    // Method to create a random matrix with given rows and columns
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // random number from 0 to 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat2[0].length;
        int common = mat1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < common; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows for Matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int colsA = sc.nextInt();

        System.out.print("Enter number of rows for Matrix B: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int colsB = sc.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible. Columns of A must be equal to rows of B.");
            return;
        }

        // Generate matrices
        int[][] matrixA = createRandomMatrix(rowsA, colsA);
        int[][] matrixB = createRandomMatrix(rowsB, colsB);

        // Display matrices
        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Perform and display addition (only if dimensions are same)
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("\nAddition of A and B:");
            int[][] sum = addMatrices(matrixA, matrixB);
            displayMatrix(sum);

            System.out.println("\nSubtraction of A and B:");
            int[][] diff = subtractMatrices(matrixA, matrixB);
            displayMatrix(diff);
        } else {
            System.out.println("\nAddition and subtraction not possible as dimensions do not match.");
        }

        // Perform and display multiplication
        System.out.println("\nMultiplication of A and B:");
        int[][] product = multiplyMatrices(matrixA, matrixB);
        displayMatrix(product);
    }
}

