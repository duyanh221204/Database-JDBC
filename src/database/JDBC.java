package database;

import java.sql.*;

public class JDBC
{
    public static Connection getConnection()
    {
        Connection connection = null;

        try
        {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            String url = "jdbc:mySQL://localhost:3306/thuchanh";
            String username = "root";
            String password = "test1234";

            connection = DriverManager.getConnection(url, username, password);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return connection;
    }
}
