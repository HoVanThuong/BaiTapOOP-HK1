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

public class OrderDetail {
    private int quantity;
    Product product;

    // Constructor
    public OrderDetail( Product product, int quantity) {
        this.setQuatity(quantity);
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuatity(int quantity) {
        if (quantity <= 0)
        {
            throw new IllegalArgumentException("So luong phai lon hon 0");
        }
        this.quantity = quantity;
    }

    public double calcTotalPrice() {
        return this.quantity * this.product.getPrice();
    }

//    public void add(OrderDetail orderDetail) {
//        if (this.count > 20)
//        {
//            System.out.println("So luong mat hang da day !!!");
//        }
//        else
//        {
//            lineItems[count++] = orderDetail;
//        }
//    }

    public String toString() {
        return this.product.toString() + String.format(" | %10d", this.quantity);
    }
}
