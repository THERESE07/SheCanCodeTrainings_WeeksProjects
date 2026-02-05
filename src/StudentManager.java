import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentManager {

    // Add Student
    public void addStudent(Map<Integer, String> students, int studentId, String name) {
        if (studentId <= 0) {
            throw new IllegalArgumentException("Student ID cannot be negative or zero!");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null or empty!");
        }

        students.put(studentId, name);
        System.out.println("Student added: ID = " + studentId + ", Name = " + name);
    }

    // Remove Student
    public void removeStudent(Map<Integer, String> students, int studentId) {
        try {
            if (students.remove(studentId) != null) {
                System.out.println("Student removed: ID = " + studentId);
            } else {
                System.out.println("No student found with ID = " + studentId);
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Students map is null!");
        }
    }

    // Search Student by ID
    public String searchStudent(Map<Integer, String> students, int studentId) {
        try {
            return students.get(studentId);
        } catch (NullPointerException e) {
            System.out.println("Error: Students map is null!");
            return null;
        }
    }

    // Sort Students by ID (Ascending)
    public Map<Integer, String> sortStudents(Map<Integer, String> students) {
        try {
            return new TreeMap<>(students);
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot sort null map!");
            return null;
        }
    }

    // Find Student With Highest ID
    public Map.Entry<Integer, String> findStudentWithHighestId(Map<Integer, String> students) {
        try {
            TreeMap<Integer, String> sorted = new TreeMap<>(students);
            return sorted.lastEntry();
        } catch (NullPointerException e) {
            System.out.println("Error: Students map is null!");
            return null;
        }
    }

    // Find Student With Lowest ID
    public Map.Entry<Integer, String> findStudentWithLowestId(Map<Integer, String> students) {
        try {
            TreeMap<Integer, String> sorted = new TreeMap<>(students);
            return sorted.firstEntry();
        } catch (NullPointerException e) {
            System.out.println("Error: Students map is null!");
            return null;
        }
    }
}

