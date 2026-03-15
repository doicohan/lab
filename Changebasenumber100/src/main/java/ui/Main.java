package ui;
import manager.Manager;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();

        while (true) {

            int choice = manager.menu();

            switch (choice) {

                case 1:
                    manager.convertFromBinary();
                    break;

                case 2:
                    manager.convertFromDecimal();
                    break;

                case 3:
                    manager.convertFromHexa();
                    break;

                case 4:
                    return;
            }
        }
    }
}