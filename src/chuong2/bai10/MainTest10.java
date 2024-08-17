package chuong2.bai10;

public class MainTest10 {
    public static void main(String[] args) {
        SinhVien danhsachSV[] = new SinhVien[5];
        danhsachSV[0] = new SinhVien("001","Ho Van Thuong");
        danhsachSV[1] = new SinhVien("002","Ho Thuong Van");
        danhsachSV[2] = new SinhVien("003","Ho Van Kha");
        danhsachSV[3] = new SinhVien("004","Ho Van Tai");
        danhsachSV[4] = new SinhVien("005","Ho Tran Nguyen Duy");
        LopHocPhan lopHocPhan = new LopHocPhan("029392","DHKTPM19A","Co Khanh","Tiet 1-3 sang thu 3" , danhsachSV);

        System.out.println(lopHocPhan.toString());
    }
}
