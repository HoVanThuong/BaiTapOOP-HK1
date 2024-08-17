import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        // Viet in ra so le tu 1 den N ( toi uu chuong trinh )
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so N:");
        int n = sc.nextInt();
        for (int i = 0; i < n/2; i++) {
            System.out.printf("%d ", 2*i + 1);
        }
        if (n % 2 == 1)
            System.out.printf("%d\n",n);
        else
            System.out.printf("\n");
    }
}
