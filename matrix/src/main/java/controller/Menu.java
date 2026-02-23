package controller;


import utils.Validator;

public class Menu {

    public void display() {

        MatrixController controller = new MatrixController();

        while (true) {
            System.out.println("========= Calculator Program =========");
            System.out.println("1. Addition matrix");
            System.out.println("2. Subtraction matrix");
            System.out.println("3. Multiplication matrix");
            System.out.println("4. Exit");

            int choice = Validator.getInt(
                    "Your choice: ",
                    "Choice must be between 1 and 4",
                    "Choice must be number",
                    1, 4);

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
                    return;
            }
        }
    }
}