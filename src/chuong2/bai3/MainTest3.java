package chuong2.bai3;

public class MainTest3 {
    public static void main(String[] args) {
        Cilender a = new Cilender(5, 6);
        Cilender b = new Cilender(4, 1);
        Cilender c = new Cilender(2, 8);
        System.out.printf("Dien tich xung quanh cua a la :%.3f\n", a.tinhDienTichXungQuanh());
        System.out.printf("Dien tich toan phan cau b la: %.3f\n", b.tinhDienTichToanPhan());
        System.out.printf("The tich cua c la: %.3f\n",c.tinhTheTich());
    }
}
