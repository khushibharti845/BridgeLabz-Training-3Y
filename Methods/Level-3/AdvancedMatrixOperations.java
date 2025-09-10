import java.util.Random;
import java.util.Scanner;

public class AdvancedMatrixOperations {

    // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random integer between 0-9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }

    // Method to find the transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find the determinant of a 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        double a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
        double d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
        double g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];
        return a * (e * i - f * h)
             - b * (d * i - f * g)
             + c * (d * h - e * g);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Inverse does not exist (determinant is 0).");
            return null;
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Inverse does not exist (determinant is 0).");
            return null;
        }
        double[][] inverse = new double[3][3];

        // Find the matrix of minors, cofactors, and adjugate (transpose of cofactors)
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / det;
        inverse[0][1] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]) / det;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / det;

        inverse[1][0] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) / det;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / det;
        inverse[1][2] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]) / det;

        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / det;
        inverse[2][1] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]) / det;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / det;

        return inverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Handle 2x2 matrix
        System.out.println("2x2 Matrix Operations:");
        double[][] matrix2x2 = createRandomMatrix(2, 2);
        System.out.println("Original 2x2 matrix:");
        displayMatrix(matrix2x2);

        System.out.println("\nTranspose of 2x2 matrix:");
        displayMatrix(transposeMatrix(matrix2x2));

        double det2x2 = determinant2x2(matrix2x2);
        System.out.println("\nDeterminant of 2x2 matrix: " + det2x2);

        System.out.println("\nInverse of 2x2 matrix:");
        double[][] inv2x2 = inverse2x2(matrix2x2);
        if (inv2x2 != null) {
            displayMatrix(inv2x2);
        }

        // Handle 3x3 matrix
        System.out.println("\n\n3x3 Matrix Operations:");
        double[][] matrix3x3 = createRandomMatrix(3, 3);
        System.out.println("Original 3x3 matrix:");
        displayMatrix(matrix3x3);

        System.out.println("\nTranspose of 3x3 matrix:");
        displayMatrix(transposeMatrix(matrix3x3));

        double det3x3 = determinant3x3(matrix3x3);
        System.out.println("\nDeterminant of 3x3 matrix: " + det3x3);

        System.out.println("\nInverse of 3x3 matrix:");
        double[][] inv3x3 = inverse3x3(matrix3x3);
        if (inv3x3 != null) {
            displayMatrix(inv3x3);
        }
    }
}
