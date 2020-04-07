package java2_practive;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        ProgramStudent p1 = new ProgramStudent();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn lựa chọn\n" +
                "0 - Kết thức chương trình\n" +
                "1 - Thêm học sinh\n" +
                "2 - Hiển thị danh sách\n" +
                "3 - Lưu");
        int j;
        do{
            do {
                System.out.println("Nhập sự lưa chọn của bạn");
                j = sc.nextInt();
            }while ( j<0 || j >3 );
            switch (j){
                case 1:
                    p1.addStudent();
                    break;
                case 2:
                    p1.displayStudent();
                    break;
                case 3:
                    p1.saveStudent();
                    break;
            }
        }while (j!=0);
    }
}
