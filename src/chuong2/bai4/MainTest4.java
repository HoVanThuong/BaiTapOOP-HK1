package chuong2.bai4;

import java.util.Scanner;

public class MainTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Mot sinh vien tao bang constructor day du
        DiemSinhVien sv1 = new DiemSinhVien(23661861, "Ho Van Thuong",10.0f, 10.0f);
        // Tao sinh vien bang default constructor
        DiemSinhVien sv2 = new DiemSinhVien();
        // Tap sinh vien bang getter va setter
        DiemSinhVien sv3 = new DiemSinhVien();
        sv3.setMaSinhVien(238182);
        sv3.setTenSinhVien("Cau Be Chich Choe");
        sv3.setDiemLyThuyet(3.9f);
        sv3.setDiemThucHanh(2.3f);
        // Tao sinh vien bang cach nhap tu ban phim
        DiemSinhVien sv4 = new DiemSinhVien();
        System.out.println("Nhap ma sinh vien:");
        sv4.setMaSinhVien(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten cua sinh vien:");
        sv4.setTenSinhVien(sc.nextLine());
        System.out.println("Nhap diem ly thuyet:");
        sv4.setDiemLyThuyet(sc.nextDouble());
        System.out.println("Nhap diem thuc hanh:");
        sv4.setDiemThucHanh(sc.nextDouble());
        System.out.println(String.format("%-10s %-30s %-10s %-10s %-10s","MSSV","HoTenSV","DiemLT","DiemTH","DiemTB"));
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
        System.out.println(sv4.toString());
        sc.close();


    }
}
