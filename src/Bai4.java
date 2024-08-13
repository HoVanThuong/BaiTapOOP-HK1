import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a: ");
        int a = sc.nextInt();
        System.out.println("Nhap vao b:");
        int b = sc.nextInt();
        if (a == 0 && b == 0)
        {
            System.out.println("PT vo nghiem");
        }
        else
        {
            if (a == 0 && b != 0)
                System.out.println("PT co vo so nghiem");
            else
            {
                System.out.println("PT co nghiem la :" + (-b * 1.0)/a);
            }
        }
    }
}
