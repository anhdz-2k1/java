package java2_06;

import java.sql.*;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args){
        try(
                // Step 1: Allocate a database 'Connection' object
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection

                Statement stmt = con.createStatement();
        ){
            Scanner sc = new Scanner(System.in);
            // xóa
            String sqlDelete = "delete from books where id > 8000";
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + "Đã xóa" );

            //insert 2 cuốn sách
            String sqlInsert = "insert into books values "
                    + "(8001,'Java Core','Dang Kim Thi',15.55,55),"
                    + "(8002,'Java Advanced','James Goslling',25.55,55)";
            System.out.println("The SQL statment is: " + sqlInsert + "\n");
            int countInserted  = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + "Thêm thành công.\n");

            // insert 1 cuốn sách
            sqlInsert = "insert into books (id,title,authors) values (2001,'Java JDBC MySQl','ThiDK')";
            System.out.println("The SQL statment is: " + sqlInsert + "\n");
             countInserted  = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + "Thêm thành công.\n");

            int id;
            System.out.println("nhập id cuốn sách bạn muốn xóa");
            id = sc.nextInt();
            sqlDelete = "delete from books where id = " + id;
             countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + "Đã xóa" );

            //Thêm mới một cuốn sách do người dùng nhập vào
            String title, authors;
            float price;
            int qty;
            System.out.println("Nhập id cuốn sách: ");
            id = sc.nextInt();
            System.out.println("Nhập title cuốn sách");
            title = sc.nextLine();
            System.out.println("Nhập authors cuốn sách");
            authors = sc.next();
            System.out.println("Nhập price cuốn sách");
            price = sc.nextFloat();
            System.out.println("Nhập qty cuốn sách");
            qty = sc.nextInt();
            sqlInsert = "insert into books values ( " + id + "," + "'" + title + "'," + "'" + authors + "'," + price + "," + qty + ")";
            countInserted  = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + "Thêm thành công.\n");
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
