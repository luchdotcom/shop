package com.Java_projesct;

import java.util.ArrayList;
import java.util.List;

public class PayDesk  {
    private int numberOfCasa;
    private List<Product> byGoods;

    public PayDesk(int numberOfCasa, List<Product> byGoods) {
        this.numberOfCasa = numberOfCasa;
        this.byGoods = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.byGoods.add(product);

    }

    // TODO: 3.6.2021 г.
    boolean enoughMoney(){
        return
    }

}
