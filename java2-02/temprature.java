package java2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class temprature {
    public static void main(String[] args){
        int n, sum = 0;
        float avenger ;
        int count =0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Nhập vào số ngày cần nhập: ");
            n = scanner.nextInt();
        } while (n < 0);


        int array[] = new int[n];

        System.out.println("Nhập nhiệt độ cho các ngày: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập nhiệt độ ngày thứ" + i + ": ");
            array[i] = scanner.nextInt();
            sum += array[i];

        }
        avenger = (float)sum / n;
        System.out.println("Avenger is: " + avenger);

        for(int i=0; i < n ; i++){
            if(array[i] >avenger){
                count ++;
            }
        }
        System.out.println("Có " + count + " ngày cao hơn nhiệt độ trung bình");
    }
}
