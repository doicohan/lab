package manager;

import entity.Task;
import entity.TaskType;
import java.util.ArrayList;
import utils.Validator;

public class TaskManager {

    private final ArrayList<Task> taskList = new ArrayList<>();
    private final Validator v = new Validator();
    private int id = 1;

    // kiểm tra 1 người không làm 2 task cùng lúc
    /*public boolean isDuplicateTime(String assignee, String date, double from, double to) {

        for (Task t : taskList) {

            if (t.getAssignee().equalsIgnoreCase(assignee)
                    && t.getDate().equals(date)) {

                if (!(to <= t.getPlanFrom() || from >= t.getPlanTo())) {
                    return true;
                }

            }
        }

        return false;
    }*/
    
    // kiểm tra thứ tự Code -> Test -> Design -> Review
    /*public boolean checkTaskOrder(int taskType, double from,
            String assignee, String date) {

        for (Task t : taskList) {

            if (t.getAssignee().equalsIgnoreCase(assignee)
                    && t.getDate().equals(date)) {

                // Code trước Test
                if (taskType == 2 && t.getTaskType() == 1) {
                    if (from <= t.getPlanTo()) {
                        return false;
                    }
                }

                // Test trước Design
                if (taskType == 3 && t.getTaskType() == 2) {
                    if (from <= t.getPlanTo()) {
                        return false;
                    }
                }

                // Design trước Review
                if (taskType == 4 && t.getTaskType() == 3) {
                    if (from <= t.getPlanTo()) {
                        return false;
                    }
                }

            }
        }

        return true;
    }*/

    
    public void addTask() {

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
        /*// ===== TEACHER RULE ADDED =====
        if (isDuplicateTime(assignee, date, from, to)) {
            System.out.println("Error: Assignee already has task at this time!");
            return;
        }

        // ===== TEACHER RULE ADDED =====
        if (!checkTaskOrder(type, from, assignee, date)) {
            System.out.println("Error: Task order must be Code -> Test -> Design -> Review");
            return;
        }*/

        taskList.add(new Task(id++, name, type, date, from, to, assignee, reviewer));

        System.out.println("Add success!");
    }

    public void deleteTask() {

        int idDelete = v.getInt("Enter ID: ", 1, Integer.MAX_VALUE);

        for (Task t : taskList) {

            if (t.getId() == idDelete) {

                taskList.remove(t);

                System.out.println("Deleted");

                return;
            }
        }

        System.out.println("Not found");
    }

    public void displayTask() {

        if (taskList.isEmpty()) {
            System.out.println("Empty list");
            return;
        }

        System.out.println("-------------------------------------------------------------------------- Task ---------------------------------------------------------------------");

        System.out.printf("%-5s %-15s %-10s %-12s %-10s %-10s %-10s\n",
                "ID", "Name", "Type", "Date", "Time", "Assignee", "Reviewer");

        for (Task t : taskList) {

            System.out.printf("%-5d %-15s %-10s %-12s %-10.1f %-10s %-10s\n",
                    t.getId(),
                    t.getRequirementName(),
                    TaskType.TYPE[t.getTaskType() - 1],
                    t.getDate(),
                    t.getTime(),
                    t.getAssignee(),
                    t.getReviewer());
        }

    }

}