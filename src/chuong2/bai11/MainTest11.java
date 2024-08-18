/*
 * @ Ho Van Thuong.java    1.0 22
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong2.bai11;


/*
 * @description:
 * @author:
 * @date: 22/08/2024
 * @version: 1.0
 */

import java.time.LocalDate;

public class MainTest11 {
    public static void main(String[] args) {
        KhachHang khachHang = new KhachHang("0001","Ho Van Thuong", 10);
        // Mo 3 so tiet kiem cho khach hang
          LocalDate date = LocalDate.of(2024,2,16);
          khachHang.themSoTiemKiem("001",date, 1000000f, 3, 0.005f);
//        SoTietKiem so1 = new SoTietKiem("001",date, 1000000f, 3, 0.005f);

          date = LocalDate.of(2024,6,2);
          khachHang.themSoTiemKiem("002",date, 10000000f, 6, 0.002f);
//        SoTietKiem so2 = new SoTietKiem("002",date, 10000000f, 6, 0.002f);
          date = LocalDate.of(2023,1,1);
          khachHang.themSoTiemKiem("003",date, 100000000f, 9, 0.05f);
//        SoTietKiem so3 = new SoTietKiem("003",date, 100000000f, 9, 0.05f);

        System.out.println(khachHang.toString());
        for(SoTietKiem so : khachHang.getDsSoTietKiem())
        {
            if (so != null)
            {
                System.out.println(so.toString());
            }
        }
    }
}
