/*
 * @ Ho Van Thuong.java    1.0 24
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong2.bai12;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 24/08/2024
 * @version: 1.0
 */

import java.util.Scanner;

public class MainTest12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        System.out.println("Nhap so luong dia CD toi da:");
        max = sc.nextInt();
        CDList cdList = new CDList(max);
        int choice;
        do{
            menu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                {
                    int maCD;
                    String tenCD;
                    int soBaiHat;
                    float giaThanh;
                    System.out.println("Nhap ma CD:");
                    maCD = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap ten CD:");
                    tenCD = sc.nextLine();
                    System.out.println("Nhap so bai Hat:");
                    soBaiHat = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap gia Thanh:");
                    giaThanh = sc.nextFloat();
                    sc.nextLine();
                    CD temp = new CD(maCD,tenCD,soBaiHat,giaThanh);
                    if (cdList.addCD(temp)) {
                        System.out.println("Da them CD vao danh sach");
                    }
                    else {
                        System.out.println("Them that bai!! Hay kiem tra lai !!");
                    }
                }break;
                case 2:
                {
                    int maCD;
                    System.out.println("Nhap ma CD can xoa:");
                    maCD = sc.nextInt();
                    if (cdList.delCDByID(maCD)) {
                        System.out.println("Da xoa thanh cong CD co ma " + maCD);
                    }
                    else {
                        System.out.println("Xoa that bai!!!");
                    }
                }break;
                case 3:
                {
                    System.out.println("So luong dia CD hien co: " + cdList.getCount());
                }break;
                case 4:
                {
                    System.out.printf("Tong gia thanh cua tat ca dia CD: %.3f\n", cdList.tongGia());
                }break;
                case 5:
                {
                    int maCD;
                    System.out.println("Nhap ma CD can tim:");
                    maCD = sc.nextInt();
                    CDList temp = cdList;
                    temp.setCdList(cdList.findByID(maCD));
                    if (temp.getCDList() != null)
                    {
                        System.out.println(String.format("%10s %10s %10s %10s","MaCD","TenCD","SoBaiHat","GiaThanh"));
                        System.out.println(temp.toString());
                    }
                    else {
                        System.out.println("Khong tim thay");
                    }
                }break;
                case 6:
                {
                    CD temp[] = cdList.sortByPrice();
                    cdList.setCdList(temp);
                    System.out.println("Da sap xep theo gia");
                    System.out.println(String.format("%10s %10s %10s %10s","MaCD","TenCD","SoBaiHat","GiaThanh"));
                    System.out.println(cdList.toString());
                }break;
                case 7:
                {
                    CD temp[] = cdList.sortByTenCD();
                    cdList.setCdList(temp);
                    System.out.println("Da sap xep theo ten CD");
                    System.out.println(String.format("%10s %10s %10s %10s","MaCD","TenCD","SoBaiHat","GiaThanh"));
                    System.out.println(cdList.toString());
                }break;
                case 8:
                {
                    System.out.println(String.format("%10s %10s %10s %10s","MaCD","TenCD","SoBaiHat","GiaThanh"));
                    System.out.println(cdList.toString());
                }break;
            }
        }while(choice > 0 && choice < 9);
        System.out.println("CAM ON BAN DA SU DUNG <3");
        sc.close();
    }

    public static void menu()
    {
        System.out.println("=====MENU=====");
        System.out.println("1. Them CD");
        System.out.println("2. Xoa CD theo Ma CD");
        System.out.println("3. Tinh so luong CD");
        System.out.println("4. Tinh tong gia thanh");
        System.out.println("5. Tim kiem theo Ma CD");
        System.out.println("6. Sap xep theo gia");
        System.out.println("7. Sap xep theo ten CD");
        System.out.println("8. In danh sach CD");
        System.out.println("0. Thoat khoi menu");
        System.out.println("==============");
        System.out.print("Lua chon cua ban:");
    }

}
