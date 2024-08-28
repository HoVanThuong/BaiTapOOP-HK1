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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiemHocVien {
    private String ten;
    private LocalDate ngaysinh;
    private DiemMonHoc Diem;

    public DiemHocVien(String ten, LocalDate ngaysinh, float toan, float anh, float ctdl, float oop, float sql) {
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.Diem = new DiemMonHoc(toan, anh, ctdl, oop, sql);
    }

    public boolean xetLuanVan()
    {
        if (Diem.diemTrungBinh() > 7 && !Diem.duoi5())
        {
            return true;
        }
        return false;
    }

    public boolean xetTotNghiep ()
    {
        if (Diem.diemTrungBinh() <= 7 && !Diem.duoi5())
        {
            return true;
        }
        return false;
    }

    public boolean xetThiLai()
    {
        if (Diem.duoi5())
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-30s%20s%8.2f", ten, dtf.format(ngaysinh), Diem.diemTrungBinh());
    }

    public String xetDiem()
    {
        if (this.xetLuanVan())
        {
            return "Duoc xet Luan Van\n";
        }
        else {
            if(this.xetTotNghiep())
            {
                return "Duoc xet Tot Nghiep\n";
            }
            else {
                return "Thi Lai" + Diem.monThiLai() + "\n" ;
            }
        }
    }

}
