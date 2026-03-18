import manager.TaskManager;
import utils.Validator;

public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();
        Validator v = new Validator();

        while (true) {

            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Display Task");
            System.out.println("4. Exit");

            int choice = v.getInt("Choice: ", 1, 4);

            switch (choice) {

                case 1:
                    System.out.println("------------Add Task------------");

                    String name = v.getString("Requirement Name: ");
                    int type = v.getInt("Task Type: ", 1, 4);
                    String date = v.getDate("Date: ");

                    double from = v.getTime("From: ");
                    double to;

                    while (true) {
                        to = v.getTime("To: ");
                        if (to <= from) {
                            System.out.println("To must greater than From");
                        } else {
                            break;
                        }
                    }

                    String assignee = v.getString("Assignee: ");
                    String reviewer = v.getString("Reviewer: ");

                    if (manager.isOverlapTask(assignee, date, from, to)) {
                        System.out.println("Overlap!");
                        break;
                    }

                    if (!manager.checkTaskOrder(type, from, assignee, date)) {
                        System.out.println("Wrong order!");
                        break;
                    }

                    manager.addTask(name, type, date, from, to, assignee, reviewer);
                    System.out.println("Add success!");
                    break;

                case 2:
                    int id = v.getInt("Enter ID: ", 1, Integer.MAX_VALUE);
                    manager.deleteTask(id);
                    break;

                case 3:
                    manager.displayTask();
                    break;

                case 4:
                    return;
            }
        }
    }
}