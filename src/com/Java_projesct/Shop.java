package com.Java_projesct;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Shop extends Product {
    private final double markup;
    private double markupOf;
    private int dayOfValid;
    private static List<Personal> personalList;
    private static List<Product> productList;

    public Shop(long id, String name, double singlePrice, Category category, LocalDate validData, boolean isEatable, double markup, double markupOf, int dayOfValid) {
        super(id, name, singlePrice, category, validData, isEatable);
        this.markup = markup;
        this.markupOf = markupOf;
        this.dayOfValid = dayOfValid;
    }

    private double cellPrice() {
        this.singlePrice = singlePrice * markup;
        if (ChronoUnit.DAYS.between(validData,LocalDate.now()) <= dayOfValid) {
            this.singlePrice = this.singlePrice - markupOf;
        }
        return this.singlePrice;
    }

    // TODO: 1.6.2021 г.
    private void marcProduct() {
    }

    private void saveReceipt(String filename, Receipt receipt) {
        try (FileWriter fOut = new FileWriter(filename, true)) {
            fOut.append(receipt.toString() + System.lineSeparator());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
