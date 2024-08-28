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
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class KhoaHoc {
    private String tenKhoaHoc;
    private LocalDate ngayMo;
    private int thoiGianHoc;
    private HocVien danhSachHocVien[];
    private int count = 0;

    public KhoaHoc (String tenKhoaHoc, LocalDate ngayMo, int thoiGianHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
        this.ngayMo = ngayMo;
        this.thoiGianHoc = thoiGianHoc;
        this.danhSachHocVien = new HocVien[20];
    }

    public void themHocVien(HocVien hocVien) {
        danhSachHocVien[count++] = hocVien;
    }

    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
    }

    public LocalDate getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(LocalDate ngayMo) {
        this.ngayMo = ngayMo;
    }

    public int getThoiGianHoc() {
        return thoiGianHoc;
    }

    public void setThoiGianHoc(int thoiGianHoc) {
        this.thoiGianHoc = thoiGianHoc;
    }

    public HocVien[] getDanhSachHocVien() {
        return danhSachHocVien;
    }

    public void setDanhSachHocVien(HocVien[] danhSachHocVien) {
        this.danhSachHocVien = danhSachHocVien;
    }

    public boolean timHocVien(HocVien hocVien) {
        for (HocVien h : danhSachHocVien) {
            if (h != null && h == hocVien) {
                return true;
            }
        }
        return false;
    }

    public String thongTinKhoaHoc()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-20s%15s%18d%10d",tenKhoaHoc,dtf.format(ngayMo),thoiGianHoc,count);
    }
}
