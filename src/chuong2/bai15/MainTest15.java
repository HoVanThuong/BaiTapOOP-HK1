/*
 * @ Ho Van Thuong.java    1.0 28
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong2.bai15;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 28/08/2024
 * @version: 1.0
 */

import java.sql.SQLOutput;
import java.time.LocalDate;

public class MainTest15 {
    public static void main(String[] args) {
        DiemHocVienList list;
        list = new DiemHocVienList(10);
        DiemHocVien hv1 = new DiemHocVien("Ho Van Thuong", LocalDate.of(2005,4,16),10,10,10,10,10);
        DiemHocVien hv2 = new DiemHocVien("SON GO KU", LocalDate.of(2005,5,16),10,10,10,10,10);
        DiemHocVien hv3 = new DiemHocVien("SON GO HAN", LocalDate.of(2012,5,16),7,7,7,7,7);
        DiemHocVien hv4 = new DiemHocVien("VE GE TA", LocalDate.of(2012,5,16),4,7,7,7,7);
        list.add(hv1);
        list.add(hv2);
        list.add(hv3);
        list.add(hv4);
        System.out.println(list.toString());
    }
}
