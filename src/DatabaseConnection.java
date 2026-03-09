import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    static String url = "jdbc:postgresql://localhost:5432/studentdb";
    static String user = "postgres";
    static String password = "password";

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("Connection failed");
        }

        return null;
    }
}
