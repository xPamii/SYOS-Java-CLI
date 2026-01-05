package com.syos.model;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private String code;
    private String name;
    private double price;
    private List<Batch> batches;

    public Item(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.batches = new ArrayList<>();
    }


    public int getTotalQuantity() {
        int total = 0;
        for (Batch batch : batches) {
            total += batch.getQuantity();
        }
        return total;
    }


    public void addBatch(Batch batch) {
        this.batches.add(batch);
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Batch> getBatches() {
        return batches;
    }

    public void setBatches(List<Batch> batches) {
        this.batches = batches;
    }
}