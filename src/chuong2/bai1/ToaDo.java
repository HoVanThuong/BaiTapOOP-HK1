package chuong2.bai1;

public class ToaDo {
    private int x, y;
    private String ten;

    public ToaDo(int x, int y, String ten) {
        this.x = x;
        this.y = y;
        this.ten = ten;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getThongTin()
    {
        return this.ten + "(" + x + ',' + y + ")";
    }

}
