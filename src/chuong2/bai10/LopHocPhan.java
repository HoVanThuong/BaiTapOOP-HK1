package chuong2.bai10;

import java.util.Arrays;

public class LopHocPhan {
    private String maLHP;
    private String tenLHP;
    private String tenGV;
    private String thongTinLopHoc;
    private SinhVien dsSV[];

    public int getSoLuongSV()
    {
        return dsSV.length;
    }

    @Override
    public String toString() {
        String danhdach = "";
        for (int i = 0; i < getSoLuongSV(); i++)
        {
            danhdach += dsSV[i].toString();
        }
        return String.format("Ma lop hoc phan: %s\n", maLHP) +
                String.format("Ten LHP: %s\n",tenLHP)+
                String.format("Ten GV: %s\n",tenGV)+
                String.format("Thong tin buoi hoc: %s\n",thongTinLopHoc)+
                "Danh sach sinh vien\n" +
                danhdach +
                "Tong so luong sinh vien:" + this.getSoLuongSV();
    }

    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, SinhVien[] dsSV) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTinLopHoc = thongTinLopHoc;
        this.dsSV = dsSV;
    }

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongTinLopHoc() {
        return thongTinLopHoc;
    }

    public void setThongTinLopHoc(String thongTinLopHoc) {
        this.thongTinLopHoc = thongTinLopHoc;
    }

    public SinhVien[] getDsSV() {
        return dsSV;
    }

    public void setDsSV(SinhVien[] dsSV) {
        this.dsSV = dsSV;
    }
}
