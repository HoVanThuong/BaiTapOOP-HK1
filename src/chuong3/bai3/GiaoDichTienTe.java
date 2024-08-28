/*
 * @ Ho Van Thuong.java    1.0 21
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong3.bai3;


import java.time.LocalDate;

/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 21/09/2024
 * @version: 1.0
 */
enum LoaiTien{VND, USD, EURO, NULL;
    public static LoaiTien importEnum(String input){
        input = input.toUpperCase();
        switch (input){
            case "VND" ->{return VND;}
            case "USD" ->{return USD;}
            case "EURO" ->{return EURO;}
            default ->{return NULL;}
        }
    }
};
public class GiaoDichTienTe extends GiaoDich {
    private double tiGia;
    private LoaiTien loaiTien;

    public GiaoDichTienTe(String maGD, LocalDate ngayGiaoDich, double donGia, int soLuong, double tiGia, LoaiTien loaiTien) {
        super(maGD, ngayGiaoDich, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public LoaiTien getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        if(loaiTien == null || loaiTien.trim().equals(""))
            throw new IllegalArgumentException("Loai tien sai bet");
        this.loaiTien = LoaiTien.importEnum(loaiTien);
    }

    @Override
    public double thanhTien() {
        if (loaiTien == LoaiTien.VND)
        {
            return soLuong * donGia;
        }
        else
            return soLuong * tiGia * donGia;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%10f %10s",tiGia, loaiTien);
    }
}
