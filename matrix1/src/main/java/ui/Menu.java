package ui;

import entity.Matrix;
import utils.Validator;

public class Menu {

    public void displayMenu() {
        System.out.println("========= Calculator Program =========");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Exit");
    }

    public void process() {
        while (true) {
            displayMenu();

            int choice = Validator.getInt(
                    "Please choose (1-4): ",
                    "Please choose from 1 to 4!",
                    "Please input an integer!",
                    1, 4);

            switch (choice) {
                case 1:
                    calculate(1);
                    break;
                case 2:
                    calculate(2);
                    break;
                case 3:
                    calculate(3);
                    break;
                case 4:
                    return;
            }
        }
    }

    // ================= INPUT MATRIX 1 =================
    private Matrix inputMatrix1() {

        int row = Validator.getInt(
                "Enter Row Matrix 1: ",
                "Row must be >= 1",
                "Row must be integer",
                1, Integer.MAX_VALUE);

        int col = Validator.getInt(
                "Enter Column Matrix 1: ",
                "Column must be >= 1",
                "Column must be integer",
                1, Integer.MAX_VALUE);

        Matrix matrix = new Matrix(row, col);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                int value = Validator.getInt(
                        "Enter Matrix1[" + (i + 1) + "][" + (j + 1) + "]: ",
                        "Value out of range",
                        "Value of matrix must be the number",
                        Integer.MIN_VALUE,
                        Integer.MAX_VALUE);

                matrix.setValue(i, j, value);
            }
        }
        return matrix;
    }

    // ================= INPUT MATRIX 2 (CHUNG) =================
    private Matrix inputMatrix2(Matrix m1, int type) {

        int row2, col2;

        do {
            row2 = Validator.getInt(
                    "Enter Row Matrix 2: ",
                    "Row must be >= 1",
                    "Row must be integer",
                    1, Integer.MAX_VALUE);

            col2 = Validator.getInt(
                    "Enter Column Matrix 2: ",
                    "Column must be >= 1",
                    "Column must be integer",
                    1, Integer.MAX_VALUE);

            if (type == 1 || type == 2) {
                if (row2 != m1.getRow() || col2 != m1.getCol()) {
                    System.out.println("Matrix 2 must have same size as Matrix 1 ");
                }
            }

            if (type == 3) {
                if (row2 != m1.getCol()) {
                    System.out.println("Row Matrix 2 must equal Column Matrix 1 ");
                }
            }

        } while ((type == 1 || type == 2)
                ? (row2 != m1.getRow() || col2 != m1.getCol())
                : (row2 != m1.getCol()));

        Matrix m2 = new Matrix(row2, col2);

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                int value = Validator.getInt(
                        "Enter Matrix2[" + (i + 1) + "][" + (j + 1) + "]: ",
                        "Value out of range",
                        "Value of matrix must be the number",
                        Integer.MIN_VALUE,
                        Integer.MAX_VALUE);

                m2.setValue(i, j, value);
            }
        }

        return m2;
    }

    // ================= DISPLAY =================
    private void displayMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getCol(); j++) {
                System.out.print("[" + matrix.getData()[i][j] + "]");
            }
            System.out.println();
        }
    }

    // ================= CALCULATE CHUNG =================
    private void calculate(int type) {

        if (type == 1) {
            System.out.println("--------- Addition ---------");
        } else if (type == 2) {
            System.out.println("--------- Subtraction ---------");
        } else {
            System.out.println("--------- Multiplication ---------");
        }

        Matrix m1 = inputMatrix1();
        Matrix m2 = inputMatrix2(m1, type);
        Matrix result = null;

        if (type == 1) {
            result = m1.addition(m2);
        } else if (type == 2) {
            result = m1.subtraction(m2);
        } else {
            result = m1.multiplication(m2);
        }

        System.out.println("--------- Result ---------");
        displayMatrix(m1);

        if (type == 1) {
            System.out.println("+");
        }
        if (type == 2) {
            System.out.println("-");
        }
        if (type == 3) {
            System.out.println("*");
        }

        displayMatrix(m2);
        System.out.println("=");
        displayMatrix(result);
    }
}
