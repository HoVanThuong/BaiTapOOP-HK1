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

public class DiemHocVienList {
    private DiemHocVien[] list;
    private int count = 0;

    public DiemHocVienList(int n) {
        list = new DiemHocVien[n];
    }

    public void add(DiemHocVien d) {
        if (count == list.length) {
            throw new IllegalArgumentException("Danh sach day");
        }
        list[count++] = d;
    }
    public String toString()
    {
        String temp = "";
        for (int i = 0; i < count; i++)
        {
            temp += list[i].toString() + String.format("%30s",list[i].xetDiem());
        }
        return String.format("%-30s%20s%8s%29s\n","HOTEN","NGAYSINH","DIEMTB","GHICHU") + temp;
    }
}
