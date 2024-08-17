package chuong1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        if (a % 2 == 0)
        {
            for (int i = 1; i <= a; i++) {
                if(i % 2 == 0)  sum += i;
            }
        }
        else{
            for (int i = 1; i <= a; i++) {
                if(i % 2 != 0)  sum += i;
            }
        }
        System.out.println("Tong la: " + sum);
    }
}
