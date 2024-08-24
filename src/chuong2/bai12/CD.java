/*
 * @ Ho Van Thuong.java    1.0 24
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong2.bai12;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 24/08/2024
 * @version: 1.0
 */

public class CD {
    private int maCD;
    private String tenCD;
    private int soBaiHat;
    private float giaThanh;

    public CD(int maCD, String tenCD, int soBaiHat, float giaThanh) {
        this.setMaCD(maCD);
        this.setTenCD(tenCD);
        this.setSoBaiHat(soBaiHat);
        this.setGiaThanh(giaThanh);
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        if (maCD < 0)
            throw new IllegalArgumentException("Ma CD > 0");
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        if (tenCD == null || tenCD.equals(""))
            throw new IllegalArgumentException("TenCD khong duoc rong hoac null");
        this.tenCD = tenCD;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        if (soBaiHat < 0)
            throw new IllegalArgumentException("SoBaiHat > 0");
        this.soBaiHat = soBaiHat;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(float giaThanh) {
       if (giaThanh < 0)
           throw new IllegalArgumentException("GiaThanh > 0");
        this.giaThanh = giaThanh;
    }

    public String toString() {
        return String.format("%10d %10s %10d %10.2f", maCD, tenCD, soBaiHat, giaThanh);
    }
}
