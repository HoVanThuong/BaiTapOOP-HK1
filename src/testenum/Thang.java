/*
 * @ Ho Van Thuong.java    1.0 17
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package testenum;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 17/09/2024
 * @version: 1.0
 */

import java.util.Scanner;

public enum Thang {
    Thang1(31),
    Thang2(31),
    Thang3(31),
    Thang4(31),
    Thang5(31),
    Thang6(31),
    Thang7(31),
    Thang8(31),
    Thang9(31),
    Thang10(31),
    Thang11(31),
    Thang12(31);

    //public static final int
    int soNgay;


    Thang(int soNgay) {
        this.soNgay = soNgay;
    }

    public int getSoNgay() {
        return soNgay;
    }

    // Nhap enum tu ban phim
    public static Thang importEnum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thang (1-12):");
        int soThang = sc.nextInt();
        sc.close();
        switch (soThang) {
            case 1 -> {return Thang1;}
            case 2 -> {return Thang2;}
            case 3 -> {return Thang3;}
            case 4 -> {return Thang4;}
            case 5 -> {return Thang5;}
            case 6 -> {return Thang6;}
            case 7 -> {return Thang7;}
            case 8 -> {return Thang8;}
            case 9 -> {return Thang9;}
            case 10 -> {return Thang10;}
            case 11 -> {return Thang11;}
            default -> {return Thang12;}
        }

    }
    // Co the dung nhu switch case
}
