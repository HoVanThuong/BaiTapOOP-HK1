package chuong2.bai5;

public class MainTest5 {
    public static void main(String[] args) {
        // Tam giac khong co constructor
        TamGiac tg1 = new TamGiac();
        // Khoi tao co constructor nhung sai gia tri
        TamGiac tg2 = new TamGiac(-1,-1,-1);
        // Khoi tao co constructor dung gia tri
        TamGiac tg3 = new TamGiac(3,4,5);
        // Tam giac deu
        TamGiac tg4 = new TamGiac(4,4,4);
        // Tam giac can
        TamGiac tg5 = new TamGiac(5,2,5);
        // Tam giac thuong
        TamGiac tg6 = new TamGiac(6,2,3);
        tg3.setCanh1(8);
        tg1.setCanh1(7);
        tg1.setCanh2(6);
        tg1.setCanh3(5);
        tg1 = new TamGiac(4,5,6);
        System.out.println(String.format("%-10s %-10s %-10s %-20s %-10s %-10s","canh1","canh2","canh3","Loai","ChuVi","DienTich"));
        System.out.println(tg1.toString());
        System.out.println(tg2.toString());
        System.out.println(tg3.toString());
        System.out.println(tg4.toString());
        System.out.println(tg5.toString());
        System.out.println(tg6.toString());
    }
}
