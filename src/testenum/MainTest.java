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

public class MainTest {
    public static void main(String[] args) {
        Thang x = Thang.importEnum();
       // x = Thang.Thang1;
        System.out.println(x);
        System.out.println(x.getSoNgay());
    }
}
