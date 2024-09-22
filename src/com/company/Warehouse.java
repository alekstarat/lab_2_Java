package com.company;

import java.util.ArrayList;

public class Warehouse {

    private ArrayList<ProductItem> storage;

    public Warehouse(ArrayList<ProductItem> storage) {
        this.storage = storage;
    }

    public Warehouse() {
        this.storage = new ArrayList<ProductItem>();
    }

    public void addItem(ProductItem item) {
        this.storage.add(item);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < storage.toArray().length; i++) {
            s += storage.get(i).toString() + "\n";
        }
        return s;
    }
}
