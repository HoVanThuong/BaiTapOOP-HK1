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

import java.time.LocalDate;

public class LopKiemNghiem {
    public static void main(String[] args) {
        Sach s1 = new SachThamKhao("ConHeo1", LocalDate.of(2023,2,1),50000,102,"Kim Lan1",2000);
        Sach s2 = new SachGiaoKhoa("ConHeo2", LocalDate.of(2023,4,3),40000,102,"Kim Lan",TinhTrang.Moi);
        Sach s3 = new SachThamKhao("ConHeo3", LocalDate.of(2023,6,3),20000,102,"Kim Lan2",2000);
        Sach s4 = new SachGiaoKhoa("ConHeo4", LocalDate.of(2023,7,3),60000,102,"Kim Lan",TinhTrang.Moi);
        Sach s5 = new SachThamKhao("ConHeo5", LocalDate.of(2023,9,3),80000,102,"Kim Lan",2000);
        Sach s6 = new SachGiaoKhoa("ConHeo6", LocalDate.of(2023,11,3),10000,102,"Kim Lan",TinhTrang.Cu);
        Sach s7 = new SachThamKhao("ConHeo7", LocalDate.of(2023,4,3),90000,102,"Kim Lan1",2000);
        ThuVien thuVien = new ThuVien(5);
        thuVien.themSach(s1);
        thuVien.themSach(s2);
        thuVien.themSach(s3);
        thuVien.themSach(s4);
        thuVien.themSach(s5);
        thuVien.themSach(s6);
        thuVien.themSach(s7);
        thuVien.xuatSach();
        System.out.println("___________________");
        Sach[] temp = thuVien.sachNhaXuatBanK("Kim Lan");
        for (Sach sach : temp) {
            System.out.println(sach);
        }

        System.out.println("___________________");
        thuVien.thanhTienCaoNhat();
    }
}
