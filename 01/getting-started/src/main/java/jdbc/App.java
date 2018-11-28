package jdbc;

import java.sql.*;

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

    public static void main( String[] args ) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USER, PASSWORD);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("SELECT * FROM STATES");
            rs.last();
            System.out.println("Number of rows: " + rs.getRow());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(conn != null){
                conn.close();
            }
        }
    }
}
