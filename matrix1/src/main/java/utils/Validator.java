import java.util.Scanner;

public class Validator {

    private Scanner sc = new Scanner(System.in);

    public int getInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Value of matrix is digit");
            }
        }
    }

    public int getIntRange(String message, int min, int max) {
        while (true) {
            int number = getInt(message);
            if (number >= min && number <= max) {
                return number;
            }
        }
    }

    public int[] inputMatrix(String name, int row, int col) {
        int[] matrix = new int[row * col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i * col + j] =
                        getInt("Enter " + name + "[" + (i + 1) + "][" + (j + 1) + "]: ");
            }
        }
        return matrix;
    }
}