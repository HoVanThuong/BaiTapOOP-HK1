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

public class SachThamKhao extends Sach{
    private double thue;


    public SachThamKhao() {
        this("MaXXX",LocalDate.now(),0,0,"KhongBiet",0);
    }

    public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nxb, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nxb);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        if(thue <  0)
            throw new IllegalArgumentException("Thue sai bet");
        this.thue = thue;
    }

    @Override
    public double thanhTien() {
        return (soLuong * donGia) + (thue * soLuong);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%.2f", thue);
    }

}
