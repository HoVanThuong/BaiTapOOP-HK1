package chuong2.bai3;

public class Cilender {
    private double banKinh, chieuCao;

    public Cilender(double banKinh, double chieuCao) {
        this.banKinh = banKinh;
        this.chieuCao = chieuCao;
    }

    public double tinhDienTichXungQuanh()
    {
        return 2 * Math.PI * banKinh * chieuCao;
    }

    public double tinhDienTichToanPhan()
    {
        return 2 * Math.PI * banKinh * chieuCao + 2 * Math.PI * Math.pow(banKinh,2);
    }

    public double tinhTheTich()
    {
        return Math.PI * Math.pow(banKinh,2) * chieuCao;
    }

}
