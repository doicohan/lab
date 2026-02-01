package matrix;

import utils.Validator;

public class Menu {

    public static void run() {
        ManagerMatrix manager = new ManagerMatrix();

        while (true) {
            System.out.println("====== Calculator program ======");
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Exit");

            int choice = Validator.getIntInRange("Your choice: ", 1, 4);

            switch (choice) {
                case 1:
                    manager.additionMatrix();
                    break;
                case 2:
                    manager.subtractionMatrix();
                    break;
                case 3:
                    manager.multiplicationMatrix();
                    break;
                case 4:
                    return;
            }
        }
    }
}
