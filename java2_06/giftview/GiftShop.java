package giftview;
import giftcontroller.GiftController;
import giftmodel.Gift;
import java.sql.*;
import java.util.Scanner;

public class GiftShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn lựa chọn" +
                "\n" +
                "0 - kết thúc chương trình\n" +
                "1 - Hiển thị danh sách mặt hàng\n" +
                "2 - Thêm mặt hàng\n" +
                "3 - Xóa mặt hàng\n"
                );
        int n;
        GiftController g1 = new GiftController();


        do {
            do {
                System.out.println("Nhập lựa chọn của bạn");
                n = sc.nextInt();
            }while (n < 0 || n > 6);
            switch (n) {
                case 1:
                    g1.giftSelect();
                    break;
                case 2:
                    String name;
                    float price;
                    int qty;
                    System.out.println("Nhập tên mặt hàng: ");
                    name = sc.next();
                    System.out.println("Nhập giá: ");
                    price = sc.nextFloat();
                    System.out.println("Nhập số lượng");
                    qty = sc.nextInt();
                    Gift gift1 = new Gift(name, price, qty);
                    g1.giftInsert(gift1);
                    break;
                case 3:
                    System.out.println("Nhập id mặt hàng bạn muốn xóa: ");
                    String id = sc.next();
                    Gift gift2 = new Gift(id);
                    g1.giftDelete(gift2);
                    break;


            }
        }while (n != 0);
    }
}
