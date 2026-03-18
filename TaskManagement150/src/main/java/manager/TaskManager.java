package manager;

import entity.Task;
import entity.TaskType;
import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> taskList = new ArrayList<>();
    private int id = 1;

    public boolean isOverlapTask(String assignee, String date, double from, double to) {

        for (Task t : taskList) {

            if (t.getAssignee().equalsIgnoreCase(assignee)
                    && t.getDate().equals(date)) {

                if (!(to <= t.getPlanFrom() || from >= t.getPlanTo())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkTaskOrder(int taskType, double from,
            String assignee, String date) {

        for (Task t : taskList) {

            if (t.getAssignee().equalsIgnoreCase(assignee)
                    && t.getDate().equals(date)) {

                if (taskType == 2 && t.getTaskType() == 1 && from < t.getPlanTo()) {
                    return false;
                }

                if (taskType == 3 && t.getTaskType() == 2 && from < t.getPlanTo()) {
                    return false;
                }

                if (taskType == 4 && t.getTaskType() == 3 && from < t.getPlanTo()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void addTask(String name, int type, String date,
            double from, double to, String assignee, String reviewer) {

        taskList.add(new Task(id++, name, type, date, from, to, assignee, reviewer));
    }

    public void deleteTask(int idDelete) {

        for (Task t : taskList) {
            if (t.getId() == idDelete) {
                taskList.remove(t);
                return;
            }
        }
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