package com.company;

import abstractions.Product;
import com.company.ProductType;

import java.util.HashMap;

public class ProductItem extends Product {

    private String name;
    private ProductType type;

    public ProductItem(String name, ProductType type) {
        this.name = name;
        this.type = type;
    }

    public ProductType getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.info().toString();
    }

    @Override
    public HashMap<String, Object> info() {
        HashMap<String, Object> hash = new HashMap();
        hash.put("name", this.name);
        hash.put("type", this.type);
        return hash;
    }
}
