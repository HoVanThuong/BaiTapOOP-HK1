/*
 * @ Ho Van Thuong.java    1.0 21
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong3.bai2;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 21/09/2024
 * @version: 1.0
 */

import chuong3.bai1.ChuyenXe;

import java.util.Arrays;

public class ThuVien {
    private int dem = 0;
    private Sach dsSach[];

    public ThuVien(int n) {
        if(n < 0)
        {
            throw new IllegalArgumentException("Gion mat ha");
        }
        dsSach = new Sach[n];
    }

    public int getIdex(Sach sach)
    {
        int i = 0;
        for (; i < dem; i++)
        {
            if (dsSach[i].getMaSach().equals(sach.getMaSach()))
            {
                return -1;
            }
        }
        return i;
    }

    public boolean themSach(Sach sach)
    {
        if(sach == null)
            return false;
        //  Neu sach ton tai
        if (getIdex(sach) == -1)
        {
            return false;
        }
        if(dem == dsSach.length)
        {
            float rate = 1.5f;
            int newLength = (int)(this.dsSach.length * rate);
            Sach[] temp = new Sach[newLength];
            temp = Arrays.copyOf(this.dsSach, newLength);
            this.dsSach = temp;
        }
        dsSach[dem++] = sach;
        return true;
    }


    public Sach[] sachNhaXuatBanK(String k)
    {
        Sach[] temp = new Sach[dem];
        int idex = 0;
        for (int i = 0; i < dem; i++)
        {
            if (dsSach[i].getNxb().equals(k))
            {
                temp[idex++] = dsSach[i];
            }
        }
        return Arrays.copyOf(temp, idex);
    }


    public void thanhTienCaoNhat()
    {
        double max = -1;
        Sach temp = null;
        for(int i = 0; i < dem; i++)
        {
            if (dsSach[i].thanhTien() > max)
            {
                max = dsSach[i].thanhTien();
                temp = dsSach[i];
            }
        }
        System.out.println("Thanh tien cao nhat la: " + max);
        System.out.println(temp);
    }

    public void xuatSach() {
        System.out.println(String.format("%-30s %-20s %-20s %10s %30s ","MaSach", "NgayNhap", "DonGia", "SoLuong", "NXB"));
        for(int i = 0; i < dem; i++)
        {
            System.out.println(dsSach[i]);
        }
    }
}
