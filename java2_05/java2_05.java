package java2_05;
import java.sql.*;
import java.util.Scanner;


public class java2_05 {
    public static void main(String[] args){
        try(
                // Step 1: Allocate a database 'Connection' object
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection

                Statement stmt = con.createStatement();
        ){
            Scanner sc = new Scanner(System.in);
          // hiển thị 5 cuốn sách mới nhất
            int a = 0;
            String java2_1 = "SELECT * FROM `sach` ORDER by NamXuatBan DESC LIMIT 0,5";
            ResultSet rset1 = stmt.executeQuery(java2_1);
            System.out.println("Chi tiết các cuốn sách");
            while (rset1.next()){
                int id = rset1.getInt("id");
                String TenSach = rset1.getString("TenSach");
                String NamXb = rset1.getString("NamXuatBan");
                String LanXb = rset1.getString("LanXuatBan");
                int GiaBan = rset1.getInt("GiaBan");
                int soluong = rset1.getInt("SoLuong");
                String TrangThai = rset1.getString("TrangThai");
                System.out.println(id + ", " + TenSach + ", " + NamXb + ", " + LanXb + ", " + GiaBan + ", " + soluong + ", " + TrangThai);
                ++a;
            }

            //xem 3 cuốn bán chạy nhất
            int b = 0;
            String java2_2 = "SELECT * FROM `sach` WHERE id IN (SELECT SachId from don_hang_chi_tiet ORDER by SoLuong ASC LIMIT 0,3 )  ";
            ResultSet rset2 = stmt.executeQuery(java2_2 );
            System.out.println("Chi tiết những cuốn sách bán chạy nhất");
            while (rset2.next()){
                int id = rset2.getInt("id");
                String TenSach = rset2.getString("TenSach");
                String NamXb = rset2.getString("NamXuatBan");
                String LanXb = rset2.getString("LanXuatBan");
                int GiaBan = rset2.getInt("GiaBan");
                int soluong = rset2.getInt("SoLuong");
                String TrangThai = rset2.getString("TrangThai");
                System.out.println(id + ", " + TenSach + ", " + NamXb + ", " + LanXb + ", " + GiaBan + ", " + soluong + ", " + TrangThai);
                ++b;
            }

            //xem sach theo the loai
            int c = 0;
            int d;
            System.out.println("Nhap the loai ban muon tim kiem \n" +
                    "1: The Thao \n" +
                    "2: Tri Thuc"
            );
            d = sc.nextInt();
            String java2_3 = "SELECT * from sach where LoaiSachid in(SELECT id from loai_sach where id =    ";
            ResultSet rset3 = stmt.executeQuery(java2_3 + d  + ")"   );
            System.out.println("Chi tiết những cuốn sách bán chạy nhất");
            while (rset3.next()){
                int id = rset3.getInt("id");
                String TenSach = rset3.getString("TenSach");
                String NamXb = rset3.getString("NamXuatBan");
                String LanXb = rset3.getString("LanXuatBan");
                int GiaBan = rset3.getInt("GiaBan");
                int soluong = rset3.getInt("SoLuong");
                String TrangThai = rset3.getString("TrangThai");
                System.out.println(id + ", " + TenSach + ", " + NamXb + ", " + LanXb + ", " + GiaBan + ", " + soluong + ", " + TrangThai);
                ++c;
            }

            // xem sach theo tên tác giả
            int e = 0;
            int f;
            System.out.println("Nhậpp tên tác giả bận càn tìm kiếm \n" +
                    "1: Sir Alex \n " +
                    "2: Adrea Pirlo \n " +
                    "3: Jim White \n" +
                    "4: Lucas caioli \n" +
                    "5: Carlo Anceloti\n" +
                    "6: Nguyen Vuong Anh");
            f = sc.nextInt();
            String java2_4 = "SELECT * from sach where TacGiaID in(SELECT id from tac_gia where id =  ";
            ResultSet rset4 = stmt.executeQuery(java2_4 + f  + ")"   );
            System.out.println("Chi tiết những cuốn sách bán chạy nhất");
            while (rset4.next()){
                int id = rset4.getInt("id");
                String TenSach = rset4.getString("TenSach");
                String NamXb = rset4.getString("NamXuatBan");
                String LanXb = rset4.getString("LanXuatBan");
                int GiaBan = rset4.getInt("GiaBan");
                int soluong = rset4.getInt("SoLuong");
                String TrangThai = rset4.getString("TrangThai");
                System.out.println(id + ", " + TenSach + ", " + NamXb + ", " + LanXb + ", " + GiaBan + ", " + soluong + ", " + TrangThai);
                ++e;
            }

            //xem chi tiết về cuốn sách
            int g = 0;
            int h;
            System.out.println("Nhập id cuốn sách bạn cần tìm kiếm: \n" );
            h = sc.nextInt();
            String java2_5 = "SELECT * from sach where  id =  ";
            ResultSet rset5 = stmt.executeQuery(java2_5 + h     );
            System.out.println("Chi tiết  cuốn sách co id = " + h);
            while (rset5.next()){
                int id = rset5.getInt("id");
                String TenSach = rset5.getString("TenSach");
                String NamXb = rset5.getString("NamXuatBan");
                String LanXb = rset5.getString("LanXuatBan");
                int GiaBan = rset5.getInt("GiaBan");
                int soluong = rset5.getInt("SoLuong");
                String TrangThai = rset5.getString("TrangThai");
                System.out.println(id + ", " + TenSach + ", " + NamXb + ", " + LanXb + ", " + GiaBan + ", " + soluong + ", " + TrangThai);
                ++g;
            }

            // hiển thị 3 đơn hàng mới tiếp nhận
            int j = 0;
            String java2_6 = "SELECT * from don_hang ORDER by NgayChotDon ASC limit 0,2  ";
            ResultSet rset6 = stmt.executeQuery(java2_6);
            System.out.println("Hai đơn hàng mới tiếp nhận là" );
            while (rset6.next()){
                int id = rset6.getInt("id");
                String TrangThai = rset6.getString("TrangThai");
                String NgayChotDon = rset6.getString("NgayChotDon");
                String NgayNhanHang = rset6.getString("NgayNhanHang");
                int KhachHangID = rset6.getInt("KhachHangID");

                System.out.println(id + ", " + TrangThai + ", " + NgayChotDon + ", " + NgayNhanHang + ", " + KhachHangID );
                ++j;
            }


            //hiển thị đơn hàng theo mã khách hàng
            int j1 = 0;
            int k1;
            System.out.println("Nhập mã khách hàng: ");
            k1 = sc.nextInt();
            String java2_7 = "SELECT * from don_hang where KhachHangID =  ";
            ResultSet rset7 = stmt.executeQuery(java2_7 + k1 );
            System.out.println("Hai đơn hàng mới tiếp nhận là" );
            while (rset7.next()){
                int id = rset7.getInt("id");
                String TrangThai = rset7.getString("TrangThai");
                String NgayChotDon = rset7.getString("NgayChotDon");
                String NgayNhanHang = rset7.getString("NgayNhanHang");
                int KhachHangID = rset7.getInt("KhachHangID");

                System.out.println(id + ", " + TrangThai + ", " + NgayChotDon + ", " + NgayNhanHang + ", " + KhachHangID );
                ++j1;
            }

            // Hiển thị trạng thái đơn hàng theo id
            int j2 = 0;
            int k2;
            System.out.println("Nhập mã đơn hàng: ");
            k2 = sc.nextInt();
            String java2_8 = "SELECT TrangThai from don_hang where id =  ";
            ResultSet rset8 = stmt.executeQuery(java2_8 + k2  );
            while (rset8.next()){
                String TrangThai = rset8.getString("TrangThai");
                System.out.println( "Trang thái cảu đơn hàng có id " + k2 + "là " + TrangThai );
                ++j2;
            }

            // hiện thị thông tin đơn hàng theo id
            int j3 = 0;
            int k3;
            System.out.println("Nhập mã đơn hàng: ");
            k3 = sc.nextInt();
            String java2_12 = "SELECT * from don_hang where id =  ";
            ResultSet rset12 = stmt.executeQuery(java2_12 + k3  );
            while (rset12.next()){
                int id = rset12.getInt("id");
                String TrangThai = rset12.getString("TrangThai");
                String NgayChotDon = rset12.getString("NgayChotDon");
                String NgayNhanHang = rset12.getString("NgayNhanHang");
                int KhachHangID = rset12.getInt("KhachHangID");
                System.out.println(id + ", " + TrangThai + ", " + NgayChotDon + ", " + NgayNhanHang + ", " + KhachHangID );
                ++j3;
            }

           // hiển thị những đơn hàng đã  giao hàng thành công
            int j4 = 0;
            String java2_9 = "SELECT * FROM `don_hang` WHERE TrangThai = 'da thuc hien'  ";
            ResultSet rset9 = stmt.executeQuery(java2_9   );
            while (rset9.next()){
                int id = rset9.getInt("id");
                String TrangThai = rset9.getString("TrangThai");
                String NgayChotDon = rset9.getString("NgayChotDon");
                String NgayNhanHang = rset9.getString("NgayNhanHang");
                int KhachHangID = rset9.getInt("KhachHangID");
                System.out.println(id + ", " + TrangThai + ", " + NgayChotDon + ", " + NgayNhanHang + ", " + KhachHangID );
                ++j4;
            }

            // hiển thị những đơn hàng đang giao
            int j5 = 0;
            String java2_10 = "SELECT * FROM `don_hang` WHERE TrangThai = 'Dang thuc hien'  ";
            ResultSet rset10 = stmt.executeQuery(java2_10   );
            while (rset10.next()){
                int id = rset10.getInt("id");
                String TrangThai = rset10.getString("TrangThai");
                String NgayChotDon = rset10.getString("NgayChotDon");
                String NgayNhanHang = rset10.getString("NgayNhanHang");
                int KhachHangID = rset10.getInt("KhachHangID");
                System.out.println(id + ", " + TrangThai + ", " + NgayChotDon + ", " + NgayNhanHang + ", " + KhachHangID );
                ++j5;
            }

            // Hiển thị những đơn hàng đã bị hủy
            int j6 = 0;
            String java2_11 = "SELECT * FROM `don_hang` WHERE TrangThai = 'Da huy'  ";
            ResultSet rset11 = stmt.executeQuery(java2_11   );
            while (rset11.next()){
                int id = rset11.getInt("id");
                String TrangThai = rset11.getString("TrangThai");
                String NgayChotDon = rset11.getString("NgayChotDon");
                String NgayNhanHang = rset11.getString("NgayNhanHang");
                int KhachHangID = rset11.getInt("KhachHangID");
                System.out.println(id + ", " + TrangThai + ", " + NgayChotDon + ", " + NgayNhanHang + ", " + KhachHangID );
                ++j6;
            }


        }
        catch (SQLException ex){
            ex.printStackTrace();
        }


    }
}
