package chuong2.bai6;

public class ThongTinDangKyXe {
    private String chuXe, LoaiXe;
    private int triGiaXe,dungTichXyLanh;
    public ThongTinDangKyXe() {
        this.chuXe = "Khong co ten";
        this.LoaiXe = "Khong co ten";
        this.triGiaXe = 0;
        this.dungTichXyLanh = 0;
    }

    public ThongTinDangKyXe(String tenChu, String loai, int gia, int dungTichXyLanh)
    {
        if (tenChu.equals(""))
            this.chuXe = "Khong co ten";
        else
            this.chuXe = tenChu;
        if (loai.equals(""))
            this.LoaiXe = "Khong co ten";
        else
            this.LoaiXe = loai;
        if (gia < 0)
            this.triGiaXe = 0;
        else
            this.triGiaXe = gia;
        if(dungTichXyLanh < 0)
            this.dungTichXyLanh = 0;
        else
            this.dungTichXyLanh = dungTichXyLanh;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String tenChu) {
        if(tenChu.equals(""))
        {
            System.out.println("Ten nhap khong hop le !!!");
        }
        else
            this.chuXe = tenChu;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        if (loaiXe.equals(""))
            System.out.println("Ten loai xe khong hop le !!!");
        else
            this.LoaiXe = loaiXe;
    }

    public int getTriGiaXe() {
        return triGiaXe;
    }

    public void setTriGiaXe(int triGiaXe) {
        if (triGiaXe < 0)
            System.out.println("Gia tri xe khong hop le !!!");
        else
            this.triGiaXe = triGiaXe;
    }

    public int getDungTichXyLanh() {
        return dungTichXyLanh;
    }

    public void setDungTichXyLanh(int dungTichXyLanh) {
        if (dungTichXyLanh < 0)
            System.out.println("DUng tich xy lanh khong hop le !!!");
        else
            this.dungTichXyLanh = dungTichXyLanh;
    }

    public double getThue()
    {
        if (dungTichXyLanh > 200)
            return 0.05 * triGiaXe;
        else
            if (dungTichXyLanh > 100)
                return 0.03 * triGiaXe;
            else
                return 0.01 * triGiaXe;
    }
    public String toString()
    {
        return String.format("%-20s %-20s %13d %12d %12.1f",chuXe,LoaiXe,triGiaXe,dungTichXyLanh, this.getThue());
    }
}
