package matrix;

import calculator.CalculatorMatrix;
import utils.Validator;

public class ManagerMatrix {

    // ===== ADDITION =====
    public void additionMatrix() {
        System.out.println("------- Addition -------");

        int[][] matrix1 = inputFirstMatrix();

        int row2 = Validator.getInt(
                "Enter Row Matrix 2: ",
                "Values of matrix must be digit"
        );
        int col2 = Validator.getInt(
                "Enter Column Matrix 2: ",
                "Values of matrix must be digit"
        );

        if (row2 != matrix1.length || col2 != matrix1[0].length) {
            System.out.println("Matrix 2 must have same size as Matrix 1");
            return;
        }

        int[][] matrix2 = Matrix.inputMatrix(row2, col2, "Matrix2");

        System.out.println("------- Result -------");
        Matrix.displayMatrix(matrix1);
        System.out.println("+");
        Matrix.displayMatrix(matrix2);
        System.out.println("=");

        int[][] result = CalculatorMatrix.additionMatrix(matrix1, matrix2);
        Matrix.displayMatrix(result);
    }

    // ===== SUBTRACTION =====
    public void subtractionMatrix() {
        System.out.println("------- Subtraction -------");

        int[][] matrix1 = inputFirstMatrix();

        int row2 = Validator.getInt(
                "Enter Row Matrix 2: ",
                "Values of matrix must be digit"
        );
        int col2 = Validator.getInt(
                "Enter Column Matrix 2: ",
                "Values of matrix must be digit"
        );

        if (row2 != matrix1.length || col2 != matrix1[0].length) {
            System.out.println("Matrix 2 must have same size as Matrix 1");
            return;
        }

        int[][] matrix2 = Matrix.inputMatrix(row2, col2, "Matrix2");

        System.out.println("------- Result -------");
        Matrix.displayMatrix(matrix1);
        System.out.println("-");
        Matrix.displayMatrix(matrix2);
        System.out.println("=");

        int[][] result = CalculatorMatrix.subtractionMatrix(matrix1, matrix2);
        Matrix.displayMatrix(result);
    }

    // ===== MULTIPLICATION =====
    public void multiplicationMatrix() {
        System.out.println("------- Multiplication -------");

        int[][] matrix1 = inputFirstMatrix();

        int row2 = Validator.getInt(
                "Enter Row Matrix 2: ",
                "Values of matrix must be digit"
        );

        if (row2 != matrix1[0].length) {
            System.out.println("Row Matrix 2 must equal Column Matrix 1");
            return;
        }

        int col2 = Validator.getInt(
                "Enter Column Matrix 2: ",
                "Values of matrix must be digit"
        );

        int[][] matrix2 = Matrix.inputMatrix(row2, col2, "Matrix2");

        System.out.println("------- Result -------");
        Matrix.displayMatrix(matrix1);
        System.out.println("*");
        Matrix.displayMatrix(matrix2);
        System.out.println("=");

        int[][] result = CalculatorMatrix.multiplicationMatrix(matrix1, matrix2);
        Matrix.displayMatrix(result);
    }

    // ===== INPUT MATRIX 1 =====
    private int[][] inputFirstMatrix() {
        int row = Validator.getInt(
                "Enter Row Matrix 1: ",
                "Values of matrix must be digit"
        );
        int col = Validator.getInt(
                "Enter Column Matrix 1: ",
                "Values of matrix must be digit"
        );

        return Matrix.inputMatrix(row, col, "Matrix1");
    }
}
