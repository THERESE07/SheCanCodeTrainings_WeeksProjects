import java.io.*;
import java.util.*;

public class StudentManagementSystem {

    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Load from file
        loadStudentsFromFile(students);

        // Display all students
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }

        // Process data
        processStudents(students);

        Scanner scanner = new Scanner(System.in);

        // Add new student
        System.out.println("\nDo you want to add a new student? (yes/no)");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            addStudent(students, scanner);
        }

        // Update a score
        System.out.println("\nDo you want to update a student score? (yes/no)");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            updateStudentScore(students, scanner);
        }

        // Save back to file
        saveStudentsToFile(students);

        System.out.println("\nData saved successfully.");
    }

    // 1. Load data
    public static void loadStudentsFromFile(ArrayList<Student> students) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                String[] parts = line.split(",");
                if (parts.length != 4) {
                    System.out.println("Invalid line format: " + line);
                    continue;
                }

                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                int age = Integer.parseInt(parts[2].trim());
                int score = Integer.parseInt(parts[3].trim());

                students.add(new Student(id, name, age, score));
            }

            System.out.println("Loaded " + students.size() + " students from file.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in file.");
        }
    }

    // 2. Processing
    public static void processStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students to process.");
            return;
        }

        // Average score
        double sum = 0;
        for (Student s : students) {
            sum += s.getScore();
        }
        double avg = sum / students.size();
        System.out.println("\nAverage score: " + avg);

        // Highest score
        Student top = Collections.max(students, Comparator.comparing(Student::getScore));
        System.out.println("Top student: " + top.getName() + " (" + top.getScore() + ")");

        // Lowest score
        Student low = Collections.min(students, Comparator.comparing(Student::getScore));
        System.out.println("Lowest student: " + low.getName() + " (" + low.getScore() + ")");

        // Passed
        System.out.println("\nStudents who passed:");
        boolean foundPass = false;
        for (Student s : students) {
            if (s.getScore() >= 60) {
                System.out.println(s);
                foundPass = true;
            }
        }
        if (!foundPass) System.out.println("None");

        // Failed
        System.out.println("\nStudents who failed:");
        boolean foundFail = false;
        for (Student s : students) {
            if (s.getScore() < 60) {
                System.out.println(s);
                foundFail = true;
            }
        }
        if (!foundFail) System.out.println("None");
    }

    // 3. Add new
    public static void addStudent(ArrayList<Student> students, Scanner scanner) {
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter score: ");
            int score = Integer.parseInt(scanner.nextLine());

            students.add(new Student(id, name, age, score));
            System.out.println("Student added successfully!");

        } catch (Exception e) {
            System.out.println("Invalid input! Student not added.");
        }
    }

    // 4. Update score
    public static void updateStudentScore(ArrayList<Student> students, Scanner scanner) {
        try {
            System.out.print("Enter student ID to update: ");
            int id = Integer.parseInt(scanner.nextLine());

            Student found = null;

            for (Student s : students) {
                if (s.getStudentId() == id) {
                    found = s;
                    break;
                }
            }

            if (found == null) {
                System.out.println("Student ID not found.");
                return;
            }

            System.out.print("Enter new score: ");
            int newScore = Integer.parseInt(scanner.nextLine());
            found.setScore(newScore);

            System.out.println("Score updated successfully!");

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }

    // 5. Save to file
    public static void saveStudentsToFile(ArrayList<Student> students) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {

            for (Student s : students) {
                pw.println(s.getStudentId() + "," + s.getName() + "," +
                        s.getAge() + "," + s.getScore());
            }

        } catch (IOException e) {
            System.out.println("Error saving to file.");
        }
    }
}
