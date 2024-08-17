import java.util.Scanner;

public class Bai14 {
    // Tim kiem gia tri k trong mang
    // BinarySearch
    public static boolean binarySearch(int a[], int l, int r,  int k)
    {
        int mid = (l + r)/2;
        if (a[mid] == k)
            return true;
        return a[mid] > k ? binarySearch(a, l, mid - 1, k) : binarySearch(a, mid + 1, r, k);
    }
    // LinearSearch
    public static boolean linearSearch(int a[], int n, int k)
    {
        for (int i = 0; i < n; i++)
        {
            if (a[i] == k)
                return true;

        }
        return false;
    }

    // Tim kiem tuan tu co linh canh
    public static boolean tuanTuCoLinhCanh(int a[], int n, int k)
    {
        a[n] = k;
        int i = 0;
        while(a[i] != k)
        {
            i++;
        }
        return i == n ? false : true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong mang:");
        int n = sc.nextInt();
        int a[] = new int[1000];
        System.out.println("Nhap mang");
        for (int i = 0; i < n; i++)
        {
            System.out.print("Phan tu " + (i + 1) +":");
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap vao phan tu muon tim:");
        int k = sc.nextInt();
        System.out.println("Gia tri tim kiem BinarySearch:" + binarySearch(a, 0, n - 1, k));
        System.out.println("Gia tri tim kiem LinearSearch:" + linearSearch(a, n, k));
        System.out.println("Gia tri tim kiem Tim kiem tuan tu co linh canh: " + tuanTuCoLinhCanh(a, n, k));
    }
}
