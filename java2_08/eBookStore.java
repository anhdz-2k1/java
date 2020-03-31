package java2_08;
import java2_08.giftuser.user;

import  java.sql.*;
import java.util.Scanner;
public class eBookStore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        user u1 = new user();
        System.out.println("Mời bạn lựa chọn\n" +
                "0 - Kết thức chương trình\n" +
                "1 - Đăng nhập\n" +
                "2 - Đăng kí tài khoản\n" );
        int j;
        do{
            do {
                System.out.println("Nhập sự lưa chọn của bạn");
                j = sc.nextInt();
            }while ( j<0 || j >2 );
            switch (j){
                case 2:
                    u1.giftSignUp();
                    break;
                case 1:
                    u1.giftLogIn();
                    System.out.println("Mời bạn lựa chọn\n" +
                            "0 - Kết thúc chương trình\n" +
                            "1 - Đăng nhập\n" +
                            "2 - Đăng kí tài khoản\n" );
                    break;
            }
        }while (j!=0);

    }
}
