import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi:");
        String a = sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a') cnt++;
        }
        System.out.println("So lan a xuat hien la :" + cnt);
    }
}
