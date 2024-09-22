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
public class SachGiaoKhoa extends Sach{
    private TinhTrang tinhTrang;


    public SachGiaoKhoa() {
        this("MaXXX",LocalDate.now(),0,0,"KhongBiet",TinhTrang.Moi);
    }

    public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nxb, TinhTrang tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nxb);
        this.tinhTrang = tinhTrang;
    }

    public TinhTrang getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(TinhTrang tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double thanhTien() {
        float rate;
        if(tinhTrang == TinhTrang.Moi)
        {
            rate = 1f;
        }
        else {
            rate = 0.5f;
        }
        return rate * soLuong * donGia;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%20s", tinhTrang);
    }
}
