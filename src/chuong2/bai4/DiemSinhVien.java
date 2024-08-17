package chuong2.bai4;

public class DiemSinhVien {
    private int maSinhVien;
    private String tenSinhVien = "Nguyen Van A";
    private double diemLyThuyet,diemThucHanh;
    public DiemSinhVien(int ma, String ten, double lt, double th) {
        this.maSinhVien = ma;
        this.tenSinhVien = ten;
        this.diemLyThuyet = lt;
        this.diemThucHanh = th;
    }
    public DiemSinhVien() {
        this.maSinhVien = 0;
        this.tenSinhVien = "Khong co ten";
        this.diemLyThuyet = 0f;
        this.diemThucHanh = 0f;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
       if (maSinhVien < 0)
        this.maSinhVien = 0;
       else this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public double getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public void setDiemLyThuyet(double diemLyThuyet) {
        if (diemLyThuyet >= 0 && diemLyThuyet <= 10)
         this.diemLyThuyet = diemLyThuyet;
        else this.diemLyThuyet = 0;
    }

    public double getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(double diemThucHanh) {
        if (diemThucHanh >= 0 && diemThucHanh <= 10)
                this.diemThucHanh = diemThucHanh;
        else this.diemThucHanh = 0;
    }

    public double tinhDiemTrungBinh()
    {
        return (this.diemLyThuyet + this.diemThucHanh) / 2.0;
    }

    public String toString()
    {
        return String.format("%-10s %-20s %5.2f %10.2f %10.2f", maSinhVien, tenSinhVien, diemLyThuyet, diemThucHanh, this.tinhDiemTrungBinh());
    }

}
