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

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh(String maSoXe, String hoTenTaiXe, String maSoChuyen, double doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSoXe, hoTenTaiXe, maSoChuyen, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        if (noiDen == null || noiDen.trim().equals("")) {
            throw new IllegalArgumentException("Noi den khong duoc rong");
        }
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        if (soNgayDiDuoc < 0) {
            throw new IllegalArgumentException("So ngay khong hop le");
        }
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public String toString() {
        return String.format("%20s %20s %20s %10f %20s %20d", maSoXe, hoTenTaiXe, maSoChuyen, doanhThu, noiDen, soNgayDiDuoc);
    }
}
