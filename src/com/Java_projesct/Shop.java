package com.Java_projesct;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Shop extends Product{
    private Personal person;
    private Product product;
    private static List<Personal> personalList;
    private static List<Product> productList;

    public Shop(long id, String name, double singleDeliveryPrice, Category category, LocalDate validData, Foods food) {
        super(id, name, singleDeliveryPrice, category, validData, food);
    }

    private  Product cellPrice(){
        return singleDeliveryPrice *
    }
    private void marcProduct(){}
    private void saveReceipt(String filename,Receipt receipt){
        try (FileWriter fout= new FileWriter(filename,true)){
            fout.append(receipt.toString()+ System.lineSeparator());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
