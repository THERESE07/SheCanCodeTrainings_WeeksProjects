import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class TaskManager {

    private ArrayList<String> taskListArray;
    private LinkedList<String> taskListLinked;

    public TaskManager() {
        taskListArray = new ArrayList<>();
        taskListLinked = new LinkedList<>();
    }

    // Add Task
    public void addTask(String task) {
        if (task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("Task cannot be empty.");
        }

        taskListArray.add(task);
        taskListLinked.add(task);
    }

    // Remove Task by Index
    public void removeTask(int index) {
        try {
            taskListArray.remove(index);
            taskListLinked.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index " + index);
        }
    }

    // Sort Tasks Alphabetically
    public void sortTasks() {
        Collections.sort(taskListArray);
        Collections.sort(taskListLinked);
    }

    // Search for a Task by Name
    public int searchTask(String task) {
        return taskListArray.indexOf(task);
    }

    // Find Longest Task
    public String findLongestTask() {
        if (taskListArray.isEmpty()) {
            throw new IllegalArgumentException("No tasks available.");
        }

        String longest = taskListArray.get(0);

        for (String t : taskListArray) {
            if (t.length() > longest.length()) {
                longest = t;
            }
        }
        return longest;
    }

    // Display Tasks
    public void displayTasks() {
        System.out.println("Tasks (ArrayList): " + taskListArray);
        System.out.println("Tasks (LinkedList): " + taskListLinked);
    }
}

