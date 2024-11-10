package controller;

import database.JDBC;
import java.sql.*;

public class XemDatCho
{
    public static void xemDatCho(String maKhachHang)
    {
        try
        {
            Connection connection = JDBC.getConnection();
            Statement statement = connection.createStatement();

            String query = "select * from customers where cid = \"" + maKhachHang + "\";";
            System.out.println (query);
            ResultSet result = statement.executeQuery(query);

            boolean isExisted = false;

            while (result.next())
            {
                isExisted = true;
                System.out.printf (
                        "Customer ID: %d\nFlight ID: %d\n",
                        result.getInt("cid"),
                        result.getInt("flight_id")
                );
            }

            if (!isExisted) System.out.println ("Không tìm thấy thông tin!");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
