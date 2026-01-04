package com.syos.model;

import java.time.LocalDate;

public class Batch {

    LocalDate purchaseDate;
    LocalDate expiryDate;
    int quantity;

    public Batch(LocalDate expiryDate, int quantity, LocalDate purchaseDate) {
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
