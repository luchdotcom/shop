package com.Java_projesct;

import java.time.LocalDate;

public class Product {
    public long GoodsId;
    public String name;
    double singlePrice;
    Category category;
    LocalDate validData;
    boolean isEatable;


    public Product(long id, String name, double singlePrice, Category category, LocalDate validData, boolean isEatable) {
        this.GoodsId = id;
        this.name = name;
        this.singlePrice = singlePrice;
        this.category = category;
        this.validData = validData;
        this.isEatable = isEatable;
    }

    ///todo
    private boolean isFit(){
        return validData.isAfter(LocalDate.now());
    }
}
