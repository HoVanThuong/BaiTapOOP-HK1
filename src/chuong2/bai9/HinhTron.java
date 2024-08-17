package chuong2.bai9;

public class HinhTron extends ToaDo{
    private double banKinh;

    public HinhTron ()
    {

    }

    public HinhTron(String ten, float x, float y, double banKinh)
    {
        super(ten, x, y);
        this.banKinh = banKinh;
    }

    public ToaDo getTam()
    {
        ToaDo temp = new ToaDo(this.getTen(), this.getX(), this.getY());
        return temp;
    }

    public double getBanKinh()
    {
        return this.banKinh;
    }

    public void setBanKinh(double banKinh)
    {
        this.banKinh = banKinh;
    }

    public void setTam(ToaDo tam)
    {
        this.setX(tam.getX());
        this.setY(tam.getY());
    }

    public double tinhDienTich()
    {
        return  Math.PI * Math.pow(this.banKinh, 2);
    }

    public double tinhChuVi()
    {
        return 2 * Math.PI * this.banKinh;
    }

    public String toString ()
    {
        return String.format("%s (%.0f,%.0f), Dien tich: %.2f Chuvi:%.2f",this.getTen(),this.getX(),this.getY(),this.tinhDienTich(),this.tinhChuVi());
    }

}
