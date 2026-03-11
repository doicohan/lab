package entity;

import utils.Validator;

public class Matrix {

    private int row;
    private int col;
    private int[][] data;

    private Matrix m1;
    private Matrix m2;
    private String op;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        data = new int[row][col];
    }

    public void input(Validator v, int index) {

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                data[i][j] = v.getInt(
                        "Enter Matrix" + index + "[" + (i + 1) + "][" + (j + 1) + "]: ");

            }
        }
    }

    public void output() {

        System.out.println("------- Result -------");

        if (m1 != null && m2 != null) {

            for (int i = 0; i < m1.row; i++) {
                for (int j = 0; j < m1.col; j++) {
                    System.out.print("[" + m1.data[i][j] + "]");
                }
                System.out.println();
            }

            System.out.println(op);

            for (int i = 0; i < m2.row; i++) {
                for (int j = 0; j < m2.col; j++) {
                    System.out.print("[" + m2.data[i][j] + "]");
                }
                System.out.println();
            }

            System.out.println("=");
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + data[i][j] + "]");
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix b) {

        if (row != b.row || col != b.col) {
            throw new RuntimeException("Matrix must have same size");
        }

        Matrix result = new Matrix(row, col);

        result.m1 = this;
        result.m2 = b;
        result.op = "+";

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                result.data[i][j] = data[i][j] + b.data[i][j];

            }
        }

        return result;
    }

    public Matrix sub(Matrix b) {

        if (row != b.row || col != b.col) {
            throw new RuntimeException("Matrix must have same size");
        }

        Matrix result = new Matrix(row, col);

        result.m1 = this;
        result.m2 = b;
        result.op = "-";

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                result.data[i][j] = data[i][j] - b.data[i][j];

            }
        }

        return result;
    }

    public Matrix mul(Matrix b) {

        if (col != b.row) {
            throw new RuntimeException("Column Matrix1 must equal Row Matrix2");
        }

        Matrix result = new Matrix(row, b.col);

        result.m1 = this;
        result.m2 = b;
        result.op = "*";

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < b.col; j++) {

                for (int k = 0; k < col; k++) {

                    result.data[i][j] += data[i][k] * b.data[k][j];

                }
            }
        }

        return result;
    }
}
