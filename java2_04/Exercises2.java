package java2_04;
import  java.sql.*;
import  java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args){
        try(
                // Step 1: Allocate a database 'Connection' object
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection

                Statement stmt = con.createStatement();
        ){
            //Hiển thị danh sách khách hàng
            int a = 0;
            String ex1 = "select * from customers";
            ResultSet rset1 = stmt.executeQuery(ex1);
            System.out.println("Sau đây là danh sách khách hàng: ");
            while (rset1.next()){
                 String customerID = rset1.getString("CustomerID");
                 String CompanyName = rset1.getString("CompanyName");
                 String ContactName = rset1.getString("ContactName");
                 String ContactTitle = rset1.getString("ContactTitle");
                 String Address = rset1.getString("Address");
                 String City = rset1.getString("City");
                 String Country = rset1.getString("Country");
                 String Phone = rset1.getString("Phone");
                 System.out.println(customerID + ", " + CompanyName + ", " + ContactName + ", " + ContactTitle + ", " + Address + ", " + City + ", " +  Country + ", " + Phone + ", ");
                 ++a;
            }

            //Tìm khách hàng theo tên
            int b = 0;
            String ex2 = "select * from customers where CompanyName = 'IT'";
            ResultSet rset2 = stmt.executeQuery(ex2);
            System.out.println("Sau đây là danh sách khách hàng: ");
            while (rset2.next()){
                String customerID = rset2.getString("CustomerID");
                String CompanyName = rset2.getString("CompanyName");
                String ContactName = rset2.getString("ContactName");
                String ContactTitle = rset2.getString("ContactTitle");
                String Address = rset2.getString("Address");
                String City = rset2.getString("City");
                String Country = rset2.getString("Country");
                String Phone = rset2.getString("Phone");
                System.out.println(customerID + ", " + CompanyName + ", " + ContactName + ", " + ContactTitle + ", " + Address + ", " + City + ", " +  Country + ", " + Phone + ", ");
                ++b;
            }

            //hiển thị danh sách sản phẩm
            int c = 0;
            String ex3 = "select * from products";
            ResultSet rset3 = stmt.executeQuery(ex3);
            System.out.println("Sau đây là danh sách sản phẩm: ");
            while (rset3.next()){
                int id = rset3.getInt("ProductID");
                String ProductName = rset3.getString("ProductName");
                int SupplierID = rset3.getInt("SupplierID");
                int CategoryID = rset3.getInt("CategoryID");
                String QuantityPerUnit = rset3.getString("QuantityPerUnit");
                float UnitPrice = rset3.getFloat("UnitPrice");
                int UnitsInStock = rset3.getInt("UnitsInStock");
                int UnitsOnOrder = rset3.getInt("UnitsOnOrder");
                int ReorderLevel = rset3.getInt("ReorderLevel");
                int Discontinued = rset3.getInt("Discontinued");
                System.out.println(id + ", " + ProductName + ", " + SupplierID + ", " + CategoryID + ", " + QuantityPerUnit + ", " + UnitPrice + ", " + UnitsInStock + ","  + UnitsOnOrder + ", " + ReorderLevel + ", " + Discontinued);
                ++c;
            }

            //Tìm sản phẩm theo giá bántrong khoảng do người dùng nhâpk
            int d = 0;
            String ex4 = "select * from products where UnitPrice >= 110.00 ";
            ResultSet rset4 = stmt.executeQuery(ex4);
            System.out.println("Sau đây là danh sách sản phẩm: ");
            while (rset4.next()){
                int id = rset4.getInt("ProductID");
                String ProductName = rset4.getString("ProductName");
                int SupplierID = rset4.getInt("SupplierID");
                int CategoryID = rset4.getInt("CategoryID");
                String QuantityPerUnit = rset4.getString("QuantityPerUnit");
                float UnitPrice = rset4.getFloat("UnitPrice");
                int UnitsInStock = rset4.getInt("UnitsInStock");
                int UnitsOnOrder = rset4.getInt("UnitsOnOrder");
                int ReorderLevel = rset4.getInt("ReorderLevel");
                int Discontinued = rset4.getInt("Discontinued");
                System.out.println(id + ", " + ProductName + ", " + SupplierID + ", " + CategoryID + ", " + QuantityPerUnit + ", " + UnitPrice + ", " + UnitsInStock + ","  + UnitsOnOrder + ", " + ReorderLevel + ", " + Discontinued);
                ++d;
            }

            //Hiển thị thông tin chi tiết của 1 đơn hàng
            int e = 0;
            String ex5 = "SELECT * FROM `order details` WHERE 1";
            ResultSet rset5 = stmt.executeQuery(ex5);
            System.out.println("Chi tiết các đơn hàng");
            while (rset5.next()){
                int OrderID = rset5.getInt("OrderID");
                int productID = rset5.getInt("ProductID");
                float UnitPrice = rset5.getFloat("UnitPrice");
                int Quantity = rset5.getInt("Quantity");
                int Discount = rset5.getInt("Discount");
                System.out.println(OrderID + ", " + productID + "," + UnitPrice + ", " + Quantity + ", " + Discount  );
                ++e;
            }


        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
