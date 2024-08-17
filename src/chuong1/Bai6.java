package chuong1;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n:");
        int n = sc.nextInt();
        boolean flag = true;
        if (n == 1 || n ==  0)
        {
            System.out.println("N khong phai la so nguyen to");
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++)
            {
                if (n % i == 0) {
                    System.out.println("N khong phai la so nguyen to ");
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
        {
            System.out.println("N la so nguyen to");
        }
    }
}
