package testDB;

import controller.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println ("Vui lòng chọn các lựa chọn sau:");
            String exit = "Nhấn 0 để thoát";
            String findFlight = "Nhấn 1 để tìm chuyến bay";
            String booking = "Nhấn 2 để đặt chỗ";
            String getBooking = "Nhấn 3 để xem đặt chỗ";

            System.out.printf (
                    "%s\n%s\n%s\n%s\n",
                    exit,
                    findFlight,
                    booking,
                    getBooking
            );

            int option = Integer.parseInt(sc.nextLine());
            boolean isExit = false;

            switch (option)
            {
                case 0:
                    isExit = true;
                    break;

                case 1:
                    System.out.print ("Nhập điểm xuất phát: ");
                    String diemXuatPhat = sc.nextLine();
                    System.out.print ("Nhập điểm đến: ");
                    String diemDen = sc.nextLine();

                    ChuyenBay.timChuyenBay(diemXuatPhat, diemDen);
                    break;

                case 2:
                    System.out.println ("Nhập mã khách hàng của bạn: ");
                    String maKhach = sc.nextLine();
                    System.out.print ("Nhập tên của bạn: ");
                    String tenKhach = sc.nextLine();
                    System.out.print ("Nhập mã chuyến bay: ");
                    int maCB = Integer.parseInt(sc.nextLine());

                    DatCho.datCho(maKhach, tenKhach, maCB);
                    break;

                case 3:
                    System.out.println ("Nhập mã khách hàng: ");
                    String maKhachHang = sc.nextLine();

                    XemDatCho.xemDatCho(maKhachHang);
                    break;

                //default:
            }

            if (isExit) break;
        }
    }
}
