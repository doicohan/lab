public class Matrix {

    public int[] additionMatrix(int[] m1, int[] m2, int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = m1[i] + m2[i];
        }
        return result;
    }

    public int[] subtractionMatrix(int[] m1, int[] m2, int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = m1[i] - m2[i];
        }
        return result;
    }

    public int[] multiplicationMatrix(int[] m1, int[] m2,
            int row1, int col1, int col2) {

        int[] result = new int[row1 * col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {

                int sum = 0;
                for (int k = 0; k < col1; k++) {
                    sum += m1[i * col1 + k] * m2[k * col2 + j];
                }
                result[i * col2 + j] = sum;
            }
        }
        return result;
    }

    public void displayMatrix(int[] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i * col + j] + "]");
            }
            System.out.println();
        }
    }
}