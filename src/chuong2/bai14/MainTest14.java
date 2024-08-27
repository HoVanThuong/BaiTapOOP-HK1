/*
 * @ Ho Van Thuong.java    1.0 27
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package chuong2.bai14;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 27/08/2024
 * @version: 1.0
 */

import java.time.LocalDate;

public class MainTest14 {
    public static void main(String[] args) {
        Order od = new Order(102, LocalDate.of(2024, 8,27));
        Product product1 = new Product("Nuoc mam","sp1",23000f);
        Product product2 = new Product("Nuoc alquafina","sp2",6000f);
        Product product3 = new Product("Muoi","sp3",30000f);
        Product product4 = new Product("Duong","sp4",23000f);
        Product product5 = new Product("Tra lai","sp5",20000f);
        Product product6 = new Product("Thit heo","sp6",180000f);
        Product product7 = new Product("Thit ga","sp7",210000f);
        Product product8 = new Product("Thit bo","sp8",310000f);
        ////
        od.addLineItem(product1,3);//1
        od.addLineItem(product2,2);
        od.addLineItem(product3,1);
        od.addLineItem(product4,1);
        od.addLineItem(product5,1);
        od.addLineItem(product6,1);
        od.addLineItem(product7,1);
        od.addLineItem(product8,1);
        od.addLineItem(product8,1);
        od.addLineItem(product8,1);
        od.addLineItem(product8,1);
        od.addLineItem(product8,1);
        od.addLineItem(product8,1);
        od.addLineItem(product8,1);
        od.addLineItem(product8,1);
        od.addLineItem(product8,1);
        od.addLineItem(product8,1);
        od.addLineItem(product8,1);
        od.addLineItem(product8,1);
        od.addLineItem(product8,1);
        od.addLineItem(product8,1);
        System.out.println(od.toString());
    }
}
