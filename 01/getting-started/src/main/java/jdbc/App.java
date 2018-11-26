package jdbc;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

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

    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "dbpassword";

    public static void main( String[] args )
    {
        Connection conn = null;

        try {
            DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Connected!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
