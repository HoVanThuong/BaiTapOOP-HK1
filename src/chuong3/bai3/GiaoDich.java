/*
 * @ Ho Van Thuong.java    1.0 21
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong3.bai3;


import jdk.jshell.spi.ExecutionControl;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 21/09/2024
 * @version: 1.0
 */
//Mã giao dịch, ngày giao dịch, đơn giá, số lượng,
public abstract class GiaoDich {
    protected String maGD;
    protected LocalDate ngayGiaoDich;
    protected double donGia;
    protected int soLuong;

    public GiaoDich(String maGD, LocalDate ngayGiaoDich, double donGia, int soLuong) {
        this.maGD = maGD;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        if(maGD == null || maGD.trim().equals(""))
            throw new IllegalArgumentException("Ma Giao Dich Khong Duoc Rong");
        this.maGD = maGD;
    }

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        if(ngayGiaoDich.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Ngay Giao Khong Hop Le");
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if(donGia < 0)
            throw new IllegalArgumentException("Don Gia Khong Hop Le");
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if(soLuong < 0)
            throw new IllegalArgumentException("So Luong Khong Hop Le");
        this.soLuong = soLuong;
    }

    public abstract double thanhTien();

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,##0.## VND");
        return String.format("%-20s %-20s %20s %8d ", maGD, ngayGiaoDich.format(dtf), df.format(donGia), soLuong);
    }
}
