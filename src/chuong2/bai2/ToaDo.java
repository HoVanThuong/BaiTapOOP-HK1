package chuong2.bai2;

public class ToaDo {
    private int x, y;
    public ToaDo(int x, int y) {
        this.x = x;
        this.y = y;
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

    public void negate()
    {
       this.setX(-this.getX());
       this.setY(-this.getY());
    }

    public double getDistance()
    {
        return Math.sqrt(Math.pow(this.x ,2) + Math.pow(this.y , 2));
    }

    public String getThongTin()
    {
        return "(" + this.x + "," + this.y + ")";
    }
}
