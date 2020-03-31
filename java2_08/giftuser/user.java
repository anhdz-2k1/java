package java2_08.giftuser;

import java2_06.giftcontroller.GiftController;
import java2_06.giftmodel.Gift;

import java.sql.*;
import java.util.Scanner;

public class user {
    public void giftSignUp(){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
            // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

            // Step 2: Allocate a 'Statement' object in the Connection

            Statement stmt = con.createStatement();
        )
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập tên tài khoản:");
            String tk = sc.next();
            System.out.println("Nhập mật khẩu:");
            String mk = sc.next();
            System.out.println("Nhập quyền truy câp:");
            String role = sc.next();
            String sqlInsert = "insert into users (usernam, password,role) values ( " + "'" + tk + "'," + "'" + mk + "'," + "'" + role + "'" +  ")";
            int countInserted  = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + "Đăng kí thành công.\n");


        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void giftLogIn(){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
            // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

            // Step 2: Allocate a 'Statement' object in the Connection

            Statement stmt = con.createStatement();
        )
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập tên tài khoản:");
            String tk = sc.next();
            System.out.println("Nhập mật khẩu:");
            String mk = sc.next();
            String sqlSelect = "select * from users where usernam = " + "'" + tk + "'" + "and password = " + "'" + mk + "'" ;
            ResultSet rset = stmt.executeQuery(sqlSelect);
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
                        try(Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                                // Step 2: Allocate a 'Statement' object in the Connection

                                Statement stmt1 = con1.createStatement();
                            )
                            {
                                int a = 0;
                                String java2_1 = "SELECT * FROM books";
                                ResultSet rset1 = stmt1.executeQuery(java2_1);
                                System.out.println("Chi tiết các cuốn sách");
                                while (rset1.next()){
                                    int id = rset1.getInt("id");
                                    String title = rset1.getString("title");
                                    String authors = rset1.getString("authors");
                                    float price = rset1.getFloat("price");
                                    int qty = rset1.getInt("qty");
                                    System.out.println(id +", " + title + ", " + authors + ", " + price + ", " + qty);
                                    ++a;
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
                            try(Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                                Statement stmt2 = con2.createStatement();
                            ){
                                String title, authors;
                                float price;
                                int qty,id;
                                System.out.println("Nhập id cuốn sách");
                                id = sc.nextInt();
                                System.out.println("Nhập title cuốn sách");
                                title = sc.next();
                                System.out.println("Nhập authors cuốn sách");
                                authors = sc.next();
                                System.out.println("Nhập price cuốn sách");
                                price = sc.nextFloat();
                                System.out.println("Nhập qty cuốn sách");
                                qty = sc.nextInt();
                                String sqlInsert = "insert into books (id,title,authors,price,qty) values ( " + id + ","  + "'" + title + "'," + "'" + authors + "'," + price + "," + qty + ")";
                                int countInserted  = stmt.executeUpdate(sqlInsert);
                                System.out.println(countInserted + "Thêm thành công.\n");

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
                            try(Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                                Statement stmt3 = con3.createStatement();
                            ){
                                int id;
                                System.out.println("Nhập id cuốn sách bạn muốn xóa: ");
                                id = sc.nextInt();
                                String sqlDelete = "delete from books where id =  " + id;
                                int countDeleted = stmt.executeUpdate(sqlDelete);
                                System.out.println(countDeleted + "Đã xóa" );

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
