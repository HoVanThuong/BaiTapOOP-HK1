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
import java.time.Period;

public class DanhSachKhoaHoc {
    private int count = 0;
    private KhoaHoc danhSachKhoaHoc[];


    public DanhSachKhoaHoc(int n) {
        danhSachKhoaHoc = new KhoaHoc[n];
    }

    public void themKhoaHoc(KhoaHoc khoaHoc) {
        danhSachKhoaHoc[count++] = khoaHoc;
    }

    public KhoaHoc[] getDanhSachKhoaHoc() {
        return danhSachKhoaHoc;
    }

    public void setDanhSachKhoaHoc(KhoaHoc[] danhSachKhoaHoc) {
        this.danhSachKhoaHoc = danhSachKhoaHoc;
    }

    public KhoaHoc findKhoaHoc(String tenKhoaHoc) {
        for(int i = 0; i < count; i++) {
            if (danhSachKhoaHoc[i].getTenKhoaHoc().equals(tenKhoaHoc)) {
                return danhSachKhoaHoc[i];
            }
        }
        return null;
    }

    public String timHocVienHocKhoaNao(HocVien hocVien)
    {
        String temp = "";
        for(KhoaHoc khoaHoc : danhSachKhoaHoc)
        {
            if ( khoaHoc != null && khoaHoc.timHocVien(hocVien) )
            {
                temp += khoaHoc.getTenKhoaHoc() + " ";
            }
        }
        return temp;
    }

    public String thongTinCacKhoaHoc()
    {
        String temp= "";
        for(KhoaHoc khoc : danhSachKhoaHoc)
        {
            if (khoc != null){
                temp += khoc.thongTinKhoaHoc();
                Period age = Period.between(khoc.getNgayMo(), LocalDate.now());
                int mounth = age.getMonths();
                if (mounth >= khoc.getThoiGianHoc())
                {
                    temp += String.format("%15s\n","Da Ket Thuc");
                }
                else {
                    temp += String.format("%15s\n","Chua Ket Thuc");
                }
            }
        }
        return String.format("%-20s%15s%18s%10s%15s\n","TenKhoaHoc","NgayMo","ThoiGianHoc","SoHocVien","GhiChu")+
                temp;
    }
}
