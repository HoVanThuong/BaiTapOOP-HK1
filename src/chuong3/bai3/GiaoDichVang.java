/*
 * @ Ho Van Thuong.java    1.0 21
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong3.bai3;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 21/09/2024
 * @version: 1.0
 */

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich{
    private String loaiVang; // chua hieu lam :-)))

    public GiaoDichVang(String maGD, LocalDate ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
        super(maGD, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        if (loaiVang == null || loaiVang.trim().equals("")) {
            throw new IllegalArgumentException("Loai vang khong duoc rong");
        }
        this.loaiVang = loaiVang;
    }

    @Override
    public double thanhTien() {
        return soLuong * donGia;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %20s", loaiVang);
    }
}
