package chuong2.bai5;

public class TamGiac {
    private int canh1, canh2, canh3;
    public TamGiac() {
        this.canh1 = 0;
        this.canh2 = 0;
        this.canh3 = 0;
    }

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        if (canh1 < 0 || (canh1 + this.canh2 < this.canh3 || canh1 + this.canh3 < this.canh2) || this.canh2 + this.canh3 < canh1)
            canh1 = canh1;
        else
            this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        if (canh2 < 0 || (canh2 + this.canh1 < this.canh3 || canh2 + this.canh3 < this.canh1) || this.canh1 + this.canh3 < canh2)
            this.canh2 = this.canh2;
        else
            this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        if (canh3 < 0 || (canh3 + this.canh2 < this.canh1 || canh3 + this.canh1 < this.canh2) || this.canh2 + this.canh1 < canh3)
            this.canh3 = this.canh3;
        else
            this.canh3 = canh3;
    }

    public TamGiac(int canh1, int canh2, int canh3) {
        if ((canh1 < 0 || canh2 < 0 || canh3 < 0) || (canh1 + canh2 < canh3 || canh1 + canh3 < canh2 || canh2 + canh3 < canh1))
        {
            this.canh1 = 0;
            this.canh2 = 0;
            this.canh3 = 0;
        }
        else
        {
            this.canh1 = canh1;
            this.canh2 = canh2;
            this.canh3 = canh3;
        }
    }
    public double tinhChuVi()
    {
        if (canh1 == 0 || canh2 == 0 || canh3 == 0) return 0;
        return this.canh1 + this.canh2 + this.canh3;
    }

    public double tinhDienTich()
    {
        if (canh1 == 0 || canh2 == 0 || canh3 == 0) return 0;
        double p = this.tinhChuVi() / 2;
        return Math.sqrt(p*(p - canh1) * (p - canh2) * (p - canh3));
    }

    public String thongTinTamGiac()
    {
        if (canh1 == 0 || canh2 == 0 || canh3 == 0) return "Khong phai tam giac";
        if (canh1 == canh2 && canh2 == canh3)
            return "Tam giac deu";
        if (canh1 == canh2 || canh1 == canh3 || canh2 == canh3)
            return "Tam giac can";
        if (canh1 + canh2 > canh3 || canh1 + canh3 > canh2 || canh3 + canh2 > canh1)
            return "Tam giac thuong";
        return "Khong phai tam giac";
    }

    public String toString()
    {
        return String.format("%5d %10d %10d    %-20s %7.2f %10.2f",canh1, canh2, canh3,this.thongTinTamGiac(),this.tinhChuVi(),this.tinhDienTich());
    }
}
