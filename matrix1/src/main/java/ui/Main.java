package ui;

import entity.Matrix;
import utils.Validator;

public class Main {

    public static void main(String[] args) {

        Validator validator = new Validator();
        Matrix matrix = new Matrix();

        while (true) {

            int choice = validator.getIntLimit(
                    "=========Calculator program=========\n"
                    + "1. Addition Matrix\n"
                    + "2. Subtraction Matrix\n"
                    + "3. Multiplication Matrix\n"
                    + "4. Quit\n"
                    + "Your choice: ", 1, 4);

            switch (choice) {

                case 1:
                    System.out.println("-------- Addition --------");

                    int row1 = validator.getInt("Enter Row Matrix 1: ");
                    int col1 = validator.getInt("Enter Column Matrix 1: ");
                    int[] m1 = validator.inputMatrix(row1, col1, 1);

                    int row2 = validator.getInt("Enter Row Matrix 2: ");
                    int col2 = validator.getInt("Enter Column Matrix 2: ");
                    int[] m2 = validator.inputMatrix(row2, col2, 2);

                    if (row1 != row2 || col1 != col2) {
                        System.out.println("Two matrix must have same dimension");
                        break;
                    }

                    int[] addResult =
                            matrix.additionMatrix(m1, m2, row1, col1);

                    System.out.println("-------- Result --------");
                    matrix.displayMatrix(m1, row1, col1);
                    System.out.println("+");
                    matrix.displayMatrix(m2, row2, col2);
                    System.out.println("=");
                    matrix.displayMatrix(addResult, row1, col1);
                    break;

                case 2:
                    System.out.println("-------- Subtraction --------");

                    row1 = validator.getInt("Enter Row Matrix 1: ");
                    col1 = validator.getInt("Enter Column Matrix 1: ");
                    m1 = validator.inputMatrix(row1, col1, 1);

                    row2 = validator.getInt("Enter Row Matrix 2: ");
                    col2 = validator.getInt("Enter Column Matrix 2: ");
                    m2 = validator.inputMatrix(row2, col2, 2);

                    if (row1 != row2 || col1 != col2) {
                        System.out.println("Two matrix must have same dimension");
                        break;
                    }

                    int[] subResult =
                            matrix.subtractionMatrix(m1, m2, row1, col1);

                    System.out.println("-------- Result --------");
                    matrix.displayMatrix(m1, row1, col1);
                    System.out.println("-");
                    matrix.displayMatrix(m2, row2, col2);
                    System.out.println("=");
                    matrix.displayMatrix(subResult, row1, col1);
                    break;

                case 3:
                    System.out.println("-------- Multiplication --------");

                    row1 = validator.getInt("Enter Row Matrix 1: ");
                    col1 = validator.getInt("Enter Column Matrix 1: ");
                    m1 = validator.inputMatrix(row1, col1, 1);

                    row2 = validator.getInt("Enter Row Matrix 2: ");
                    col2 = validator.getInt("Enter Column Matrix 2: ");
                    m2 = validator.inputMatrix(row2, col2, 2);

                    if (col1 != row2) {
                        System.out.println("Column of Matrix 1 must equal Row of Matrix 2");
                        break;
                    }

                    int[] mulResult =
                            matrix.multiplicationMatrix(
                                    m1, m2, row1, col1, row2, col2);

                    System.out.println("-------- Result --------");
                    matrix.displayMatrix(m1, row1, col1);
                    System.out.println("*");
                    matrix.displayMatrix(m2, row2, col2);
                    System.out.println("=");
                    matrix.displayMatrix(mulResult, row1, col2);
                    break;

                case 4:
                    return;
            }
        }
    }
}