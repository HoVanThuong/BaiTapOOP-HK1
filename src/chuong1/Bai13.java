package chuong1;

import java.util.Scanner;

public class Bai13 {
    // Viet chuong trinh in ra tong so chan 1 den n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao N:");
        int n = sc.nextInt();
        System.out.println("Tong n so chan dau tien la: " + n*(n+1));
    }
}
