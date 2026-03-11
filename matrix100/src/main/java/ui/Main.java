package ui;
import entity.Matrix;
import utils.Validator;
public class Main {

    public static void main(String[] args) {

        Validator validator = new Validator();

        while (true) {

            System.out.println("======= Calculator program =======");
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");

            int choice = validator.getIntLimit("Your choice: ", 1, 4);

            if (choice == 4) {
                return;
            }

            int r1 = validator.getPositiveInt("Enter Row Matrix 1: ");
            int c1 = validator.getPositiveInt("Enter Column Matrix 1: ");

            Matrix m1 = new Matrix(r1, c1);
            m1.input(validator, 1);

            int r2 = validator.getPositiveInt("Enter Row Matrix 2: ");
            int c2 = validator.getPositiveInt("Enter Column Matrix 2: ");

            Matrix m2 = new Matrix(r2, c2);
            m2.input(validator, 2);

            Matrix result = null;

            try {

                switch (choice) {

                    case 1:
                        result = m1.add(m2);
                        break;

                    case 2:
                        result = m1.sub(m2);
                        break;

                    case 3:
                        result = m1.mul(m2);
                        break;
                }

                result.output();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}