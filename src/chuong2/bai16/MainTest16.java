/*
 * @ Ho Van Thuong.java    1.0 28
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong2.bai16;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 28/08/2024
 * @version: 1.0
 */

import java.time.LocalDate;

public class MainTest16 {
    public static void main(String[] args) {
        DanhSachKhoaHoc danhSachKhoaHoc = new DanhSachKhoaHoc(10);
        KhoaHoc kh1 = new KhoaHoc("CTDL", LocalDate.of(2024,2,14),10);
        KhoaHoc kh2 = new KhoaHoc("OOP", LocalDate.of(2024,1,14),2);
        KhoaHoc kh3 = new KhoaHoc("SQL", LocalDate.of(2024,1,14),5);
        HocVien hv = new HocVien("Ho Van Thuong","AN GIANG",1213123);
        for (int i = 1; i < 13; i++)
        {
            kh1.themHocVien(hv);
        }

        for (int i = 1; i < 8; i++)
        {
            kh2.themHocVien(hv);
        }

        for (int i = 1; i < 2; i++)
        {
            kh3.themHocVien(hv);
        }
        danhSachKhoaHoc.themKhoaHoc(kh1);
        danhSachKhoaHoc.themKhoaHoc(kh2);
        danhSachKhoaHoc.themKhoaHoc(kh3);


        System.out.println("Tim khoa hoc CTDL:");
        KhoaHoc temp = danhSachKhoaHoc.findKhoaHoc("CTDL");
        if (temp != null)
        {
            System.out.printf("%-20s%15s%18s%10s\n", "TenKhoaHoc", "NgayMo", "ThoiGianHoc", "SoHocVien");
            System.out.println(temp.thongTinKhoaHoc());
        }
        else {
            System.out.println("Khoa Hoc not found");
        }

        System.out.println("Tim hoc vien tung hoc khoa nao:");
        System.out.println(danhSachKhoaHoc.timHocVienHocKhoaNao(hv));
        //System.out.println(kh1.thongTinKhoaHoc());
        System.out.println(danhSachKhoaHoc.thongTinCacKhoaHoc());


    }
}
