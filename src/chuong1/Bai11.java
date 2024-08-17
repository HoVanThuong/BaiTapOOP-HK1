package chuong1;

import java.util.Scanner;

public class Bai11 {
    public  static  int fibonaci(int n)
    {
        if (n <= 1)
            return n;
        return fibonaci(n-1) + fibonaci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so N:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.printf("%d ",fibonaci(i));
        }
    }
}
