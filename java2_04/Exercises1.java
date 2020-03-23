package java2_04;
import  java.sql.*;

public class Exercises1 {
    public static void main(String[] args ){
        try(
                // Step 1: Allocate a database 'Connection' object
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection

                Statement stmt = conn.createStatement();
        ) {

            // select * from books
            int rowCount2 = 0;
            String selectBooks = "select * from books";
            System.out.println("The SQL statement is: " + selectBooks +  "\n");
            ResultSet rset2 = stmt.executeQuery(selectBooks);
            System.out.println("The records selected are: ");
            while (rset2.next()){
                int id = rset2.getInt("id");
                String title = rset2.getString("title");
                String authors = rset2.getString("authors");
                double price = rset2.getDouble("price");
                int qty = rset2.getInt("qty");
                System.out.println(id + ", " + title + ", " + authors + ", " + price + "," + qty );
                ++rowCount2;
            }

            //select title, price from books where author = 'codeLean Vn'
            int rowCount3 = 0;
            String select2 = "select title, price from books where authors = 'CodeLean VN'";
            System.out.println("The SQL statement is: " + select2+  "\n");
            ResultSet rset3 = stmt.executeQuery(select2);
            System.out.println("The records selected are: ");
            while (rset3.next()){
                String title = rset3.getString("title");
                double price = rset3.getDouble("price");
                System.out.println( title + ", " + price );
                ++rowCount3;
            }

            int rowCount4= 0;
            String select3 = "select title, authors, price, qty from books where authors = 'CodeLean VN' or price >= 30 order by price DESC, id Asc ";
            System.out.println("The SQL statement is: " + select3+  "\n");
            ResultSet rset4 = stmt.executeQuery(select3);
            System.out.println("The records selected are: ");
            while (rset4.next()){
                String title = rset4.getString("title");
                String author = rset4.getString("authors");
                double price = rset4.getDouble("price");
                int qty = rset4.getInt("qty");
                System.out.println(title + ", " + author + ", " + price + ", " + qty);
                ++rowCount4;
            }




        } catch (SQLException ex){
            ex.printStackTrace();
        }

    }
}
