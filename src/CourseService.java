import java.sql.*;
import java.util.Scanner;

public class CourseService {

    Scanner sc = new Scanner(System.in);

    public void addCourse() {

        try {
            Connection conn = DatabaseConnection.getConnection();

            System.out.print("Course name: ");
            String name = sc.nextLine();

            System.out.print("Description: ");
            String desc = sc.nextLine();

            String sql = "INSERT INTO courses(course_name,course_description) VALUES (?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, desc);

            ps.executeUpdate();

            System.out.println("Course added");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getAllCourses() {

        try {
            Connection conn = DatabaseConnection.getConnection();

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM courses");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                                + rs.getString("course_name") + " "
                                + rs.getString("course_description")
                );
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void viewCourse() {

        try {
            Connection conn = DatabaseConnection.getConnection();

            System.out.print("Course ID: ");
            int id = sc.nextInt();

            String sql = "SELECT * FROM courses WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                                + rs.getString("course_name") + " "
                                + rs.getString("course_description")
                );
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateCourse() {

        try {
            Connection conn = DatabaseConnection.getConnection();

            System.out.print("Course ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("New name: ");
            String name = sc.nextLine();

            String sql = "UPDATE courses SET course_name=? WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Course updated");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteCourse() {

        try {
            Connection conn = DatabaseConnection.getConnection();

            System.out.print("Course ID: ");
            int id = sc.nextInt();

            String sql = "DELETE FROM courses WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Course deleted");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
