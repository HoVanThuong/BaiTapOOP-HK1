package chuong1;

import java.util.Scanner;

public class Bai15 {
    // Tim lon nhat va nho nhat cua mang
    // De quy
    public static int max(int a[], int n)
    {
        if (n == 1) return a[0];
        return Math.max(a[n-1], max(a, n-1));
    }

    public static int min(int a[], int n)
    {
        if (n == 1) return a[0];
        return Math.min(a[n-1], min(a, n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua mang:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Phan tu thu " + (i + 1) +":");
            a[i] = sc.nextInt();
        }
        System.out.println("Max cua mang la:" + max(a, n));
        System.out.println("Min cua mang la:" + min(a, n));

    }
}
