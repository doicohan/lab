package entity;

public class Matrix {

    private int[][] data;

    public Matrix(int row, int col) {
        data = new int[row][col];
    }

    public int[][] getData() {
        return data;
    }

    public void setValue(int row, int col, int value) {
        data[row][col] = value;
    }

    public int getRow() {
        return data.length;
    }

    public int getCol() {
        return data[0].length;
    }

    // ===== Addition =====
    public Matrix addition(Matrix other) {
        Matrix result = new Matrix(getRow(), getCol());

        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getCol(); j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    // ===== Subtraction =====
    public Matrix subtraction(Matrix other) {
        Matrix result = new Matrix(getRow(), getCol());

        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getCol(); j++) {
                result.data[i][j] = this.data[i][j] - other.data[i][j];
            }
        }
        return result;
    }

    // ===== Multiplication =====
    public Matrix multiplication(Matrix other) {
        Matrix result = new Matrix(getRow(), other.getCol());

        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < other.getCol(); j++) {
                for (int k = 0; k < getCol(); k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }
}
