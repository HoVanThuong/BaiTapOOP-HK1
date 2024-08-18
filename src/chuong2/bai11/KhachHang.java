package chuong2.bai11;

import java.time.LocalDate;

public class KhachHang {
    private String maKH;
    private String hoTenKH;
    private int soLuongSoTietKiem = 0;
    private SoTietKiem[] dsSoTietKiem;

    public KhachHang(String maKH, String hoTenKH, int soLuongSoTietKiem) {
        this.maKH = maKH;
        this.hoTenKH = hoTenKH;
        this.dsSoTietKiem = new SoTietKiem[soLuongSoTietKiem];
    }

    public String getMaKH() {
        return maKH;
    }

    public String getHoTenKH() {
        return hoTenKH;
    }

    public int getSoLuongSoTietKiem() {
        return soLuongSoTietKiem;
    }

    public SoTietKiem[] getDsSoTietKiem() {
        return dsSoTietKiem;
    }

    public void setHoTenKH(String hoTenKH) {
        this.hoTenKH = hoTenKH;
    }

    public boolean themSoTiemKiem(String maSo, LocalDate date, double soTienGoi, int kiHan, float laiSuat)
    {

        if (soLuongSoTietKiem == this.dsSoTietKiem.length)
        {
            throw new IllegalArgumentException("Danh sach so tiem kiem da day !!!");
        }

        this.dsSoTietKiem[soLuongSoTietKiem++] = new SoTietKiem(maSo, date, soTienGoi, kiHan, laiSuat);
        return true;
    }

    public String toString()
    {
        return "Khach hang: " + maKH + " - " + hoTenKH;
    }
}
