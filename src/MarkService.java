import java.sql.*;
import java.util.Scanner;

public class MarkService {

    Scanner sc = new Scanner(System.in);

    public void addMark() {

        try {

            Connection conn = DatabaseConnection.getConnection();

            System.out.print("Student ID: ");
            int student = sc.nextInt();

            System.out.print("Course ID: ");
            int course = sc.nextInt();

            System.out.print("Marks: ");
            double marks = sc.nextDouble();

            String sql = "INSERT INTO marks(student_id,course_id,marks) VALUES (?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, student);
            ps.setInt(2, course);
            ps.setDouble(3, marks);

            ps.executeUpdate();

            System.out.println("Mark added");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void viewStudentMarks() {

        try {

            Connection conn = DatabaseConnection.getConnection();

            System.out.print("Student ID: ");
            int id = sc.nextInt();

            String sql = "SELECT * FROM marks WHERE student_id=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("student_id") + " "
                                + rs.getInt("course_id") + " "
                                + rs.getDouble("marks")
                );
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateMark() {

        try {

            Connection conn = DatabaseConnection.getConnection();

            System.out.print("Student ID: ");
            int student = sc.nextInt();

            System.out.print("Course ID: ");
            int course = sc.nextInt();

            System.out.print("New mark: ");
            double mark = sc.nextDouble();

            String sql = "UPDATE marks SET marks=? WHERE student_id=? AND course_id=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setDouble(1, mark);
            ps.setInt(2, student);
            ps.setInt(3, course);

            ps.executeUpdate();

            System.out.println("Mark updated");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteMark() {

        try {

            Connection conn = DatabaseConnection.getConnection();

            System.out.print("Student ID: ");
            int student = sc.nextInt();

            System.out.print("Course ID: ");
            int course = sc.nextInt();

            String sql = "DELETE FROM marks WHERE student_id=? AND course_id=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, student);
            ps.setInt(2, course);

            ps.executeUpdate();

            System.out.println("Mark deleted");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
