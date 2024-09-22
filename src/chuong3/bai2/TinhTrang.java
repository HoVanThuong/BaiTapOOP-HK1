package chuong3.bai2;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public enum TinhTrang {
    Moi, Cu;
    public static TinhTrang inputTinhTrang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Tinh Trang( Moi / Cu ):");
        String tinhTrang = sc.nextLine();
        tinhTrang = tinhTrang.toUpperCase();
        switch (tinhTrang) {
            case "MOI" ->{
                return Moi;
            }
            case "CU" ->{
                return Cu;
            }
            default ->{
                throw new IllegalArgumentException("Tinh Trang Chi Co The La \"Cu\" Hoac \"Moi\"");
            }
        }
    }
}
