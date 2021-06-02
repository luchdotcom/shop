package com.Java_projesct;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Shop extends Product {
    private final double markup;
    private final double markupOf;
    private final int dayOfValid;
    private static List<Personal> personalList;
    private static List<Product> productList;

    public Shop(long id, String name, double singlePrice, LocalDate validData, boolean isEatable,
                double quantity, double markup, double markupOf, int dayOfValid) {
        super(id, name, singlePrice, validData, isEatable, quantity);
        this.markup = markup;
        this.markupOf = markupOf;
        this.dayOfValid = dayOfValid;
    }

    public double cellPrice() {
        this.singlePrice = singlePrice * markup;
        if (ChronoUnit.DAYS.between(validData,LocalDate.now()) <= dayOfValid) {
            this.singlePrice = this.singlePrice - markupOf;
        }
        return this.singlePrice;
    }

    private void saveReceipt(String filename, Receipt receipt) {
        try (FileWriter fOut = new FileWriter(filename, true)) {
            fOut.append(receipt.toString() + System.lineSeparator());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
