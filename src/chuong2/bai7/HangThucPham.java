package chuong2.bai7;

import javax.management.StandardEmitterMBean;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    private String maHang ;
    private String tenHang ;
    private int donGia ;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan ;

    public HangThucPham() {
        this.maHang = "000";
        this.tenHang = "XXX";
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = LocalDate.now();
        this.donGia = 0;
    }
    public HangThucPham(String maHang) throws Exception {
        if (maHang.equals(""))
            throw new Exception("Ma hang khong duoc phep rong !!!");
        else
            this.maHang = maHang;
        this.tenHang = "XXX";
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = LocalDate.now();
        this.donGia = 0;
    }

    public HangThucPham(String maHang, String tenHang, int donGia, String ngaySanXuat, String ngayHetHan) throws Exception {
        if (maHang.equals(""))
            throw new Exception("Ma hang khong duoc phep rong !!!");
        else
            this.maHang = maHang;
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setNgaySanXuat(ngaySanXuat);
        this.setNgayHetHan(ngayHetHan);
    }
    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) throws Exception {
        if (tenHang.equals(""))
            throw new Exception("Ten hang khong duoc phep rong !!!");
        else
            this.tenHang = tenHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) throws Exception {
        if (donGia < 0)
            throw new Exception("Don gia khong hop le !!!");
        else
            this.donGia = donGia;
    }

    public String getNgaySanXuat() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dtf.format(ngaySanXuat);
    }

    public void setNgaySanXuat(String ngaySanXuat) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean check = true;
        try{
            LocalDate date = LocalDate.parse(ngaySanXuat, dtf);
            check = false;
            if (date.isAfter(LocalDate.now()))
                throw new Exception();
            else
                this.ngaySanXuat = date;
        }
        catch(Exception e){
            if (check)
                throw new Exception("Ngay san xuat khong dung dinh dang dd/MM/yyyy !!!");
            else
                throw new Exception("Ngay san xuat khong chinh xac !!!");
        }
    }

    public String getNgayHetHan() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dtf.format(ngayHetHan);
    }

    public void setNgayHetHan(String  ngayHetHan) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean check = true;
        try{
            LocalDate date = LocalDate.parse(ngayHetHan, dtf);
            check = false;
            if (date.isBefore(this.ngaySanXuat))
                throw new Exception();
            else
                this.ngayHetHan = date;
        }catch (Exception e){
           if (check)
               throw new Exception("Ngay het han khong dung dinh dang dd/MM/yyyy !!!");
           else
               throw new Exception("Ngay het han khong chinh xac !!!");
        }
    }

    public boolean checkHetHan()
    {
        return this.ngayHetHan.isEqual(LocalDate.now()) ? true : false;
    }

    public String toString ()
    {
        String temp ="";
        DecimalFormat df = new DecimalFormat("#,##0.00");
        if (this.checkHetHan())
            temp = "Het Han";
        return String.format("%-10s %-30s %10sVND %12s %12s   %-10s", this.maHang, this.tenHang, df.format(this.donGia), getNgaySanXuat(), getNgayHetHan(),temp);
    }
}
