package giftcontroller;
import giftmodel.Gift;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;


public class GiftController {
    ArrayList<Gift> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void giftSelect(){
        try(
                // Step 1: Allocate a database 'Connection' object
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection

                Statement stmt = con.createStatement();
        ){
            int a = 0;
            String java2_1 = "SELECT * FROM gift ";
            ResultSet rset1 = stmt.executeQuery(java2_1);
            System.out.println("Chi tiết các mặt hàng");
            while (rset1.next()){
                int id = rset1.getInt("id");
                String name = rset1.getString("name");
                int price = rset1.getInt("price");
                int qty = rset1.getInt("qty");
                System.out.println("id: " + id + " name: " + name + " price: " + price + " qty: " + qty);
                ++a;
            }
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void giftInsert(Gift gift){
        try(
                // Step 1: Allocate a database 'Connection' object
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection

                Statement stmt = con.createStatement();
        ){

            String sqlInsert = "insert into gift (name, price,qty) values ( " + "'" + gift.getName() + "'," + gift.getPrice() + "," + gift.getQty() + ")";
            int countInserted  = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + "Thêm thành công.\n");
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }

    }
    public void giftDelete(Gift gift){
        try(
                // Step 1: Allocate a database 'Connection' object
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection

                Statement stmt = con.createStatement();
        ){

            String sqlDelete = "delete from gift where id =  " + "'" + gift.getId() + "'";
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + "Đã xóa" );
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }



}
