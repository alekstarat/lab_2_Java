package com.company;
import abstractions.Carriage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static void fillTrain(int n, Train train) {
        for (int i = 0; i < n; i++) {
            System.out.println("Select product type for carriage " + i + ": ");
            train.addItem(generateCarriage());
        }
    }

    private static void fillWarehouse(Warehouse warehouse) {
        System.out.print("Enter product count for filling warehouse: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            warehouse.addItem(generateProduct());
        }
    }

    private static ProductItem generateProduct() {
        System.out.println("Select category for new product:");
        for (int i = 0; i < ProductType.values().length; i++) {
            System.out.print(i + ". " + ProductType.values()[i] + '\n');
        }
        int catInd = new Scanner(System.in).nextInt();
        System.out.print("Enter name for new product: ");
        String productName = new Scanner(System.in).nextLine();
        return new ProductItem(productName, ProductType.values()[catInd]);
    }

    private static CarriageItem generateCarriage() {

        for (int i = 0; i < ProductType.values().length; i++) {
            System.out.print(i + ". " + ProductType.values()[i] + '\n');
        }
        return new CarriageItem(ProductType.values()[new Scanner(System.in).nextInt()]);
    }

    public static void main(String[] args) {
	    //ProductItem car1 = new ProductItem( "Volkswagen", ProductType.CAR);
	    Train train = new Train();
	    Warehouse warehouse = new Warehouse();
	    System.out.println(warehouse);
	    //fillTrain(2, train);

	    while (true) {
	        String s = "";
	        if (train.getItems().toArray().length > 0) s += "5. Push train";
            System.out.println("SELECT:\n1. Show train carriages\n2. Show warehouse items\n3. Create train carriages\n4. Create warehouse's products" + s);
            switch (new Scanner(System.in).nextInt()) {
                case (1) : {
                    System.out.println(train);
                }
                case (2) : {
                    System.out.println(warehouse);
                }
                case (3) : {
                    System.out.print("Enter carriages count: ");
                    fillTrain(new Scanner(System.in).nextInt(), train);
                }
                case (4) : {
                    fillWarehouse(warehouse);
                }
            }
        }
    }
}
