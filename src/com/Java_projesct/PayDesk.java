package com.Java_projesct;

import java.util.ArrayList;
import java.util.List;

public  class PayDesk extends Custumer {
    private int numberOfCasa;
    protected List<Product> byGoods;

    public PayDesk(String name, double money, int numberOfCasa, List<Product> byGoods) {
        super(name, money);
        this.numberOfCasa = numberOfCasa;
        this.byGoods = byGoods;
    }

    public void addProduct(Product product) {
        this.byGoods.add(product);

    }
    public double sumGoods(){
        double sumByGoods=0;
        for (Product product:byGoods) {
            sumByGoods += product.getSinglePrice();
        }
        return sumByGoods;
    }

    boolean enoughMoney(){
        return sumGoods()< getMoney();
    }

}
