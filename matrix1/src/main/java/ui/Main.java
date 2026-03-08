package ui;

import entity.Matrix;
import util.Validator;

public class Main {

    static Validator validator = new Validator();

    public static void main(String[] args) {

        while (true) {

            System.out.println("=======Calculator program=======");
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");

            int choice = validator.getIntLimit("Your choice: ", 1, 4);

            try {

                Matrix m1 = inputMatrix(1);
                Matrix m2 = inputMatrix(2);
                Matrix result = null;

                switch (choice) {

                    case 1:
                        result = m1.add(m2);
                        printResult(m1, m2, result, "+");
                        break;

                    case 2:
                        result = m1.subtract(m2);
                        printResult(m1, m2, result, "-");
                        break;

                    case 3:
                        result = m1.multiply(m2);
                        printResult(m1, m2, result, "*");
                        break;

                    case 4:
                        return;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static Matrix inputMatrix(int index) {

        int row = validator.getPositiveInt("Enter Row Matrix " + index + ": ");
        int col = validator.getPositiveInt("Enter Column Matrix " + index + ": ");

        Matrix matrix = new Matrix(row, col);

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                int value = validator.getInt(
                        "Enter Matrix" + index + "[" + (i + 1) + "][" + (j + 1) + "]: ");

                matrix.setValue(i, j, value);
            }
        }

        return matrix;
    }

    static void printResult(Matrix m1, Matrix m2, Matrix result, String op) {

        System.out.println("------- Result -------");

        m1.printMatrix();
        System.out.println(op);
        m2.printMatrix();
        System.out.println("=");
        result.printMatrix();
    }
}