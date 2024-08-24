/*
 * @ Ho Van Thuong.java    1.0 24
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong2.bai13;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 24/08/2024
 * @version: 1.0
 */

public class CongNhan {
    private int ma;
    private String ho;
    private String ten;
    private int soSP;

    public CongNhan(int ma, String ho, String ten, int soSP) {
        this.ma = ma;
        this.ho = ho;
        this.ten = ten;
        this.setSoSP(soSP);
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if (soSP < 0)
            this.soSP = 0;
        this.soSP = soSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public float tinhLuong ()
    {
        if (this.soSP >= 600)
            return 199 * 0.5f + 399 * 0.55f + 599 * 0.6f + (this.soSP - 600) * 0.65f;
        if (this.soSP >= 400)
            return 199 * 0.5f + 399 * 0.55f + (this.soSP - 400) * 0.6f;
        if (this.soSP >= 200)
            return 199 * 0.5f + (this.soSP - 200) * 0.55f;
        else {
            return this.soSP * 0.5f;
        }
    }

    public String toString()
    {
        return String.format("%-10d %-10s %-10s %10d", ma, ho, ten, soSP);
    }

}
