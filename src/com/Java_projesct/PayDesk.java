package com.Java_projesct;

import java.util.ArrayList;
import java.util.List;

public abstract class PayDesk  {
    private int numberOfCasa;
    protected List<Product> byGoods;

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
