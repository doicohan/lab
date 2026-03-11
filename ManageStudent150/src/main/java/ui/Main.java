package ui;

import java.util.ArrayList;
import manager.StudentManager;
import model.*;
import utils.Validation;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        StudentManager manager = new StudentManager();

        int count = 0;

        while (true) {

            manager.menu();

            int choice = Validation.checkInputIntLimit(1, 5);

            switch (choice) {

                case 1:
                    manager.createStudent(count, list);
                    break;

                case 2:
                    manager.findAndSort(list);
                    break;

                case 3:
                    break;

                case 4:
                    manager.report(list);
                    break;

                case 5:
                    return;
            }
        }
    }
}
