package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Exchanger {

    private Warehouse warehouse;
    private Train train;

    public Exchanger(Warehouse warehouse, Train train) {
        this.warehouse = warehouse;
        this.train = train;
    }

    public boolean fromWarehouseToTrain() {
        System.out.println("\nSelect products from warehouse to put them in the train (0 1 2...): \n\n" + warehouse);
        String[] selectedIndexesString = new Scanner(System.in).nextLine().split(" ");
        ArrayList<ProductItem> selectedProducts = new ArrayList<ProductItem>();


        if (selectedIndexesString.length > train.getItems().toArray().length) {
            System.out.println("Not enough empty carriages!");
        }

        for (int i = 0; i < selectedIndexesString.length; i++) {
            selectedProducts.add(warehouse.getItems().get(Integer.parseInt(selectedIndexesString[i])));
            //warehouse.remove(selectedProducts.get(i));
        }

        ArrayList<Boolean> isSuccess = new ArrayList<Boolean>();

        for (int i = 0; i < selectedProducts.toArray().length; i++) {
            isSuccess.add(train.putProduct(selectedProducts.get(i)));
            warehouse.remove(selectedProducts.get(i));
        }

        System.out.println(train);
        return isSuccess.contains(true);
    }
}
