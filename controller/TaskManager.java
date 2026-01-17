package controller;

import model.Task;
import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> taskList;

    public TaskManager() {
        taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public ArrayList<Task> getTasks() {
        return taskList;
    }

    public int generateTaskId() {
        if (taskList.isEmpty()) {
            return 1001;
        }
        return taskList.get(taskList.size() - 1).getTaskId() + 1;
    }
}
