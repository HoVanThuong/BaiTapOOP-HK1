/*
 * @ Ho Van Thuong.java    1.0 21
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong3.bai1;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 21/09/2024
 * @version: 1.0
 */

import com.sun.security.jgss.GSSUtil;

public class LopKiemNghiem {
    public static void main(String[] args) {
        ChuyenXe xe1 = new ChuyenXeNoiThanh("123","Ho Van Thuong","001",1000000,100,10 );
        ChuyenXe xe2 = new ChuyenXeNgoaiThanh("124","Ho Van Thuong","001",1000000,"AnGiang",10 );
        ChuyenXe xe3 = new ChuyenXeNoiThanh("155","Ho Van Thuong","001",1000000,100,10 );
        ChuyenXe xe4 = new ChuyenXeNgoaiThanh("178","Ho Van Thuong","001",1000000,"ChauDoc",40 );
        ChuyenXe xe5 = new ChuyenXeNoiThanh("190","Ho Van Thuong","001",1000000,100,10 );
        NhaXe nhaXe = new NhaXe(10);
        System.out.println(xe1);
        System.out.println(xe2);
        System.out.println(xe3);
        System.out.println(xe4);
        System.out.println(xe5);
        nhaXe.add(xe1);
        nhaXe.add(xe2);
        nhaXe.add(xe3);
        nhaXe.add(xe4);
        nhaXe.add(xe5);
        nhaXe.tongThanhTien();
    }
}
