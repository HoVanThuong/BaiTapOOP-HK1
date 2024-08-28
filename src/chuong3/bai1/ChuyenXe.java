/*
 * @ Ho Van Thuong.java    1.0 21
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong3.bai1;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 21/09/2024
 * @version: 1.0
 */

public abstract class ChuyenXe {
    protected String maSoXe;
    protected String hoTenTaiXe;
    protected String maSoChuyen;
    protected double doanhThu;

    public ChuyenXe(String maSoXe, String hoTenTaiXe, String maSoChuyen, double doanhThu) {
        this.maSoXe = maSoXe;
        this.hoTenTaiXe = hoTenTaiXe;
        this.maSoChuyen = maSoChuyen;
        this.doanhThu = doanhThu;
    }

    public void setMaSoXe(String maSoXe) {
        if (maSoXe == null || maSoXe.trim().equals("")) {
            throw new IllegalArgumentException("Ma so xe khong duoc rong");
        }
        this.maSoXe = maSoXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        if (hoTenTaiXe== null || hoTenTaiXe.trim().equals("")) {
            throw new IllegalArgumentException("Ten tai xe khong duoc rong");
        }
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        if (maSoChuyen == null || maSoChuyen.trim().equals("")) {
            throw new IllegalArgumentException("Ma so chuyen khong duoc rong");
        }
        this.maSoChuyen = maSoChuyen;
    }

    public void setDoanhThu(double doanhThu) {
        if (doanhThu < 0) {
            throw new IllegalArgumentException("Doanh thu khong hop le");
        }
        this.doanhThu = doanhThu;
    }

    public String getMaSoXe() {
        return maSoXe;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public double getDoanhThu() {
        return doanhThu;
    }


    @Override
    public String toString() {
        return String.format("%20s %20s %20s %10f", maSoXe, hoTenTaiXe, maSoChuyen, doanhThu);
    }
}
