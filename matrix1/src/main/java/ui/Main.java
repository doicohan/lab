public class Main {

    public static void main(String[] args) {

        Validator validator = new Validator();
        Matrix matrix = new Matrix();

        while (true) {

            System.out.println("========= Calculator Program =========");
            System.out.println("1. Addition matrixes");
            System.out.println("2. Subtraction matrixes");
            System.out.println("3. Multiplication matrixes");
            System.out.println("4. Exit");

            int choice = validator.getIntRange("Your choice: ", 1, 4);

            if (choice == 4) {
                break;
            }

            String title = "";
            if (choice == 1) title = "Addition";
            if (choice == 2) title = "Subtraction";
            if (choice == 3) title = "Multiplication";

            System.out.println("-------- " + title + " --------");

            int row1 = validator.getInt("Enter Row Matrix 1: ");
            int col1 = validator.getInt("Enter Column Matrix 1: ");

            int[] m1 = validator.inputMatrix("Matrix1", row1, col1);

            int row2 = validator.getInt("Enter Row Matrix 2: ");
            int col2 = validator.getInt("Enter Column Matrix 2: ");

            int[] m2 = validator.inputMatrix("Matrix2", row2, col2);

            System.out.println("-------- Result --------");

            if (choice == 1) {

                if (row1 == row2 && col1 == col2) {

                    matrix.displayMatrix(m1, row1, col1);
                    System.out.println("+");
                    matrix.displayMatrix(m2, row2, col2);
                    System.out.println("=");

                    int[] result = matrix.additionMatrix(m1, m2, row1 * col1);
                    matrix.displayMatrix(result, row1, col1);

                } else {
                    System.out.println("Two matrix must have same size!");
                }

            } else if (choice == 2) {

                if (row1 == row2 && col1 == col2) {

                    matrix.displayMatrix(m1, row1, col1);
                    System.out.println("-");
                    matrix.displayMatrix(m2, row2, col2);
                    System.out.println("=");

                    int[] result = matrix.subtractionMatrix(m1, m2, row1 * col1);
                    matrix.displayMatrix(result, row1, col1);

                } else {
                    System.out.println("Two matrix must have same size!");
                }

            } else {

                if (col1 == row2) {

                    matrix.displayMatrix(m1, row1, col1);
                    System.out.println("*");
                    matrix.displayMatrix(m2, row2, col2);
                    System.out.println("=");

                    int[] result = matrix.multiplicationMatrix(m1, m2, row1, col1, col2);
                    matrix.displayMatrix(result, row1, col2);

                } else {
                    System.out.println("Column Matrix 1 must equal Row Matrix 2!");
                }
            }
        }
    }
}