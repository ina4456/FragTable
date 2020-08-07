package com.example.fragtable.model;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class GridItem01 {

    public String name;
    public String price;
    public Bitmap bit;


    public GridItem01(String n, String p, Bitmap b){
        this.name = n;
        this.price = p;
        this.bit = b;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Bitmap getBit() {
        return bit;
    }

    public void setBit(Bitmap bit) {
        this.bit = bit;
    }
}
