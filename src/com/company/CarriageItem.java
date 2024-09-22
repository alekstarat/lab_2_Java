package com.company;

import abstractions.Carriage;

import java.util.HashMap;

public class CarriageItem extends Carriage {
    private boolean isSet = false;
    private ProductType type;
    private ProductItem currentItem;

    public CarriageItem(ProductType type) {
        this.type = type;
    }

    public ProductItem getItem() {
        return this.currentItem;
    }

    public boolean getSet() {
        return this.isSet;
    }

    public void setItem(ProductItem item) {
        this.currentItem = item;
        this.isSet = true;
    }

    @Override
    public String toString() {

        String s = String.format("____________________________\n" +
                "|                            |\n" +
                "  %s    \n" +
                "|____________________________|\n" +
                "/oo OOOOO oo`      ooo  'o!o!o\n", this.info().toString());
        return s;
    }

    @Override
    public HashMap<String, Object> info() {
        HashMap<String, Object> hash = new HashMap();
        hash.put("type", this.type);
        hash.put("isSet", this.isSet);
        String s = "____________________________\n" +
                "|                            |\n" +
                "|                            |\n" +
                "|____________________________|\n" +
                "/oo OOOOO oo`      ooo  'o!o!o\n" +
                "";
        return hash;
    }
}
