package ui;

import entity.Matrix;
import utils.Validator;

public class Main {

    public static void main(String[] args) {

        Validator validator = new Validator();
        Matrix matrix = new Matrix();

        while (true) {

            int choice = validator.getIntLimit(
                    "\n========= Matrix Calculator =========\n"
                            + "1. Addition\n"
                            + "2. Subtraction\n"
                            + "3. Multiplication\n"
                            + "4. Exit\n"
                            + "Your choice: ", 1, 4);

            switch (choice) {

                // ================= ADD =================
                case 1:
                    System.out.println("-------- Addition --------");

                    int row1 = validator.getPositiveInt("Enter Row Matrix 1: ");
                    int col1 = validator.getPositiveInt("Enter Column Matrix 1: ");

                    int[] m1 = new int[row1 * col1];

                    for (int i = 0; i < row1; i++) {
                        for (int j = 0; j < col1; j++) {
                            m1[i * col1 + j] =
                                    validator.getInt("Enter Matrix 1["
                                            + (i + 1) + "]["
                                            + (j + 1) + "]: ");
                        }
                    }

                    int row2 = validator.getPositiveInt("Enter Row Matrix 2: ");
                    int col2 = validator.getPositiveInt("Enter Column Matrix 2: ");

                    int[] m2 = new int[row2 * col2];

                    for (int i = 0; i < row2; i++) {
                        for (int j = 0; j < col2; j++) {
                            m2[i * col2 + j] =
                                    validator.getInt("Enter Matrix 2["
                                            + (i + 1) + "]["
                                            + (j + 1) + "]: ");
                        }
                    }

                    if (row1 != row2 || col1 != col2) {
                        System.out.println("Two matrices must have same dimension");
                        break;
                    }

                    int[] addResult =
                            matrix.additionMatrix(m1, m2, row1, col1);

                    matrix.displayMatrix(m1, row1, col1);
                    System.out.println("+");
                    matrix.displayMatrix(m2, row2, col2);
                    System.out.println("=");
                    matrix.displayMatrix(addResult, row1, col1);
                    break;

                // ================= SUB =================
                case 2:
                    System.out.println("-------- Subtraction --------");

                    row1 = validator.getPositiveInt("Enter Row Matrix 1: ");
                    col1 = validator.getPositiveInt("Enter Column Matrix 1: ");

                    m1 = new int[row1 * col1];

                    for (int i = 0; i < row1; i++) {
                        for (int j = 0; j < col1; j++) {
                            m1[i * col1 + j] =
                                    validator.getInt("Enter Matrix 1["
                                            + (i + 1) + "]["
                                            + (j + 1) + "]: ");
                        }
                    }

                    row2 = validator.getPositiveInt("Enter Row Matrix 2: ");
                    col2 = validator.getPositiveInt("Enter Column Matrix 2: ");

                    m2 = new int[row2 * col2];

                    for (int i = 0; i < row2; i++) {
                        for (int j = 0; j < col2; j++) {
                            m2[i * col2 + j] =
                                    validator.getInt("Enter Matrix 2["
                                            + (i + 1) + "]["
                                            + (j + 1) + "]: ");
                        }
                    }

                    if (row1 != row2 || col1 != col2) {
                        System.out.println("Two matrices must have same dimension");
                        break;
                    }

                    int[] subResult =
                            matrix.subtractionMatrix(m1, m2, row1, col1);

                    matrix.displayMatrix(m1, row1, col1);
                    System.out.println("-");
                    matrix.displayMatrix(m2, row2, col2);
                    System.out.println("=");
                    matrix.displayMatrix(subResult, row1, col1);
                    break;

                // ================= MUL =================
                case 3:
                    System.out.println("-------- Multiplication --------");

                    row1 = validator.getPositiveInt("Enter Row Matrix 1: ");
                    col1 = validator.getPositiveInt("Enter Column Matrix 1: ");

                    m1 = new int[row1 * col1];

                    for (int i = 0; i < row1; i++) {
                        for (int j = 0; j < col1; j++) {
                            m1[i * col1 + j] =
                                    validator.getInt("Enter Matrix 1["
                                            + (i + 1) + "]["
                                            + (j + 1) + "]: ");
                        }
                    }

                    row2 = validator.getPositiveInt("Enter Row Matrix 2: ");
                    col2 = validator.getPositiveInt("Enter Column Matrix 2: ");

                    m2 = new int[row2 * col2];

                    for (int i = 0; i < row2; i++) {
                        for (int j = 0; j < col2; j++) {
                            m2[i * col2 + j] =
                                    validator.getInt("Enter Matrix 2["
                                            + (i + 1) + "]["
                                            + (j + 1) + "]: ");
                        }
                    }

                    if (col1 != row2) {
                        System.out.println("Column of Matrix 1 must equal Row of Matrix 2");
                        break;
                    }

                    int[] mulResult =
                            matrix.multiplicationMatrix(
                                    m1, m2, row1, col1, row2, col2);

                    matrix.displayMatrix(m1, row1, col1);
                    System.out.println("*");
                    matrix.displayMatrix(m2, row2, col2);
                    System.out.println("=");
                    matrix.displayMatrix(mulResult, row1, col2);
                    break;

                case 4:
                    System.out.println("Program terminated.");
                    return;
            }
        }
    }
}