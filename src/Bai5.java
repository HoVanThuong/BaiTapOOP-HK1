import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a: ");
        int a = sc.nextInt();
        System.out.println("Nhap vao so b:");
        int b = sc.nextInt();

        while(b != 0)
        {
            int temp = a;
            a = b;
            b = temp % b;
        }
        System.out.println("Uoc chung lon nhat cua a va b la :" + a);
    }
}
