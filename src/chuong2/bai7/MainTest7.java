package chuong2.bai7;

import java.time.LocalDate;

public class MainTest7 {
    public static void main(String[] args) throws Exception {

        // Hang thu 1 tao bang ham khoi tao voi 1 tham so
        HangThucPham hang1 = new HangThucPham("001");
        // Hang mac dinh
        HangThucPham hang2 = new HangThucPham();
        // Hang thu 3 co ham khoi tao day du thong tin
        HangThucPham hang3 = new HangThucPham("002", "Banh Mi", 10000, "10/08/2024", "17/08/2024");
        // Hang thu 4 dung de thu nghiem
        HangThucPham hang4 = new HangThucPham();
        hang4.setTenHang("Banh Bao");
        hang4.setDonGia(15000);
        hang4.setNgaySanXuat("14/08/2024");
        hang4.setNgayHetHan("19/08/2024");

        /// Thu in  ra man hinh xem sao ///
        System.out.println(String.format("%-10s %-30s %13s %12s %12s   %-10s","Mã Hàng", "Tên Hàng","Đơn Giá","NgaySX","NgàyHH","Ghi Chú"));
        System.out.println(hang1.toString());
        System.out.println(hang2.toString());
        System.out.println(hang3.toString());
        System.out.println(hang4.toString());
    }
}
