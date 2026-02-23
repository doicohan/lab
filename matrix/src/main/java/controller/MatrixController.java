package controller;

import entity.Matrix;
import utils.Validator;

public class MatrixController {

    /* ================= INPUT MATRIX 1 ================= */
    private Matrix inputMatrix1() {

        int row = Validator.getInt(
                "Enter Row Matrix 1: ",
                "Row must be greater than 0",
                "Row must be number",
                1, Integer.MAX_VALUE);

        int col = Validator.getInt(
                "Enter Column Matrix 1: ",
                "Column must be greater than 0",
                "Column must be number",
                1, Integer.MAX_VALUE);

        Matrix matrix = new Matrix(row, col);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                int value = Validator.getInt(
                        "Enter Matrix1[" + (i + 1) + "][" + (j + 1) + "]: ",
                        "Value of matrix is digit",
                        "Value of matrix is digit",
                        Integer.MIN_VALUE, Integer.MAX_VALUE);

                matrix.setValue(i, j, value);
            }
        }

        return matrix;
    }

    /* ================= PRINT MATRIX ================= */
    private void printMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getCol(); j++) {
                System.out.print("[" + matrix.getData()[i][j] + "]");
            }
            System.out.println();
        }
    }

    /* ================= ADDITION ================= */
    public void addition() {

        System.out.println("------- Addition -------");

        Matrix m1 = inputMatrix1();

        int row2;
        int col2;

        // check size trước khi nhập giá trị
        while (true) {
            row2 = Validator.getInt(
                    "Enter Row Matrix 2: ",
                    "Row must be greater than 0",
                    "Row must be number",
                    1, Integer.MAX_VALUE);

            col2 = Validator.getInt(
                    "Enter Column Matrix 2: ",
                    "Column must be greater than 0",
                    "Column must be number",
                    1, Integer.MAX_VALUE);

            if (row2 == m1.getRow() && col2 == m1.getCol()) {
                break;
            } else {
                System.out.println("Two matrices must have the same size");
            }
        }

        Matrix m2 = new Matrix(row2, col2);

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {

                int value = Validator.getInt(
                        "Enter Matrix2[" + (i + 1) + "][" + (j + 1) + "]: ",
                        "Value of matrix is digit",
                        "Value of matrix is digit",
                        Integer.MIN_VALUE, Integer.MAX_VALUE);

                m2.setValue(i, j, value);
            }
        }

        Matrix result = m1.addition(m2);

        System.out.println("------- Result -------");
        printMatrix(m1);
        System.out.println("+");
        printMatrix(m2);
        System.out.println("=");
        printMatrix(result);
    }

    /* ================= SUBTRACTION ================= */
    public void subtraction() {

        System.out.println("------- Subtraction -------");

        Matrix m1 = inputMatrix1();

        int row2;
        int col2;

        while (true) {
            row2 = Validator.getInt(
                    "Enter Row Matrix 2: ",
                    "Row must be greater than 0",
                    "Row must be number",
                    1, Integer.MAX_VALUE);

            col2 = Validator.getInt(
                    "Enter Column Matrix 2: ",
                    "Column must be greater than 0",
                    "Column must be number",
                    1, Integer.MAX_VALUE);

            if (row2 == m1.getRow() && col2 == m1.getCol()) {
                break;
            } else {
                System.out.println("Two matrices must have the same size");
            }
        }

        Matrix m2 = new Matrix(row2, col2);

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {

                int value = Validator.getInt(
                        "Enter Matrix2[" + (i + 1) + "][" + (j + 1) + "]: ",
                        "Value of matrix is digit",
                        "Value of matrix is digit",
                        Integer.MIN_VALUE, Integer.MAX_VALUE);

                m2.setValue(i, j, value);
            }
        }

        Matrix result = m1.subtraction(m2);

        System.out.println("------- Result -------");
        printMatrix(m1);
        System.out.println("-");
        printMatrix(m2);
        System.out.println("=");
        printMatrix(result);
    }

    /* ================= MULTIPLICATION ================= */
    public void multiplication() {

        System.out.println("------- Multiplication -------");

        Matrix m1 = inputMatrix1();

        int row2;
        int col2;

        while (true) {
            row2 = Validator.getInt(
                    "Enter Row Matrix 2: ",
                    "Row must be greater than 0",
                    "Row must be number",
                    1, Integer.MAX_VALUE);

            col2 = Validator.getInt(
                    "Enter Column Matrix 2: ",
                    "Column must be greater than 0",
                    "Column must be number",
                    1, Integer.MAX_VALUE);

            if (m1.getCol() == row2) {
                break;
            } else {
                System.out.println(
                        "Column of Matrix 1 must equal Row of Matrix 2");
            }
        }

        Matrix m2 = new Matrix(row2, col2);

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {

                int value = Validator.getInt(
                        "Enter Matrix2[" + (i + 1) + "][" + (j + 1) + "]: ",
                        "Value of matrix is digit",
                        "Value of matrix is digit",
                        Integer.MIN_VALUE, Integer.MAX_VALUE);

                m2.setValue(i, j, value);
            }
        }

        Matrix result = m1.multiplication(m2);

        System.out.println("------- Result -------");
        printMatrix(m1);
        System.out.println("*");
        printMatrix(m2);
        System.out.println("=");
        printMatrix(result);
    }
}
