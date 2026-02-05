public class Main {
    public static void main(String[] args) {

        System.out.println("===== TaskManager Test =====");

        TaskManager tm = new TaskManager();

        // Add valid tasks
        System.out.println("\n--- Adding Tasks ---");
        tm.addTask("Buy groceries");
        tm.addTask("Complete Java assignment");
        tm.addTask("Go to gym");
        tm.addTask("Read a book");
        tm.displayTasks();

        // Test empty task (invalid)
        System.out.println("\n--- Testing Invalid Task Input ---");
        try {
            tm.addTask("");   // invalid
        } catch (IllegalArgumentException e) {
            System.out.println("Don't" + e.getMessage());
        }

        // Remove valid index
        System.out.println("\n--- Removing Task at Index 1 ---");
        tm.removeTask(1);
        tm.displayTasks();

        // Remove invalid index
        System.out.println("\n--- Removing Invalid Index 10 ---");
        tm.removeTask(10);  // triggers IndexOutOfBounds

        // Sort tasks
        System.out.println("\n--- Sorting Tasks Alphabetically ---");
        tm.sortTasks();
        tm.displayTasks();

        // Search task
        System.out.println("\n--- Searching for 'Go to gym' ---");
        int index = tm.searchTask("Go to gym");
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Task not found.");
        }

        // Find longest task
        System.out.println("\n--- Finding Longest Task ---");
        try {
            System.out.println("Longest task: " + tm.findLongestTask());
        } catch (IllegalArgumentException e) {
            System.out.println("Don't " + e.getMessage());
        }

        System.out.println("\n===== END OF TEST =====");
    }
}
