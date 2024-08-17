package chuong1;

import java.util.Scanner;

public class Bai9 {
    /// Viet ham tach chuoi goc thanh chuoi con
    public static void tachChuoi(String str, String temp[])
    {
        String cmp = "";
        int idex = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if(cmp.length() > 0)
            {
                if (str.charAt(i) == ' ')
                {
                    temp[idex] = cmp;
                    cmp = "";
                    idex++;
                }
            }
            if (str.charAt(i) != ' ') {
                cmp += str.charAt(i);
            }
        }
        temp[idex]  = cmp;
    }
    public static int getLength(String temp[])
    {
        int soLuong =  0;
        while(temp[soLuong] != null)
        {
            soLuong++;
        }
        return soLuong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi:");
        String str = sc.nextLine();
        str = str.trim();
        String temp[] = new String[100];
        tachChuoi(str, temp);
        int soLuong = getLength(temp);
        for (int i = 0; i < soLuong; i++)
        {
            System.out.println("Tu thu " + (i + 1) +":" + temp[i]);
        }
        // Dung ham co san cua JAVA cho nhanh
        // Method split()
        String temp2[] = str.split(" ");// No khong dung duoc trong truong hop co nhieu dau cach khong xac dinh duoc so luong
        for (int i = 0; i < temp2.length; i++)
        {
            System.out.println("Tu thu " + (i + 1) +":" + temp2[i]);
        }

    }
}
