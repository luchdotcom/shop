package com.Java_projesct;

import java.time.LocalDate;

public class Product {
    public long id;
    public String name;
    double singleDeliveryPrice;
    Category category;
    LocalDate validData;
    Foods food;

    public Product(long id, String name, double singleDeliveryPrice, Category category, LocalDate validData, Foods food) {
        this.id = id;
        this.name = name;
        this.singleDeliveryPrice = singleDeliveryPrice;
        this.category = category;
        this.validData = validData;
        this.food = food;
    }
    private double cellingPrice(Category category){

    }
    private boolean isFit(){
        return false;
    }
}
