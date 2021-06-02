package com.Java_projesct;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Receipt extends PayDesk {
    public long receiptId;
    public Personal personId;
    public LocalDateTime date;
    public List<Product> goods;


    public Receipt(int numberOfCasa, List<Product> byGoods, long receiptId, Personal personId,
                   LocalDateTime date, List<Product> goods) {
        super(numberOfCasa, byGoods);
        this.receiptId = receiptId;
        this.personId = personId;
        this.date = LocalDateTime.now();
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "byGoods=" + byGoods +
                ", receiptId=" + receiptId +
                ", personId=" + personId +
                ", date=" + date +
                ", goods=" + goods +
                "} " + super.toString();
    }


}
