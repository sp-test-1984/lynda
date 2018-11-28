package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String M_CONN_STRING =
            "jdbc:mysql://localhost/explorecalifornia";

    private static final String H_CONN_STRING =
            "jdbc:hsqldb:data/explorecalifornia";

    private static final String USER = "dbuser";
    private static final String PASSWORD = "dbpassword";


    public static Connection getConnection(DBType dbType) throws SQLException {
        switch (dbType){
            case MYSQL:
                return DriverManager.getConnection(M_CONN_STRING, USER, PASSWORD);
            case HSQL:
                return DriverManager.getConnection(H_CONN_STRING, USER, PASSWORD);
                default:
                    return null;
        }
    }
}
