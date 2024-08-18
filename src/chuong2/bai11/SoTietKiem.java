package chuong2.bai11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SoTietKiem {
    private String maSo;
    private LocalDate date;
    private Double soTienGoi;
    private int kiHan;
    private float laiSuat;

    // Constructor

    public SoTietKiem(String maSo, LocalDate date, double soTienGoi, int kiHan, float laiSuat) {
        this.maSo = maSo;
        this.date = date;
        this.soTienGoi = soTienGoi;
        this.kiHan = kiHan;
        this.laiSuat = laiSuat;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getSoTienGoi() {
        return soTienGoi;
    }

    public void setSoTienGoi(Double soTienGoi) {
        this.soTienGoi = soTienGoi;
    }

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }

    public float getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(float laiSuat) {
        this.laiSuat = laiSuat;
    }

    public double tinhTienLai()
    {
        int soThangGoi = tinhSoThangGoiThuc();
        return soTienGoi * laiSuat * soThangGoi;
    }

    public int tinhSoThangGoiThuc()
    {
        Period age = Period.between(date, LocalDate.now());
        int nam = age.getYears();
        int thang = age.getMonths();
        int soThangGoi = nam * 12 + thang;
        if (soThangGoi % kiHan == 0)
        {
            return soThangGoi;
        }
        return soThangGoi / kiHan * kiHan;
    }

    public String toString()
    {
        DateTimeFormatter  dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat decimalFormat = new DecimalFormat("###,###,##0.00");
        return "STK" + maSo + "[" + dtf.format(date) + "-" + dtf.format(LocalDate.now()) + "]" +"KH " + kiHan +" thang, "+
        " so thang tinh lai: " + tinhSoThangGoiThuc() + ", lai suat: " + String.format("%.3f",laiSuat) + ", so tien: "+
        decimalFormat.format(soTienGoi)+" ----> Tien Lai: "+decimalFormat.format(tinhTienLai());
    }
}
