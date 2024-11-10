package controller;

import database.JDBC;
import java.sql.*;

public class ChuyenBay
{
    public static void timChuyenBay(String diemXuatPhat, String diemDen)
    {
        try
        {
            Connection connection = JDBC.getConnection();
            Statement statement = connection.createStatement();

            String query = "select * from flights where origin_city = \"" + diemXuatPhat +
                            "\" and dest_city = \"" + diemDen + "\";";
            System.out.println (query);
            ResultSet result = statement.executeQuery(query);
            
            boolean isExisted = false;

            while (result.next())
            {
                isExisted = true;
                System.out.printf (
                        "Flight ID: %d\nOrigin_city: %s\nDest_city: %s\n",
                        result.getInt("fid"),
                        result.getString("origin_city"),
                        result.getString("dest_city")
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
