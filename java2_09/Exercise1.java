package java2_09;
import java.sql.*;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        try(
                // Step 1: Allocate a database 'Connection' object
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection

                Statement stmt = con.createStatement();
        )
        {
            Scanner sc = new Scanner(System.in);
            //hiển thị 5 cuốn sách mới nhất
            ResultSet rset = stmt.executeQuery("SELECT * FROM `sach` ORDER by NamXuatBan DESC LIMIT 0,5");
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColums = rsetMD.getColumnCount();

            for (int i = 1; i < numColums;  ++i){
                System.out.printf("%-50s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numColums; ++i){
                System.out.printf("%-50s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1; i <= numColums; ++i){
                    System.out.printf("%-50s", rset.getString(i));
                }
                System.out.println();
            }

            //hiển thị 3 cuốn sách bán chạy nhất
             rset = stmt.executeQuery("SELECT * FROM `sach` WHERE id IN (SELECT SachId from don_hang_chi_tiet ORDER by SoLuong ASC ) LIMIT 0,3");
             rsetMD = rset.getMetaData();
             int numColums2 = rsetMD.getColumnCount();

            for (int i = 1; i < numColums2;  ++i){
                System.out.printf("%-50s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numColums2; ++i){
                System.out.printf("%-50s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1; i <= numColums2; ++i){
                    System.out.printf("%-50s", rset.getString(i));
                }
                System.out.println();
            }

            // xem sách theo thể loại
            int d;
            System.out.println("Nhap the loai ban muon tim kiem \n" +
                    "1: The Thao \n" +
                    "2: Tri Thuc"
            );
            d = sc.nextInt();
            rset = stmt.executeQuery("SELECT * from sach where LoaiSachid in(SELECT id from loai_sach where id =" + d + ")" );
             rsetMD = rset.getMetaData();
              numColums = rsetMD.getColumnCount();

            for (int i = 1; i < numColums;  ++i){
                System.out.printf("%-50s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numColums; ++i){
                System.out.printf("%-50s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1; i <= numColums; ++i){
                    System.out.printf("%-50s", rset.getString(i));
                }
                System.out.println();
            }

            // Xem sách theo tên tác giản
            int f;
            System.out.println("Nhậpp tên tác giả bận càn tìm kiếm \n" +
                    "1: Sir Alex \n " +
                    "2: Adrea Pirlo \n " +
                    "3: Jim White \n" +
                    "4: Lucas caioli \n" +
                    "5: Carlo Anceloti\n" +
                    "6: Nguyen Vuong Anh");
            f = sc.nextInt();
            rset = stmt.executeQuery("SELECT * from sach where TacGiaID in(SELECT id from tac_gia where id =  " + f + ")" );
             rsetMD = rset.getMetaData();
              numColums = rsetMD.getColumnCount();

            for (int i = 1; i < numColums;  ++i){
                System.out.printf("%-50s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numColums; ++i){
                System.out.printf("%-50s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1; i <= numColums; ++i){
                    System.out.printf("%-50s", rset.getString(i));
                }
                System.out.println();
            }

            //Xem chi tiết 1 cuốn sách
            int h;
            System.out.println("Nhập id cuốn sách bạn cần tìm kiếm: \n" );
            h = sc.nextInt();
            rset = stmt.executeQuery("SELECT * from sach where  id = " + h );
             rsetMD = rset.getMetaData();
              numColums = rsetMD.getColumnCount();

            for (int i = 1; i < numColums;  ++i){
                System.out.printf("%-50s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numColums; ++i){
                System.out.printf("%-50s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1; i <= numColums; ++i){
                    System.out.printf("%-50s", rset.getString(i));
                }
                System.out.println();
            }

            //Hiển thị 2 đơn hàng mới tiếp nhận
            rset = stmt.executeQuery("SELECT * from don_hang ORDER by NgayChotDon ASC limit 0,2");
             rsetMD = rset.getMetaData();
            numColums = rsetMD.getColumnCount();

            for (int i = 1; i < numColums;  ++i){
                System.out.printf("%-50s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numColums; ++i){
                System.out.printf("%-50s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1; i <= numColums; ++i){
                    System.out.printf("%-50s", rset.getString(i));
                }
                System.out.println();
            }

            //Hiển thị đơn hàng theo mã khách hàng
            int k1;
            System.out.println("Nhập mã khách hàng: ");
            k1 = sc.nextInt();
            rset = stmt.executeQuery("SELECT * from don_hang where KhachHangID =  " + k1);
            rsetMD = rset.getMetaData();
             numColums= rsetMD.getColumnCount();
            for (int i = 1; i < numColums;  ++i){
                System.out.printf("%-50s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numColums; ++i){
                System.out.printf("%-50s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1; i <= numColums; ++i){
                    System.out.printf("%-50s", rset.getString(i));
                }
                System.out.println();
            }

            // Hiển thị trạng thái đơn hàng theo id
            int k2;
            System.out.println("Nhập mã đơn hàng: ");
            k2 = sc.nextInt();
            rset = stmt.executeQuery("SELECT TrangThai from don_hang where id =   " + k2);
            rsetMD = rset.getMetaData();
             numColums= rsetMD.getColumnCount();
            for (int i = 1; i < numColums;  ++i){
                System.out.printf("%-50s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColums; ++i){
                System.out.printf("%-50s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1; i <= numColums; ++i){
                    System.out.printf("%-50s", rset.getString(i));
                }
                System.out.println();
            }

            // Hiển thị thjoong tin đơn hàng theo id
            int k3;
            System.out.println("Nhập mã đơn hàng: ");
            k3 = sc.nextInt();
            rset = stmt.executeQuery("SELECT * from don_hang where id =  " + k3);
            rsetMD = rset.getMetaData();
             numColums= rsetMD.getColumnCount();
            for (int i = 1; i < numColums;  ++i){
                System.out.printf("%-50s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColums; ++i){
                System.out.printf("%-50s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1; i <= numColums; ++i){
                    System.out.printf("%-50s", rset.getString(i));
                }
                System.out.println();
            }

            // Hiển thị những đơn hàng đã giao hàng thành công
            rset = stmt.executeQuery("SELECT * FROM `don_hang` WHERE TrangThai = 'da thuc hien' " );
            rsetMD = rset.getMetaData();
            numColums= rsetMD.getColumnCount();
            for (int i = 1; i < numColums;  ++i){
                System.out.printf("%-50s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColums; ++i){
                System.out.printf("%-50s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1; i <= numColums; ++i){
                    System.out.printf("%-50s", rset.getString(i));
                }
                System.out.println();
            }

            //Hiển thị những đơn hàng đang thực hiện
            rset = stmt.executeQuery("SELECT * FROM `don_hang` WHERE TrangThai = 'Dang thuc hien' " );
            rsetMD = rset.getMetaData();
            numColums= rsetMD.getColumnCount();
            for (int i = 1; i < numColums;  ++i){
                System.out.printf("%-50s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColums; ++i){
                System.out.printf("%-50s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1; i <= numColums; ++i){
                    System.out.printf("%-50s", rset.getString(i));
                }
                System.out.println();
            }

            //Hiển thị những đơn hàng đã bị hủy
            rset = stmt.executeQuery("SELECT * FROM `don_hang` WHERE TrangThai = 'Da huy' " );
            rsetMD = rset.getMetaData();
            numColums= rsetMD.getColumnCount();
            for (int i = 1; i < numColums;  ++i){
                System.out.printf("%-50s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColums; ++i){
                System.out.printf("%-50s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1; i <= numColums; ++i){
                    System.out.printf("%-50s", rset.getString(i));
                }
                System.out.println();
            }


        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
