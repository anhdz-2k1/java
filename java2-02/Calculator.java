package java2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int n, sum = 0;
        float avenger = 1f;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);


        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        avenger = sum/n;
        System.out.println("Avenger is: " + avenger);
}}

