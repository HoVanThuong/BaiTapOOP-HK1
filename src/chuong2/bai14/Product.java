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

import java.text.DecimalFormat;

public class Product {
    private String description;
    private String productID;
    private double price;

    public Product() {
        this.description = "";
        this.productID = "";
        this.price = 0.0;
    }

    public Product(String description, String productID, double price) {
        this.setDescription(description);
        this.setProductID(productID);
        this.setPrice(price);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null)
        {
            throw new IllegalArgumentException("Mo ta rong");
        }
        this.description = description;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        if (productID == null)
        {
            throw new IllegalArgumentException("ID rong");
        }
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0)
        {
            throw new IllegalArgumentException("Gia ca khong hop le");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###,###,##0");
        return String.format("%-10s | %-20s | %15s", productID, description , df.format(price));
    }
}
