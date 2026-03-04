package data;

import entity.TaskType;
import java.util.ArrayList;
import java.util.List;

public class TaskTypeData {

    private static final List<TaskType> list = new ArrayList<>();

    static {
        list.add(new TaskType(1, "Code"));
        list.add(new TaskType(2, "Test"));
        list.add(new TaskType(3, "Design"));
        list.add(new TaskType(4, "Review"));
    }

    public static TaskType getTaskTypeById(int id) {
        for (TaskType t : list) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
}