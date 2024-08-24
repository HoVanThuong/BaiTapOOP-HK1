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

public class DanhSachCongNhan {
    private CongNhan DanhSach[];
    private int count;

    public DanhSachCongNhan(int n) {
        DanhSach = new CongNhan[n];
    }

    public boolean addCongNhan(CongNhan congNhan) {
        if (congNhan == null) {
            return false;
        }
        if (count >= DanhSach.length) {
            return false;
        }
        DanhSach[count++] = congNhan;
        return true;
    }

    public CongNhan[] getCongNhan() {
        return DanhSach;
    }
    public String toString()
    {
        String str = "";
        for (int i = 0; i < count; i++) {
            str += DanhSach[i].toString() + "\n";
        }
        return str;
    }

    public int getCount()
    {
        return count;
    }

    public boolean isExits(int ma)
    {
        for (int i = 0; i < count; i++) {
            if (DanhSach[i].getMa() == ma) {
                return true;
            }
        }
        return false;
    }

    public boolean delByMa(int ma)
    {
        if (ma < 0)
        {
            return false;
        }
        if (!isExits(ma)) {
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (DanhSach[i].getMa() == ma) {
                for(int j = i; j < count-1; j++) {
                    DanhSach[j] = DanhSach[j+1];
                }
                count--;
                i--;
            }
        }
        return true;
    }

    public CongNhan[] congNhanTren200()
    {
        DanhSachCongNhan temp = new DanhSachCongNhan(count);
        for (int i = 0; i < count; i++) {
            if (this.DanhSach[i].getSoSP() >= 200) {
                temp.addCongNhan(DanhSach[i]);
            }
        }
        return temp.getCongNhan();
    }

    public CongNhan[] sortBySoSP()
    {
        CongNhan temp[] = this.getCongNhan();
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (temp[j].getSoSP() < temp[j+1].getSoSP()) {
                    CongNhan temp2 = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = temp2;
                }
            }
        }
        return temp;
    }

    public void setDanhSach(CongNhan[] congNhan)
    {
        this.DanhSach = congNhan;
    }
}
