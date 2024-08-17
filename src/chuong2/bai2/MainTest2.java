package chuong2.bai2;

public class MainTest2 {

    public static void main(String[] args) {
        ToaDo a = new ToaDo(3,4);
        ToaDo b = new ToaDo(5,6);
        ToaDo c = new ToaDo(7,8);
        System.out.println("Khoang cach tu a den goc toa do: " + a.getDistance());
        System.out.println("Khoang cach tu b de goc toa do: " + b.getDistance());
        c.negate();
        System.out.println("Diem c sau khi doi xung la : " + c.getThongTin());
    }
}
