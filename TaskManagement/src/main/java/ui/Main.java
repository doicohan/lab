package ui;

import manager.TaskManager;
import utils.Validator;

public class Main {

    public static void main(String[] args) {

        Validator v = new Validator();
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("========= Task program =========");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Display Task");
            System.out.println("4. Exit");

            int choice = v.getInt("Choose: ", 1, 4);

            try {
                switch (choice) {
                    case 1:
                        System.out.println("------------- Add Task -------------");
                        String name = v.getString("Requirement Name: ");
                        int type = v.getInt("Task Type (1-4): ", 1, 4);
                        String date = v.getDate("Date (dd-MM-yyyy): ");
                        double from = v.getDouble("From: ");
                        double to = v.getDouble("To: ");
                        String assignee = v.getString("Assignee: ");
                        String reviewer = v.getString("Reviewer: ");

                        manager.addTask(name, type, date, from, to, assignee, reviewer);
                        System.out.println("Add success!");
                        break;

                    case 2:
                        System.out.println("-------------Del Task-------------");
                        int id = v.getInt("ID: ", 1, Integer.MAX_VALUE);

                        manager.deleteTask(id);
                        System.out.println("Delete success!");
                        break;

                    case 3:
                        manager.displayTask();
                        break;

                    case 4:
                        return;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
