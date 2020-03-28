package java2_07;

import java.sql.*;

public class exercises2 {
    public static void main(String[] args){
        try (
                // Step 1: Allocate a database 'Connection' object
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection

                Statement stmt = con.createStatement();
        ){
            // 1
            String strUpdate = "update categories set CategoryName = 'Seafood VN' where CategoryName = 'Seafood' ";
            System.out.println("The Sql statement is: " + strUpdate + "\n");
            int countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate + " Cập nhập thành công.\n");

            int a = 0;
            String java2_1 = "SELECT * FROM `categories` where CategoryName = 'Seafood VN' ";
            ResultSet rset1 = stmt.executeQuery(java2_1);
            System.out.println("Chi tiết ");
            while (rset1.next()){
                int CategoryID = rset1.getInt("CategoryID");
                String CategoryName = rset1.getString("CategoryID");
                String Description = rset1.getString("Description");
                String Picture = rset1.getString("Picture");
                System.out.println(CategoryID + ", " + CategoryName + ", " + Description + ", " + Picture);
                ++a;
            }


            //2
            strUpdate = "update customers set Address = '1A - Yet Kieu - Ha Noi' where CustomerID = 'FRANK'";
            System.out.println("The Sql statement is: " + strUpdate + "\n");
            countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate + " Cập nhập thành công.\n");

            int b=0;
            String java2_2 = "SELECT * FROM `customers` where CustomerID = 'FRANK' ";
            ResultSet rset2 = stmt.executeQuery(java2_2);
            System.out.println("Chi tiết ");
            while (rset2.next()) {
                String CustomerID = rset2.getString("CustomerID");
                String CompanyName= rset2.getString("CompanyName");
                String ContactName= rset2.getString("ContactName");
                String ContactTitle= rset2.getString("ContactName");
                String Address = rset2.getString("Address");
                String City = rset2.getString("City");
                String PostalCode = rset2.getString("PostalCode");
                String Country = rset2.getString("Country");
                String Phone = rset2.getString("Phone");
                String Fax = rset2.getString("Fax");
                System.out.println(CustomerID + ", " + CompanyName + ", " + ContactName + ", " + ContactTitle + ", " + Address + ", " + City + "," + PostalCode + ", " + Country + "," + Phone + ", " + Fax );
                ++b;
            }

            //3
            strUpdate = "update products set UnitPrice = UnitPrice + (UnitPrice/10) where CategoryID = 5 or CategoryID = 7 or CategoryID = 8";
            System.out.println("The Sql statement is: " + strUpdate + "\n");
            countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate + " Cập nhập thành công.\n");

            int c=0;
            String java2_3 = "SELECT * FROM `products`  WHERE CategoryID = 5 or CategoryID = 7 or CategoryID = 8";
            ResultSet rset3 = stmt.executeQuery(java2_3);
            System.out.println("Chi tiết sau update là ");
            while (rset3.next()) {
                int ProductID = rset3.getInt("ProductID");
                String ProductName = rset3.getString("ProductName");
                String UnitPrice = rset3.getString("UnitPrice");
                System.out.println(ProductID + ", " + ProductName + ", " + UnitPrice);
                ++c;
            }

            //4
            strUpdate = "update orders set ShipVia = 3 where OrderId = 10313";
            System.out.println("The Sql statement is: " + strUpdate + "\n");
            countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate + " Cập nhập thành công.\n");

            int d=0;
            String java2_4 = "SELECT * FROM orders where OrderId = 10313 ";
            ResultSet rset4 = stmt.executeQuery(java2_4);
            System.out.println("Chi tiết sau update là ");
            while (rset4.next()) {
                int OrderId = rset4.getInt("OrderID");
                int ShipVia = rset4.getInt("ShipVia");
                System.out.println("Order Id: " + OrderId +  ", ShipVia: " + ShipVia );
                ++d;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
