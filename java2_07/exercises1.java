package java2_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class exercises1 {
    public static void main(String[] args){
        try (
                // Step 1: Allocate a database 'Connection' object
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection

                Statement stmt = con.createStatement();
             ){
            //Tăng price lên 50 cho 'A cup of Java'
            String strUpdate = "update books set price = price + (price/2) where title = 'A cup of Java'";
            System.out.println("The Sql statement is: " + strUpdate + "\n");
            int countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate + " Cập nhập thành công.\n");


            //set quy là 0 cho "A Teaspoon of Java"
             strUpdate = "update books set qty = 0 where title = 'A Teaspoon of Java'";
            System.out.println("The Sql statement is: " + strUpdate + "\n");
            countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate + " Cập nhập thành công.\n");

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
