package entity;

public class Matrix {

    public int[][] additionMatrix(int[][] a, int[][] b) {
        int r = a.length;
        int c = a[0].length;
        int[][] res = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = a[i][j] + b[i][j];

        return res;
    }

    public int[][] subtractionMatrix(int[][] a, int[][] b) {
        int r = a.length;
        int c = a[0].length;
        int[][] res = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = a[i][j] - b[i][j];

        return res;
    }

    public int[][] multiplicationMatrix(int[][] a, int[][] b) {
        int r = a.length;
        int c = b[0].length;
        int common = b.length;
        int[][] res = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                for (int k = 0; k < common; k++)
                    res[i][j] += a[i][k] * b[k][j];

        return res;
    }
}
