package com.mywork.model;

import java.io.Serializable;
import java.sql.Blob;

/**
 * Created by D on 3/25/2017.
 */
public class AvailableItems {
    int id;
    String itemName;
    String itemDescription;
    int availableQuantity;
    Blob itemImage;
    int itemPrice;

    public AvailableItems() {
    }

    public AvailableItems(int id, String itemName, String itemDescription, int availableQuantity, Blob itemImage, int itemPrice) {
        this.id = id;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.availableQuantity = availableQuantity;
        this.itemImage = itemImage;
        this.itemPrice = itemPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Blob getItemImage() {
        return itemImage;
    }

    public void setItemImage(Blob itemImage) {
        this.itemImage = itemImage;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}
