/*
 * @ Ho Van Thuong.java    1.0 21
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong3.bai3;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 21/09/2024
 * @version: 1.0
 */

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.time.LocalDate;

public class LopKiemNghiem {
    public static void main(String[] args) {
        GiaoDich gd1 = new GiaoDichVang("001", LocalDate.of(2023,8,9), 5001.98, 102, "VangNguyenChat");
        GiaoDich gd2 = new GiaoDichVang("002", LocalDate.of(2023,8,9), 60000000, 102, "VangKhoi");
        GiaoDich gd3 = new GiaoDichVang("003", LocalDate.of(2023,8,9), 0, 102, "VangMa");
        GiaoDich gd4 = new GiaoDichTienTe("004",LocalDate.of(2002,4,3),20000000,99,0.3,LoaiTien.VND);
        GiaoDich gd5 = new GiaoDichTienTe("005",LocalDate.of(2002,4,3),1000000000,99,0.3,LoaiTien.USD);
        GiaoDich gd6 = new GiaoDichTienTe("006",LocalDate.of(2002,4,3),50000000,99,0.3,LoaiTien.VND);
        GiaoDich gd7 = new GiaoDichTienTe("007",LocalDate.of(2002,4,3),98000,99,0.3,LoaiTien.EURO);
        GiaoDich gd8 = new GiaoDichTienTe("008",LocalDate.of(2002,4,3),700021000,99,0.3,LoaiTien.USD);
        NganHang nganHang = new NganHang(5);
        nganHang.themGiaoDich(gd1);
        nganHang.themGiaoDich(gd2);
        nganHang.themGiaoDich(gd3);
        nganHang.themGiaoDich(gd4);
        nganHang.themGiaoDich(gd5);
        nganHang.themGiaoDich(gd6);
        nganHang.themGiaoDich(gd7);
        nganHang.themGiaoDich(gd8);
        space();
        System.out.println("Danh sach giao dich:");
        nganHang.xuatGiaoDich();
        space();
        nganHang.tongSoLuongGDTungLoai();
        space();
        System.out.println("Trung binh thanh tien cua giao dich tien te:");
        System.out.println(nganHang.trungBinhThanhTienGDTienTe());
        space();
        System.out.println("Giao dich tren 1 ty:");
        for(GiaoDich gd : nganHang.xuatGiaoDichTren1Ty())
        {
            System.out.println(gd);
        }
        space();
        // Test thu enum
        LoaiTien test = LoaiTien.importEnum("VN");
        System.out.println(test);
        space();
    }


    public static void space()
    {
        String temp = "----------";
        for(int i = 0 ; i < 10; i++)
        {
            System.out.print(temp);
        }
        System.out.println();
    }
}
