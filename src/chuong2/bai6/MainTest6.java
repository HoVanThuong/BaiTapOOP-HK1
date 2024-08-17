package chuong2.bai6;

import java.util.Scanner;

public class MainTest6 {
    public static void main(String[] args) {
        // Xe constructor default
        ThongTinDangKyXe xe1 = new ThongTinDangKyXe();
        // Xe constructor chinh xac
        ThongTinDangKyXe xe2 = new ThongTinDangKyXe("Ho Van Thuong","Wave",15000000,100);
        // Xe constructor nhung sai
        ThongTinDangKyXe xe3 = new ThongTinDangKyXe("", "",-1000,-10);
        // Cho nguoi dung nhap choi choi
        Scanner sc = new Scanner(System.in);
        ThongTinDangKyXe xe4 = new ThongTinDangKyXe();
        System.out.println("Nhap ten chu xe:");
        xe4.setChuXe(sc.nextLine());
        System.out.println("Nhap ten loai xe:");
        xe4.setLoaiXe(sc.nextLine());
        System.out.println("Nhap gia tri cua xe:");
        xe4.setTriGiaXe(sc.nextInt());
        System.out.println("Nhap dung tich xy lanh cua xe:");
        xe4.setDungTichXyLanh(sc.nextInt());
        // Thu set lai gia tri sai cua xe dung
        xe2.setChuXe("");
        // Sua ten xe 3 lai cho hop le
        xe3.setChuXe("Kha Banh Bao");
        // In ra //
        System.out.printf("%-20s %-27s %-10s %-16s %-10s\n","TenChu","TenXe","GiaTri","DTXyLanh","Thue");
        for (int i = 1; i <= 81;i++)
        {
            System.out.print("=");
        }
        System.out.println();
        System.out.println(xe1.toString());
        System.out.println(xe2.toString());
        System.out.println(xe3.toString());
        System.out.println(xe4.toString());

    }
}
