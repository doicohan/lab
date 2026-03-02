package entity;

public class Matrix {

    // ===== ADDITION =====
    public int[] additionMatrix(int[] m1, int[] m2, int row, int col) {

        int[] result = new int[row * col];

        for (int i = 0; i < row * col; i++) {
            result[i] = m1[i] + m2[i];
        }

        return result;
    }

    // ===== SUBTRACTION =====
    public int[] subtractionMatrix(int[] m1, int[] m2, int row, int col) {

        int[] result = new int[row * col];

        for (int i = 0; i < row * col; i++) {
            result[i] = m1[i] - m2[i];
        }

        return result;
    }

    // ===== MULTIPLICATION =====
    public int[] multiplicationMatrix(int[] m1, int[] m2,
                                      int row1, int col1,
                                      int row2, int col2) {

        int[] result = new int[row1 * col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {

                    result[i * col2 + j] +=
                            m1[i * col1 + k] *
                            m2[k * col2 + j];
                }
            }
        }

        return result;
    }

    // ===== DISPLAY =====
    public void displayMatrix(int[] matrix, int row, int col) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i * col + j] + "]");
            }
            System.out.println();
        }
    }
}