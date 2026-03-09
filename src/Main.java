import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        MarkService markService = new MarkService();

        char choice;

        do {

            System.out.println("\n===== MENU =====");

            System.out.println("a. Add Student");
            System.out.println("b. View Student");
            System.out.println("c. Update Student");
            System.out.println("d. Delete Student");
            System.out.println("e. Add Course");
            System.out.println("f. Get All courses");
            System.out.println("g. View Course");
            System.out.println("h. Update Course");
            System.out.println("i. Delete Course");
            System.out.println("j. Add Mark");
            System.out.println("k. View Student Marks");
            System.out.println("l. Update Student Mark in a course");
            System.out.println("m. Delete Student Mark in a certain course");
            System.out.println("n. Exit");

            System.out.print("Choice: ");
            choice = sc.next().charAt(0);

            switch (choice) {

                case 'a':
                    studentService.addStudent();
                    break;

                case 'b':
                    studentService.viewStudent();
                    break;

                case 'c':
                    studentService.updateStudent();
                    break;

                case 'd':
                    studentService.deleteStudent();
                    break;

                case 'e':
                    courseService.addCourse();
                    break;

                case 'f':
                    courseService.getAllCourses();
                    break;

                case 'g':
                    courseService.viewCourse();
                    break;

                case 'h':
                    courseService.updateCourse();
                    break;

                case 'i':
                    courseService.deleteCourse();
                    break;

                case 'j':
                    markService.addMark();
                    break;

                case 'k':
                    markService.viewStudentMarks();
                    break;

                case 'l':
                    markService.updateMark();
                    break;

                case 'm':
                    markService.deleteMark();
                    break;

                case 'n':
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 'n');
    }
}