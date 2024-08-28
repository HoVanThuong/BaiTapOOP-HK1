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

public class DiemMonHoc {
    private float toan;
    private float anh;
    private float ctdl;
    private float oop;
    private float sql;

    public DiemMonHoc(float toan, float anh, float ctdl, float oop, float sql) {
        this.toan = toan;
        this.anh = anh;
        this.ctdl = ctdl;
        this.oop = oop;
        this.sql = sql;
    }


    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getAnh() {
        return anh;
    }

    public void setAnh(float anh) {
        this.anh = anh;
    }

    public float getCtdl() {
        return ctdl;
    }

    public void setCtdl(float ctdl) {
        this.ctdl = ctdl;
    }

    public float getOop() {
        return oop;
    }

    public void setOop(float oop) {
        this.oop = oop;
    }

    public float getSql() {
        return sql;
    }

    public void setSql(float sql) {
        this.sql = sql;
    }

    public float diemTrungBinh()
    {
        return (toan + anh + ctdl + oop + sql) / 5f;
    }

    public boolean duoi5()
    {
        if (toan < 5 || anh < 5 || ctdl < 5 || oop < 5 || sql < 5)
        {
            return true;
        }
        return false;
    }

    public String monThiLai()
    {
        String temp = "";
        if (toan < 5)
        {
            temp += " Toan";
        }
        if (anh < 5)
        {
            temp += " Anh";
        }
        if (ctdl < 5)
        {
            temp += " Ctdl";
        }
        if (oop < 5){
            temp += " Oop";
        }
        if (sql < 5)
        {
            temp += " Sql";
        }
        if (!temp.equals(""))
            return "(" + temp + " )";
        return temp;
    }

}
