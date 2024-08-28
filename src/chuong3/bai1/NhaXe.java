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

import java.util.Arrays;

public class NhaXe {
    private ChuyenXe chuyenXe[];
    private int dem = 0;

    public NhaXe(int n) {
        if (n <= 0)
        {
            throw new IllegalArgumentException("So luong luu tru khong hop le");
        }
        chuyenXe = new ChuyenXe[n];
    }

    public boolean add(ChuyenXe chuyenXe) {
        if (chuyenXe == null)
            return false;
        // Xet chuyen xe da ton tai ( luoi )
        if(dem == this.chuyenXe.length)
        {
            float rate = 1.5f;
            int newLength = (int)(this.chuyenXe.length * rate);
            ChuyenXe[] temp = new ChuyenXe[newLength];
            temp = Arrays.copyOf(this.chuyenXe, dem);
            this.chuyenXe = temp;
        }
        this.chuyenXe[dem++] = chuyenXe;
        return true;
    }


    public void tongThanhTien()
    {
        double doanhThuNoiThanh  = 0;
        double doanhThuNgoaiThanh =0 ;
        for(int i = 0; i < dem; i++)
        {
            if(chuyenXe[i] instanceof ChuyenXeNoiThanh)
            {
                doanhThuNoiThanh += chuyenXe[i].getDoanhThu();
            }
            else{
                doanhThuNgoaiThanh += chuyenXe[i].getDoanhThu();
            }
        }
        System.out.println("Doanh thu chuyen xe ngoai thanh: " + doanhThuNgoaiThanh);
        System.out.println("Doanh thu chuyen xe noi thanh: " + doanhThuNoiThanh);
        System.out.println("Doanh thu tong: "+ (doanhThuNgoaiThanh + doanhThuNoiThanh));
    }
}
