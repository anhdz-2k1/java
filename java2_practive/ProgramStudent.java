package java2_practive;

import java.util.ArrayList;
import java.sql.*;
import java.util.*;
import java.util.Scanner;

public class ProgramStudent {
    private ArrayList<Student> StudentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent(){
        System.out.println("Nhâp số học sinh muốn thêm: ");
        int n = sc.nextInt();
        for(int i =0; i < n; i++){
            System.out.println("Nhập tên học sinh thứ "+ (i+1));
            String name = sc.next();
            System.out.println("Nhập địa chỉ của học sinh thứ " + (i+1));
            String address = sc.next();
            System.out.println("Nhập số điện thoại của học sinh thứ " + (i+1));
            String phone = sc.next();
            Student student = new Student(name,address,phone);
            StudentList.add(new Student(student.getName(),student.getAddress(),student.getPhone()));
        }
    }


    public void displayStudent(){
        System.out.println("Danh sách học sinh: ");
        Iterator<Student> StudentIterator = StudentList.iterator();
        while (StudentIterator.hasNext()) {
            Student stl = StudentIterator.next();
            System.out.println(stl );
        }

    }

    public void saveStudent(){
        try(
        Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
        Statement stmt = con2.createStatement();
        PreparedStatement pstm = con2.prepareStatement("insert into student(name,address,phone) values (?,?,?)")
        ) {
            Iterator<Student> StudentInteretor = StudentList.iterator();
            int j =0;
            while (StudentInteretor.hasNext()){
                Student st2 = StudentInteretor.next();
                pstm.setString(1,st2.getName());
                pstm.setString(2,st2.getAddress());
                pstm.setString(3,st2.getPhone());
                int rowInserted = pstm.executeUpdate();
                j+=rowInserted;
            }
            System.out.println( j + "Đã thêm thành công");

            ResultSet rset1 = stmt.executeQuery("select  * from student");
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
        } catch (SQLException ex) {

            ex.printStackTrace();
        }
    }
}



