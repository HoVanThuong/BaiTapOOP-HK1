package chuong2.bai10;

public class SinhVien {
    private String maSV;
    private String tenSV;

    public String toString()
    {
        return String.format("%s   |     %s\n",maSV,tenSV);
    }

    public SinhVien(String maSV, String tenSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }
}
