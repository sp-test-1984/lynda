package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{

    private static final String CONN_STRING =
            "jdbc:mysql://localhost/explorecalifornia";

    private static final String USER = "dbuser";
    private static final String PASSWORD = "dbpassword";

    public static void main( String[] args ) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USER, PASSWORD);
            System.out.println("Connected!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
