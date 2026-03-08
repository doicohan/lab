package entity;

public class Matrix {

    private int row;
    private int col;
    private int[] data;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        data = new int[row * col];
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setValue(int r, int c, int value) {
        data[r * col + c] = value;
    }

    public int getValue(int r, int c) {
        return data[r * col + c];
    }

    public void printMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + getValue(i, j) + "]");
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix m) throws Exception {

        if (row != m.row || col != m.col) {
            throw new Exception("Matrix size must be the same");
        }

        Matrix result = new Matrix(row, col);

        for (int i = 0; i < row * col; i++) {
            result.data[i] = data[i] + m.data[i];
        }

        return result;
    }

    public Matrix subtract(Matrix m) throws Exception {

        if (row != m.row || col != m.col) {
            throw new Exception("Matrix size must be the same");
        }

        Matrix result = new Matrix(row, col);

        for (int i = 0; i < row * col; i++) {
            result.data[i] = data[i] - m.data[i];
        }

        return result;
    }

    public Matrix multiply(Matrix m) throws Exception {

        if (col != m.row) {
            throw new Exception("Column Matrix1 must equal Row Matrix2");
        }

        Matrix result = new Matrix(row, m.col);

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < m.col; j++) {

                int sum = 0;

                for (int k = 0; k < col; k++) {
                    sum += getValue(i, k) * m.getValue(k, j);
                }

                result.setValue(i, j, sum);
            }
        }

        return result;
    }
}