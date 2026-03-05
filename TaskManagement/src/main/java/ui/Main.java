package ui;

import manager.TaskManager;
import utils.Validator;

public class Main {

    public static void main(String[] args) {

        TaskManager tm = new TaskManager();
        Validator v = new Validator();

        while (true) {

            System.out.println("========= Task program =========");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Display Task");
            System.out.println("4. Exit");

            int choice = v.getInt("Choose: ", 1, 4);

            switch (choice) {

                case 1:
                    tm.addTask();
                    break;

                case 2:
                    tm.deleteTask();
                    break;

                case 3:
                    tm.displayTask();
                    break;

                case 4:
                    return;
            }
        }

    }

}