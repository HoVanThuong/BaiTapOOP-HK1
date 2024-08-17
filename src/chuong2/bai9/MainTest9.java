package chuong2.bai9;

public class MainTest9 {
    public static void main(String[] args) {
        HinhTron p = new HinhTron("P", 5, 5, 10.5);
        System.out.println("Gia tri cua P:");
        System.out.println(p.toString());

        // Tam cua duong tron P
        ToaDo tam = p.getTam();
        System.out.println(tam.toString());
    }
}
