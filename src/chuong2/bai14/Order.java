/*
 * @ Ho Van Thuong.java    1.0 27
 * Copyright (c)  IUH. All rights reserved
 *
 */

package chuong2.bai14;


/*
 * @description: IUHER
 * @author: Ho Van Thuong
 * @date: 27/08/2024
 * @version: 1.0
 */

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private int count = 0;
    private ArrayList<OrderDetail> lineItems = new ArrayList<>();

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.setOrderDate(orderDate);
    }

    public void setOrderDate(LocalDate orderDate) {
        if (orderDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Ngay dat hang khong hop le");
        }
        this.orderDate = orderDate;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public OrderDetail[] getLineItems() {
        return lineItems.toArray(new OrderDetail[0]);
    }

    public int getOrderID() {
        return orderID;
    }

    public void addLineItem(Product product, int quantity) {
        if (product == null || quantity <= 0) {
            System.out.println("San pham rong hoac so luong khong hop le");
            return;
        }
        if (count >= 20)
        {
            System.out.println("So luong mat hang da day");
            return;
        }
        lineItems.add(new OrderDetail(product, quantity));
        count += quantity;
    }

    public double calcTotalCharge()
    {
        double total = 0;
        for (int i = 0; i < lineItems.size(); i++) {
            total += lineItems.get(i).calcTotalPrice();
        }
        return total;
    }

    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("###,###,##0");
        String temp ="";
        for (int i = 0; i < lineItems.size(); i++) {
            temp +=   String.format("%-10d | ",i+1) + lineItems.get(i).toString() + String.format(" | %26s VND |\n",df.format(lineItems.get(i).calcTotalPrice()));
        }
        String temp2 = "--";
        for (int i =  1; i <= 11; i++)
        {
            temp2 += "----------";
        }
        return  "Ma HD: " + orderID + "\n" +
                "Ngay lap hoa don: " +  dtf.format(orderDate) + "\n" +
                temp2 + "\n" +
                String.format("%-10s | %-10s | %-20s | %15s | %10s | %30s |\n","STT","MA SP","MO TA","DON GIA", "SO LUONG","THANH TIEN") +
                temp2 + "\n" +
                temp +
                temp2 + "\n" + "Tong tien thanh toan: " +
                df.format(this.calcTotalCharge()) + " VND";
    }

}
