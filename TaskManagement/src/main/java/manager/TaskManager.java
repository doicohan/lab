package manager;

import entity.Task;
import entity.TaskType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaskManager {

    private List<Task> taskList = new ArrayList<>();
    private List<TaskType> typeList = new ArrayList<>();
    private int autoId = 1;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public TaskManager() {
        typeList.add(new TaskType(1, "Code"));
        typeList.add(new TaskType(2, "Test"));
        typeList.add(new TaskType(3, "Design"));
        typeList.add(new TaskType(4, "Review"));
    }

    public void addTask(String name, int type,
            String date, double from, double to,
            String assignee, String reviewer) throws Exception {

        if (from < 8.0 || to > 17.5 || from >= to) {
            throw new Exception("Invalid time range!");
        }

        if ((from * 10) % 5 != 0 || (to * 10) % 5 != 0) {
            throw new Exception("Time must be step 0.5");
        }

        Task task = new Task(autoId, type, name,
                sdf.parse(date), from, to,
                assignee, reviewer);

        taskList.add(task);
        autoId++;
    }

    public void deleteTask(int id) throws Exception {
        Task found = null;
        for (Task t : taskList) {
            if (t.getId() == id) {
                found = t;
                break;
            }
        }

        if (found == null) {
            throw new Exception("Task not found!");
        }

        taskList.remove(found);
    }

    public void displayTask() {

        if (taskList.isEmpty()) {
            System.out.println("No task.");
            return;
        }

        System.out.println("--------------------------------- Task ---------------------------------");
        System.out.printf("%-5s%-20s%-15s%-15s%-10s%-15s%-15s\n",
                "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");

        for (Task t : taskList) {
            System.out.printf("%-5d%-20s%-15s%-15s%-10.1f%-15s%-15s\n",
                    t.getId(),
                    t.getRequirementName(),
                    getTypeName(t.getTaskTypeId()),
                    sdf.format(t.getDate()),
                    t.getTime(),
                    t.getAssignee(),
                    t.getReviewer());
        }
    }

    private String getTypeName(int id) {
        for (TaskType t : typeList) {
            if (t.getId() == id) {
                return t.getName();
            }
        }
        return "";
    }
}
