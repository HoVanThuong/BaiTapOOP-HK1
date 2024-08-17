package chuong1;

import java.util.Scanner;


public class Bai7 {
    public static boolean checkSNT(int a)
    {
        if (a == 1 || a == 0)
            return false;
        for (int i = 2; i <= Math.sqrt(a); i++)
        {
            if (a % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i < n; i++)
        {
            if (checkSNT(i))
            {
                sum += i;
            }
        }
        System.out.println("Tong cac so nguyen to tu den N la: " + sum);
    }
}
