package java2_11;


import java.sql.*;
import java.util.*;

public class java2_11 {
    ArrayList<item> itemlist = new ArrayList<>();
    public void addcart(){
        Scanner sc= new Scanner(System.in);
        try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
            Statement stmt = conn.createStatement();
            )
        {
               ResultSet rset1 = stmt.executeQuery("select  * from sach");
               ResultSetMetaData rsetMD = rset1.getMetaData();
               int numColums = rsetMD.getColumnCount();

               for (int i = 1; i < numColums;  ++i){
                   System.out.printf("%-30s", rsetMD.getColumnName(i));
               }
               System.out.println();
               for (int i = 1; i <= numColums; ++i){
                   System.out.printf("%-30s",
                           "(" + rsetMD.getColumnClassName(i) + ")");
               }
               System.out.println();
               while (rset1.next()){
                   for (int i = 1; i <= numColums; ++i){
                       System.out.printf("%-30s", rset1.getString(i));
                   }
                   System.out.println();
               }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        int j;
        System.out.println("Nhập sự lựa chọn của bản: \n" +
                "1: Tiếp tục mua hàng: \n" +
                "0: Kết thúc mua hàng");

        do {
            do {
                System.out.println("Nhập sự lưa chọn của bạn");
                j = sc.nextInt();
            } while (j < 0 || j > 1);

            switch (j) {

                case 1:
                    System.out.println("Nhập id sản phẩm: ");
                    int product_id = sc.nextInt();
                    System.out.println("Nhập số lượng: ");
                    int qty = sc.nextInt();
                    System.out.println("Nhập giá sản sản phẩm:");
                    float price = sc.nextFloat();
                    System.out.println("Nhập giá được giảm: ");
                    float discount = sc.nextFloat();
                    item item = new item(product_id,qty,price,discount);
                    itemlist.add(new item(item.getProduct_id(),item.getQty(),item.getPrice(),item.getDiscount()));
                    break;
            }
        } while (j!=0);
        System.out.println("Danh sách các mặt hàng: ");
        Iterator<item> itemIterator = itemlist.iterator();
        while (itemIterator.hasNext()) {
            item iteml = itemIterator.next();
            System.out.println("danh sách sản phẩm bạn chọn mua: " +  iteml );
        }

    }
    public void checkout(){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
            Statement stmt = con.createStatement();
        )
        {
        PreparedStatement pstm = con.prepareStatement(
                    "select * from users where username = ? and password = ?"
        );
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập tên tài khoản:");
            String tk = sc.next();
            System.out.println("Nhập mật khẩu:");
            String mk = sc.next();
            pstm.setString(1,tk);
            pstm.setString(2,mk);
            ResultSet rset = pstm.executeQuery();
            if(rset.next()){
                System.out.println("Đăng nhập thành công: ");
                System.out.println("Nhập phương thức thanh toán:\n" +
                        "1: COD\n" +
                        "2: Visa"
                        );
                int n = sc.nextInt();
                if(n == 1){
             PreparedStatement pstmInsert = con.prepareStatement(
                            "INSERT INTO don_hang_chi_tiet(SoLuong,GiaBan,GiamGia,SachId,dia_chi_gh,hinh_thuc) VALUES(?,?,?,?,?,'Cod');"
                    );
                    Iterator<item> itemIterator = itemlist.iterator();


                    while (rset.next()){
                        System.out.println("Đơn hàng đã được xác nhận");
                        PreparedStatement pstmUpdate = con.prepareStatement(
                                "UPDATE sach SET SoLuong = SoLuong - ? WHERE SachId = ?;"
                        );
                        pstmUpdate.setInt(1, );
                        pstmUpdate.setInt(2,id);
                        pstmUpdate.executeUpdate();
                    }
                } else if (n ==2){
                    PreparedStatement pstmInsert = con.prepareStatement(
                            " INSERT INTO don_hang_chi_tiet(SoLuong,GiaBan,GiamGia,SachId,dia_chi_gh,hinh_thuc) VALUES(?,?,?,?,?,'Visa')"
                    );
                    System.out.println("Nhập số lượng: ");
                    int sl = sc.nextInt();
                    System.out.println("Giá bán:");
                    int price = sc.nextInt();
                    System.out.println("Discount:");
                    int discount = sc.nextInt();
                    System.out.println("Nhập id của sách: ");
                    int id = sc.nextInt();
                    System.out.println("Nhập địa chỉ giao hàng: ");
                    String addr = sc.next();
                    pstmInsert.setInt(1,i);
                    pstmInsert.setInt(2,price);
                    pstmInsert.setInt(3,discount);
                    pstmInsert.setInt(4,id);
                    pstmInsert.setString(5,addr);
                    rset = pstmInsert.executeQuery();
                    while (rset.next()){
                        System.out.println("Đơn hàng đã được xác nhận");
                        PreparedStatement pstmUpdate = con.prepareStatement(
                                "UPDATE sach SET SoLuong = SoLuong - ? WHERE SachId = ?;"
                        );
                        pstmUpdate.setInt(1,sl);
                        pstmUpdate.setInt(2,id);
                        pstmUpdate.executeUpdate();
                    }
                }

            }else {
                System.out.println("Thông tin tài khoản và mật khẩu không chính xác vui lòng đăng nhập lại");
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        };
    }
    public void review(){
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                Statement stmt = conn.createStatement();
        )
        {
            
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
