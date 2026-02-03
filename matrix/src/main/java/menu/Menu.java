package menu;

import controller.MatrixController;
import utils.Validator;

public class Menu {

    public static void run() {
        MatrixController controller = new MatrixController();

        while (true) {
            System.out.println("========= Matrix Calculator =========");
            System.out.println("1. Addition matrix");
            System.out.println("2. Subtraction matrix");
            System.out.println("3. Multiplication matrix");
            System.out.println("4. Exit");

            int choice = Validator.getInt("Your choice: ", "Choice must be 1-4", 1, 4);

            switch (choice) {
                case 1:
                    controller.addition();
                    break;
                case 2:
                    controller.subtraction();
                    break;
                case 3:
                    controller.multiplication();
                    break;
                case 4:
                    System.out.println("Bye!");
                    return;
            }
        }
    }
}
