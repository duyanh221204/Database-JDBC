package controller;

import database.JDBC;
import java.sql.*;

public class DatCho
{
    public static void datCho(String maKhachHang, String tenKhachHang, int maChuyenBay)
    {
        try
        {
            Connection connection = JDBC.getConnection();
            Statement statement = connection.createStatement();

            String query = "insert into customers values(\"" +
                            maKhachHang + "\",\"" +
                            tenKhachHang + "\"," +
                            maChuyenBay + ");";
            System.out.println(query);
            statement.executeUpdate(query);

            System.out.println ("Đặt chỗ thành công!");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
