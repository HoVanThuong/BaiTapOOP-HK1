package chuong1;

import java.util.Scanner;

public class Bai17 {
    // In tam giac
    public static void menu()
    {
        System.out.println("===MENU===");
        System.out.println("1. In tam gia kieu A");
        System.out.println("2. In tam gia kieu B");
        System.out.println("3. In tam gia kieu C");
        System.out.println("4. In tam gia kieu D");
        System.out.println("===========");
        System.out.print("Lua chon cua ban:");
    }
    public static void tamGiacA(int line)
    {
        String temp ="";
        for (int i = 1; i <= line ; i++)
        {
            temp += "*";
            System.out.println(temp);
        }
    }

    public static void tamGiacB(int line)
    {
        String temp ="";
        for (int i = 1; i <= line ; i++)
        {
            temp += "*";
        }
        for (int i = 1; i <= line ; i++)
        {
            System.out.println(temp.substring(i));
        }
    }
    public static void tamGiacC(int line)
    {
        String temp ="*";
        String space ="";
        for (int i = 1; i <= line ; i++)
        {
            space += " ";
        }
        for (int i = 1; i <= line ; i++)
        {
            System.out.println(space.substring(i) + temp);
            temp += "**";
        }
    }

    public static void tamGiacD(int line)
    {
        String temp = "";
        String space1 = "";
        String space2 = "";
        for (int i = 1; i <= line ; i++)
        {
            space1 += " ";
            if (i < line)
                temp += "**";
        }
        for (int i = 1; i < line ; i++)
        {
            System.out.print(space1.substring(i) + "*" + space2);
            if (i == 1)
                space2 += " ";
            else space2 += "  ";
            if (i > 1 ) System.out.println("*");
            else System.out.println();
        }
        System.out.println(temp + "*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            menu();
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Nhap vao so dong:");
                    int line = sc.nextInt();
                    tamGiacA(line);
                };break;
                case 2:
                {
                    System.out.println("Nhap vao so dong:");
                    int line = sc.nextInt();
                    tamGiacB(line);
                };break;
                case 3:
                {
                    System.out.println("Nhap vao so dong:");
                    int line = sc.nextInt();
                    tamGiacC(line);
                };break;
                case 4:
                {
                    System.out.println("Nhap vao so dong:");
                    int line = sc.nextInt();
                    tamGiacD(line);
                };break;
            }
        }
        while(choice >= 1 && choice <= 4);
        System.out.println("Cam on da su dung !!!");
    }
}
