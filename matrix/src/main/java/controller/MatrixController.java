package controller;

import entity.Matrix;
import utils.Validator;

public class MatrixController {

    private Matrix matrix = new Matrix();

    public void addition() {
        System.out.println("----- Addition -----");

        int[][] m1 = inputMatrix(1);
        int[][] m2 = inputMatrix(2);

        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            System.out.println("Two matrices must have the same size");
            return;
        }

        printResult(m1, "+", m2, matrix.additionMatrix(m1, m2));
    }

    public void subtraction() {
        System.out.println("----- Subtraction -----");

        int[][] m1 = inputMatrix(1);
        int[][] m2 = inputMatrix(2);

        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            System.out.println("Two matrices must have the same size");
            return;
        }

        printResult(m1, "-", m2, matrix.subtractionMatrix(m1, m2));
    }

    public void multiplication() {
        System.out.println("----- Multiplication -----");

        int[][] m1 = inputMatrix(1);
        int[][] m2 = inputMatrix(2);

        if (m1[0].length != m2.length) {
            System.out.println("Column of matrix 1 must equal row of matrix 2");
            return;
        }

        printResult(m1, "*", m2, matrix.multiplicationMatrix(m1, m2));
    }

    /* ================= helper ================= */

    private int[][] inputMatrix(int index) {
        int r = Validator.getInt("Enter Row Matrix " + index + ": ", "Row must be > 0", 1, 100);
        int c = Validator.getInt("Enter Column Matrix " + index + ": ", "Column must be > 0", 1, 100);

        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = Validator.getInt(
                        "Enter Matrix" + index + "[" + (i + 1) + "][" + (j + 1) + "]: ",
                        "Values of matrix must be the number"
                );
        return m;
    }

    private void printResult(int[][] a, String op, int[][] b, int[][] res) {
        System.out.println("------ Result ------");
        printMatrix(a);
        System.out.println(op);
        printMatrix(b);
        System.out.println("=");
        printMatrix(res);
    }

    private void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int v : row)
                System.out.print("[" + v + "]");
            System.out.println();
        }
    }
}
