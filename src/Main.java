import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Map<Integer, String> students = new HashMap<>();

        System.out.println("===== TEST: VALID INPUTS =====");
        manager.addStudent(students, 101, "Alice");
        manager.addStudent(students, 202, "Bob");
        manager.addStudent(students, 303, "Charlie");

        System.out.println("\n===== TEST: INVALID INPUTS =====");

        // Invalid ID
        try {
            manager.addStudent(students, -1, "Invalid");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Invalid Name
        try {
            manager.addStudent(students, 404, "");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Null Name
        try {
            manager.addStudent(students, 505, null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n===== TEST: NULL KEY/ VALUE =====");
        Map<Integer, String> brokenMap = null;

        manager.searchStudent(brokenMap, 1);  // triggers NullPointerException catch
        manager.removeStudent(brokenMap, 1);
        manager.sortStudents(brokenMap);

        System.out.println("\n===== TEST: SORTING =====");
        Map<Integer, String> sorted = manager.sortStudents(students);
        System.out.println("Sorted Students: " + sorted);

        System.out.println("\n===== TEST: SEARCH STUDENT =====");
        String name = manager.searchStudent(students, 202);
        System.out.println("Search result for ID 202: " + name);

        System.out.println("\n===== TEST: HIGHEST & LOWEST ID =====");
        System.out.println("Highest ID Student: " + manager.findStudentWithHighestId(students));
        System.out.println("Lowest ID Student: " + manager.findStudentWithLowestId(students));

        System.out.println("\n===== TEST: REMOVE STUDENT =====");
        manager.removeStudent(students, 101);
        manager.removeStudent(students, 999); // not found
    }
}
