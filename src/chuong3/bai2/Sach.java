/*
 * @ Ho Van Thuong.java    1.0 21
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong3.bai2;


import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 21/09/2024
 * @version: 1.0
 */
//Mã sách, ngày nhập, đơn giá, số lượng, nhà xuất bản
public abstract class Sach {
    protected String maSach;
    protected LocalDate ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nxb;

    public Sach()
    {
        this("9999999",LocalDate.now(),0,0,"KhongRo");
    }


    public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nxb) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nxb = nxb;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        if (maSach == null || maSach.trim().equals("")) {
            throw new IllegalArgumentException("Ma sach khong duoc rong");
        }
        this.maSach = maSach;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        if(ngayNhap == null) {
            throw new IllegalArgumentException("Ngay nhap khong hop le");
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngay = LocalDate.parse(ngayNhap, dtf);
        if(ngay.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Ngay nhap khong hop le");
        }
        this.ngayNhap = ngay;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if(donGia < 0)
        {
            throw new IllegalArgumentException("Don gia sai bet");
        }
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if(soLuong < 0)
        {
            throw new IllegalArgumentException("So luong sai bet");
        }
        this.soLuong = soLuong;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        if (nxb == null || nxb.trim().equals("")) {
            throw new IllegalArgumentException("Nha xuat ban khong duoc rong");
        }
        this.nxb = nxb;
    }

    public abstract double thanhTien();

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,##0.## VND");
        return String.format("%-30s %-20s %-20s %10d %30s ",maSach, ngayNhap.format(dtf), df.format(donGia), soLuong, nxb);
    }


}
