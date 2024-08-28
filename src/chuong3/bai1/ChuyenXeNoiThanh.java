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

public class ChuyenXeNoiThanh extends ChuyenXe{
    private int soTuyen;
    private int soKm;

    public ChuyenXeNoiThanh(String maSoXe, String hoTenTaiXe, String maSoChuyen, double doanhThu, int soKm, int soTuyen) {
        super(maSoXe, hoTenTaiXe, maSoChuyen, doanhThu);
        this.soKm = soKm;
        this.soTuyen = soTuyen;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        if (soTuyen< 0) {
            throw new IllegalArgumentException("So tuyen khong hop le");
        }
        this.soTuyen = soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        if (soKm < 0) {
            throw new IllegalArgumentException("So Km khong hop le");
        }
        this.soKm = soKm;
    }

    @Override
    public String toString() {
        return String.format("%20s %20s %20s %10f %20d %20d", maSoXe, hoTenTaiXe, maSoChuyen, doanhThu, soKm, soTuyen);
    }
}
