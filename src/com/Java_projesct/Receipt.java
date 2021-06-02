package com.Java_projesct;

import java.time.LocalDate;
import java.util.List;

public class Receipt extends PayDesk {
    public long  receiptId;
    public Personal personId
   public LocalDate date;
   public List<Product> goods;

    public Receipt(int numberOfCasa, List<Product> byGoods) {
        super(numberOfCasa, byGoods);
    }
}
