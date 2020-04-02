package java2_09;

import java.sql.*;
import java.util.Scanner;

public class Exercise2 {
    public void giftSignUp(){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
            // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

            // Step 2: Allocate a 'Statement' object in the Connection
            Statement stmt = con.createStatement();
        )
        {
            PreparedStatement pstm4 = con.prepareStatement(
                    "insert into users (username, password,role) values (?,?,?)"
            );
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập tên tài khoản:");
            String tk = sc.next();
            System.out.println("Nhập mật khẩu:");
            String mk = sc.next();
            System.out.println("Nhập quyền truy câp:");
            String role = sc.next();
            pstm4.setString(1,tk);
            pstm4.setString(2,mk);
            pstm4.setString(3,role);
            int countInserted  = pstm4.executeUpdate();
            System.out.println(countInserted + "Đăng kí thành công.\n");
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void giftLogIn(){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
            // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

            // Step 2: Allocate a 'Statement' object in the Connection

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
                System.out.println("Đăng nhập thành công");
                System.out.println("Mời bạn lựa chọn" +
                        "\n" +
                        "0 - Quay lại\n" +
                        "1 - Hiển thị danh sách mặt hàng\n" +
                        "2 - Thêm mặt hàng\n" +
                        "3 - Xóa mặt hàng\n"
                );
                int n;
                do {
                    do {
                        System.out.println("Nhập lựa chọn của bạn");
                        n = sc.nextInt();
                    }while (n < 0 || n > 6);
                    switch (n) {
                        case 1:
                            try(Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                                Statement stmt1 = con1.createStatement();
                            )
                            {
                                ResultSet rset1 = stmt1.executeQuery("select  * from sach");
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

                            }
                            catch (SQLException ex) {
                                ex.printStackTrace();
                            };
                            System.out.println("Mời bạn lựa chọn" +
                                    "\n" +
                                    "0 - Quay lại\n" +
                                    "1 - Hiển thị danh sách mặt hàng\n" +
                                    "2 - Thêm mặt hàng\n" +
                                    "3 - Xóa mặt hàng\n"
                            );
                            break;
                        case 2:
                            try(Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                                Statement stmt2 = con2.createStatement();
                            ){
                                PreparedStatement pstm1 = con2.prepareStatement(
                                    "insert into sach values(?,?,?,?,?,?,?,?,?,?,?)"
                                );
                                String title, nd,status;
                                int price;
                                int qty,id,namXb, lanXB,sl,NxbId,TgId,LsId;
                                System.out.println("Nhập id cuốn sách");
                                id = sc.nextInt();
                                System.out.println("Nhập tên cuốn sách");
                                title = sc.next();
                                System.out.println("Nhập nội dung cuốn sách");
                                nd = sc.next();
                                System.out.println("Nhập năm xuất bản");
                                namXb = sc.nextInt();
                                System.out.println("Nhập lần xuất bản");
                                lanXB = sc.nextInt();
                                System.out.println("Nhập giá bán");
                                price = sc.nextInt();
                                System.out.println("Nhập số lượng");
                                sl = sc.nextInt();
                                System.out.println("Nhập trạng thái");
                                status = sc.next();
                                System.out.println("Nhập id của nhà xuất bản");
                                NxbId = sc.nextInt();
                                System.out.println("Nhập id của tác giả");
                                TgId = sc.nextInt();
                                System.out.println("Nhập id của loại sách");
                                LsId = sc.nextInt();
                                pstm1.setInt(1,id);
                                pstm1.setString(2,title);
                                pstm1.setString(3,nd);
                                pstm1.setInt(4,namXb);
                                pstm1.setInt(5,lanXB);
                                pstm1.setInt(6,price);
                                pstm1.setInt(7,sl);
                                pstm1.setString(8,status);
                                pstm1.setInt(9,NxbId);
                                pstm1.setInt(10,TgId);
                                pstm1.setInt(11,LsId);
                                int rowsInserted = pstm.executeUpdate();
                                System.out.println(rowsInserted + "đã cập nhập");
                            }catch (SQLException ex) {
                                ex.printStackTrace();
                            };
                            System.out.println("Mời bạn lựa chọn" +
                                    "\n" +
                                    "0 - Quay lại\n" +
                                    "1 - Hiển thị danh sách mặt hàng\n" +
                                    "2 - Thêm mặt hàng\n" +
                                    "3 - Xóa mặt hàng\n"
                            );
                            break;
                        case 3:
                            try(Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                                Statement stmt3 = con3.createStatement();
                            ){
                                PreparedStatement pstm2 = con3.prepareStatement(
                                        "delete from sach where id =?"
                                );
                                int id;
                                System.out.println("Nhập id cuốn sách bạn muốn xóa: ");
                                id = sc.nextInt();
                                pstm2.setInt(1,id);
                                int rowsInserted = pstm.executeUpdate();
                                System.out.println(rowsInserted + "đã xóa");


                            }catch (SQLException ex) {
                                ex.printStackTrace();
                            };
                            System.out.println("Mời bạn lựa chọn" +
                                    "\n" +
                                    "0 - Quay lại\n" +
                                    "1 - Hiển thị danh sách mặt hàng\n" +
                                    "2 - Thêm mặt hàng\n" +
                                    "3 - Xóa mặt hàng\n"
                            );
                            break;
                    }
                }while (n != 0);
            }else{
                System.out.println("Thông tin tài khoản và mật khẩu không chính xác");
            }

        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}