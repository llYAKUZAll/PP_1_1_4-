package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER_NAME = "Moderator";
    private static final String PASSWORD = "$ChingateF-22";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            System.out.println("Connect...");
        } catch (SQLException e) {
            System.out.println("No Connect...");
            throw new RuntimeException(e);

        }
        return connection;
    }

}
