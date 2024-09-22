/*
 * @ Ho Van Thuong.java    1.0 21
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong3.bai2;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 21/09/2024
 * @version: 1.0
 */

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class LopKiemNghiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThuVien thuVien = new ThuVien(5);
        khoiTaoDuLieu(thuVien);
        int choice = -1;
        do{
            menu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 ->
                {
                    thuVien.xuatSach();
                    space();
                }
                case 2 ->
                {

                    System.out.println("LOAI SACH MUON THEM:");
                    System.out.println("1. Sach Giao Khoa");
                    System.out.println("2. Sach Tham Khao");
                    System.out.println("Ban Them Loai Nao: ");
                    int loai = sc.nextInt();
                    boolean check;
                    switch (loai) {
                        case 1 ->
                        {
                            Sach sachMoi = new SachGiaoKhoa();
                            nhapSach(sachMoi);
                            ((SachGiaoKhoa)sachMoi).setTinhTrang(TinhTrang.inputTinhTrang());
                            check = thuVien.themSach(sachMoi);
                        }
                        case 2 ->
                        {
                            Sach sachMoi = new SachThamKhao();
                            nhapSach(sachMoi);
                            System.out.println("Nhap Thue:");
                            ((SachThamKhao)sachMoi).setThue(sc.nextDouble());
                            check = thuVien.themSach(sachMoi);
                        }
                        default -> check = false;
                    }
                    if(check)
                    {
                        System.out.println("Them Thanh Cong !!!");
                    }
                    else {
                        System.out.println("Them That Bai");
                    }
                    space();
                }
                case 3 ->
                {
                    System.out.println("Nhap Nha Xuat Ban Muon Tim Kiem:");
                    String nxb = sc.nextLine();
                    for(Sach s : thuVien.sachNhaXuatBanK(nxb))
                    {
                        System.out.println(s);
                    }
                    space();
                }
                case 4 ->
                {
                    thuVien.thanhTienCaoNhat();
                    space();
                }
            }
        }
        while(choice < 5 && choice > 0);
        System.out.println("Cam On Ban Da Su Dung !!!!");
    }
    public static void khoiTaoDuLieu(ThuVien thuVien) {
        Sach s1 = new SachThamKhao("ConHeo1", LocalDate.of(2023,2,1),50000,102,"Kim Lan1",2000);
        Sach s2 = new SachGiaoKhoa("ConHeo2", LocalDate.of(2023,4,3),40000,102,"Kim Lan",TinhTrang.Moi);
        Sach s3 = new SachThamKhao("ConHeo3", LocalDate.of(2023,6,3),20000,102,"Kim Lan2",2000);
        Sach s4 = new SachGiaoKhoa("ConHeo4", LocalDate.of(2023,7,3),60000,102,"Kim Lan",TinhTrang.Moi);
        Sach s5 = new SachThamKhao("ConHeo5", LocalDate.of(2023,9,3),80000,102,"Kim Lan",2000);
        Sach s6 = new SachGiaoKhoa("ConHeo6", LocalDate.of(2023,11,3),10000,102,"Kim Lan",TinhTrang.Cu);
        Sach s7 = new SachThamKhao("ConHeo7", LocalDate.of(2023,4,3),90000,102,"Kim Lan1",2000);
        thuVien.themSach(s1);
        thuVien.themSach(s2);
        thuVien.themSach(s3);
        thuVien.themSach(s4);
        thuVien.themSach(s5);
        thuVien.themSach(s6);
        thuVien.themSach(s7);
    }

    public static void menu()
    {
        System.out.println("1. Xuat Sach");
        System.out.println("2. Them Sach");
        System.out.println("3. Tim Sach Theo Nha Xuat Ban");
        System.out.println("4. Thanh Tien Cao Nhat");
        System.out.println("0. Thoat MENU");
        System.out.print("Lua chon cua ban la:");
    }


    public static void nhapSach(Sach sachMoi)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma Sach:");
        sachMoi.setMaSach(sc.nextLine());
        System.out.println("Nhap Ngay Nhap (dd/MM/yyyy):");
        sachMoi.setNgayNhap(sc.nextLine());
        System.out.println("Nhap Don Dia:");
        sachMoi.setDonGia(sc.nextDouble());
        System.out.println("Nhap So Duong:");
        sachMoi.setSoLuong(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap Ten Nha Xuat Ban:");
        sachMoi.setNxb(sc.nextLine());
    }
    public static void space()
    {
        String temp = "----------";
        for(int i = 0 ; i < 10; i++)
        {
            System.out.print(temp);
        }
        System.out.println();
    }

}
