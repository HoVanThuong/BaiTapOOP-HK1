package chuong1;

import java.util.Scanner;

public class Bai16 {
    // Tim chuoi trong mang chuoi

    public static boolean timChuoi(String a[], int n, String str)
    {
        for (int i = 0; i < n; i++)
        {
            if (a[i].equals(str))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua mang:");
        int n = sc.nextInt();
        sc.nextLine();
        String a[] = new String[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhap chuoi thu " +(i + 1) + ":");
            a[i] = sc.nextLine();
        }
        System.out.println("Nhap chuoi muon tim kiem:");
        String k = sc.nextLine();
        System.out.println("Gia tri tim kiem la: " + timChuoi(a, n, k));
    }
}
