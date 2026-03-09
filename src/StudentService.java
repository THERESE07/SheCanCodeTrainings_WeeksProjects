import java.sql.*;
import java.util.Scanner;

public class StudentService {

    Scanner sc = new Scanner(System.in);

    public void addStudent() {

        try {
            Connection conn = DatabaseConnection.getConnection();

            System.out.print("First name: ");
            String first = sc.nextLine();

            System.out.print("Last name: ");
            String last = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Date of birth (yyyy-mm-dd): ");
            String dob = sc.nextLine();

            String sql = "INSERT INTO students(first_name,last_name,email,date_of_birth) VALUES (?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, first);
            ps.setString(2, last);
            ps.setString(3, email);
            ps.setDate(4, Date.valueOf(dob));

            ps.executeUpdate();

            System.out.println("Student added");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void viewStudent() {

        try {
            Connection conn = DatabaseConnection.getConnection();

            System.out.print("Enter student id: ");
            int id = sc.nextInt();

            String sql = "SELECT * FROM students WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                                + rs.getString("first_name") + " "
                                + rs.getString("last_name") + " "
                                + rs.getString("email") + " "
                                + rs.getDate("date_of_birth")
                );
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateStudent() {

        try {
            Connection conn = DatabaseConnection.getConnection();

            System.out.print("Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("New email: ");
            String email = sc.nextLine();

            String sql = "UPDATE students SET email=? WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Student updated");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteStudent() {

        try {
            Connection conn = DatabaseConnection.getConnection();

            System.out.print("Student ID: ");
            int id = sc.nextInt();

            String sql = "DELETE FROM students WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Student deleted");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
