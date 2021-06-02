package com.Java_projesct;

import java.time.LocalDate;

public class Product {
    public long GoodsId;
    public String name;
    double singlePrice;
    LocalDate validData;
    boolean isEatable;
    double quantity;

    public long getGoodsId() {
        return GoodsId;
    }

    public String getName() {
        return name;
    }

    public double getSinglePrice() {
        return singlePrice;
    }

    public LocalDate getValidData() {
        return validData;
    }

    public boolean isEatable() {
        return isEatable;
    }

    public Product(long id, String name, double singlePrice, LocalDate validData, boolean isEatable, double quantity) {
        this.GoodsId = id;
        this.name = name;
        this.singlePrice = singlePrice;
        this.validData = validData;
        this.isEatable = isEatable;
        this.quantity=quantity;
    }

    ///todo
    public boolean IsSuitable(){
        return validData.isAfter(LocalDate.now());
    }
}
