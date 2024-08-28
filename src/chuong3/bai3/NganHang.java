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

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class NganHang {
    private int dem = 0;
    private GiaoDich giaoDich[];

    public NganHang(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("So GD >= 0");
        giaoDich = new GiaoDich[n];
    }
    // Find idex
    public  int getIdex(GiaoDich g) {
        int i = 0;
        for(; i < dem; i++)
        {
            if(g.getMaGD().equals(giaoDich[i].getMaGD()))
            {
                return -1;
            }
        }
        return i;
    }

    public boolean themGiaoDich(GiaoDich giaoDich) {
        if(giaoDich == null)
            return false;
        if( this.getIdex(giaoDich) == -1)
            return false;
        if(dem == this.giaoDich.length)
        {
            float rate = 1.5f;
            int newLength = (int)(this.giaoDich.length * rate);
            this.giaoDich = Arrays.copyOf(this.giaoDich, newLength);
        }
        this.giaoDich[dem++] = giaoDich;
        return true;
    }

    public void tongSoLuongGDTungLoai()
    {
        int gdVang = 0;
        for(int i = 0; i < dem; i++)
        {
            if(giaoDich[i] instanceof GiaoDichVang)
            {
                gdVang++;
            }
        }
        System.out.println("Tong so giao dich vang la: " + gdVang);
        System.out.println("Tong so giao dich tien te la: " + (dem - gdVang));
    }

    public int soGDTienTe()
    {
        int soLuong = 0;
        for (int i = 0; i < dem; i++)
        {
            if(giaoDich[i] instanceof GiaoDichTienTe)
                soLuong++;
        }
        return soLuong;
    }

    public double trungBinhThanhTienGDTienTe()
    {
        double sum = 0;
        for(int i = 0; i < dem; i++)
        {
            if(giaoDich[i] instanceof GiaoDichTienTe)
                sum += giaoDich[i].thanhTien();
        }
        int soLuong = soGDTienTe();
        if(soLuong == 0)
            return 0;
        else
            return sum / soLuong;
    }

    public GiaoDich[] xuatGiaoDichTren1Ty() {
        GiaoDich temp[] = new GiaoDich[dem];
        int idex = 0;
        for(int i = 0; i < dem; i++)
        {
            if(giaoDich[i].thanhTien() > 1000000000)
            {
                temp[idex++] = giaoDich[i];
            }
        }
        return Arrays.copyOf(temp, idex);
    }

    public void xuatGiaoDich()
    {
        for(int i = 0; i < dem; i++)
        {
            System.out.println(giaoDich[i]);
        }
    }
}
