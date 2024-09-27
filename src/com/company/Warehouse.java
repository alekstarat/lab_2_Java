package com.company;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void remove(ProductItem item) {
        storage.remove(item);
    }

    public ProductItem generateProduct() {
        System.out.println("Select category for new product:");
        for (int i = 0; i < ProductType.values().length; i++) {
            System.out.print(i + ". " + ProductType.values()[i] + '\n');
        }
        int catInd = new Scanner(System.in).nextInt();
        System.out.print("Enter name for new product: ");
        String productName = new Scanner(System.in).nextLine();
        return new ProductItem(productName, ProductType.values()[catInd]);
    }

    public void fillWarehouse() {
        System.out.print("Enter product count for filling warehouse: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            this.addItem(generateProduct());
        }
    }

    public ArrayList<ProductItem> getItems() {
        return this.storage;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < storage.toArray().length; i++) {
            s += i + ". " + storage.get(i).toString() + "\n";
        }
        if (s == "") {
            s = "\nWarehouse is now empty!\n";
        }
        return s;
    }
}
