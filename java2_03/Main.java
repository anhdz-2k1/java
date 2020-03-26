package java2_03;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Trang chủ...\n" +
                "1 - Thêm liên hệ\n" +
                "2 - Hiển thị danh bạ\n" +
                "3 - Cập nhật liên hệ\n" +
                "4 - Xóa liên hệ\n" +
                "5 - Tìm kiếm\n"+
                "6 - Kết thúc");
        int n;
        ContactList c1 = new ContactList();
        Scanner in = new Scanner(System.in);
        do {
            do {
                System.out.println("Mời bạn chọn: ");
                n = in.nextInt();
            }while (n < 0 || n > 6);
            switch (n) {
                case 1:
                    c1.addContact();
                    System.out.println("Trang chủ...\n" +
                        "1 - Thêm liên hệ\n" +
                        "2 - Hiển thị danh bạ\n" +
                        "3 - Cập nhật liên hệ\n" +
                        "4 - Xóa liên hệ\n" +
                        "5 - Tìm kiếm\n" +
                        "6 - Kết thúc");
                    break;
                case 2:
                    c1.printContact();
                    System.out.println("Trang chủ...\n" +
                            "1 - Thêm liên hệ\n" +
                            "2 - Hiển thị danh bạ\n" +
                            "3 - Cập nhật liên hệ\n" +
                            "4 - Xóa liên hệ\n" +
                            "5 - Tìm kiếm\n" +
                            "6 - Kết thúc");
                    break;
                case 3:
                    c1.updateContact();
                    System.out.println("Trang chủ...\n" +
                            "1 - Thêm liên hệ\n" +
                            "2 - Hiển thị danh bạ\n" +
                            "3 - Cập nhật liên hệ\n" +
                            "4 - Xóa liên hệ\n" +
                            "5 - Tìm kiếm\n" +
                            "6 - Kết thúc");
                    break;
                case 4:
                    c1.removeContact();
                    System.out.println("Trang chủ...\n" +
                            "1 - Thêm liên hệ\n" +
                            "2 - Hiển thị danh bạ\n" +
                            "3 - Cập nhật liên hệ\n" +
                            "4 - Xóa liên hệ\n" +
                            "5 - Tìm kiếm\n" +
                            "6 - Kết thúc");
                    break;
                case 5:
                    c1.searchContact();
                    System.out.println("Trang chủ...\n" +
                            "1 - Thêm liên hệ\n" +
                            "2 - Hiển thị danh bạ\n" +
                            "3 - Cập nhật liên hệ\n" +
                            "4 - Xóa liên hệ\n" +
                            "5 - Tìm kiếm\n" +
                            "6 - Kết thúc");
                    break;
            }
        }while (n != 6);
    }
    }

