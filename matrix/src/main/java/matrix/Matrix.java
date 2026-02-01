package matrix;

import utils.Validator;

public class Matrix {

    public static int[][] inputMatrix(int row, int col, String name) {
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Validator.getInt(
                        "Enter " + name + "[" + (i + 1) + "][" + (j + 1) + "]: ",
                        "Values of matrix is digit"
                );
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print("[" + value + "]");
            }
            System.out.println();
        }
    }
}
