/*
 * @ Ho Van Thuong.java    1.0 24
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong2.bai13;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 24/08/2024
 * @version: 1.0
 */

import java.util.Scanner;

public class MainTest13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int max;
        System.out.println("Nhap so cong nhan toi da:");
        max = sc.nextInt();
        sc.nextLine();
        DanhSachCongNhan danhSach = new DanhSachCongNhan(max);
        do{
            menu();
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                {
                    String ho, ten;
                    int ma, soSP;
                    System.out.println("Nhap ma cong nhan:");
                    ma = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap ho:");
                    ho = sc.nextLine();
                    System.out.println("Nhap ten:");
                    ten = sc.nextLine();
                    System.out.println("Nhap so SP:");
                    soSP = sc.nextInt();
                    CongNhan temp = new CongNhan(ma, ho, ten, soSP);
                    if (danhSach.addCongNhan(temp)) {
                        System.out.println("Them thanh cong");
                    }
                    else {
                        System.out.println("Them that bai");
                    }
                }break;
                case 2:
                {
                    int ma;
                    System.out.println("Nhap ma cong nhan muon xoa:");
                    ma = sc.nextInt();
                    if (danhSach.delByMa(ma))
                    {
                        System.out.println("Xoa thanh cong");
                    }
                    else {
                        System.out.println("Xoa that bai");
                    }
                }break;
                case 3:
                {
                    System.out.println(String.format("%-10s %-10s %-10s %10s", "MA", "HO", "TEN", "SOSP"));
                    System.out.println(danhSach.toString());
                }break;
                case 4:
                {
                   CongNhan[] temp = new CongNhan[danhSach.getCount()];
                   temp = danhSach.congNhanTren200();
                   if (temp == null)
                   {
                       System.out.println("Khong tim thay");
                   }
                   else {
                       System.out.println(String.format("%-10s %-10s %-10s %10s", "MA", "HO", "TEN", "SOSP"));
                       for (CongNhan c : temp)
                       {
                           if (c != null)
                           {
                               System.out.println(c.toString());
                           }
                       }
                   }
                }break;
                case 5:
                {
                    danhSach.setDanhSach(danhSach.sortBySoSP());
                    System.out.println("Da sap xep:");
                    System.out.println(String.format("%-10s %-10s %-10s %10s", "MA", "HO", "TEN", "SOSP"));
                    System.out.println(danhSach.toString());
                }break;
            }
        }while(choice >0 && choice < 6);
        System.out.println("Cam on ban da su dung <3");
        sc.close();
    }

    public static void menu()
    {
        System.out.println("=====MENU====");
        System.out.println("1. Them cong nhan");
        System.out.println("2. Xoa cong nhan theo ma");
        System.out.println("3. In danh sach cong nhan");
        System.out.println("4. Danh sach cong nhan co san pham >= 200 ");
        System.out.println("5. Sap xep cong nhan");
        System.out.println("0. Thoat menu");
        System.out.print("Lua chon cua ban:");
    }


}
