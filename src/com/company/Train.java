package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Train {
    private ArrayList<CarriageItem> carriages;

    public Train(ArrayList<CarriageItem> products) {
        this.carriages = products;
    }

    public Train() {
        this.carriages = new ArrayList<CarriageItem>();
    }

    public void addItem(CarriageItem item) {
        this.carriages.add(item);
    }

    public boolean putProduct(ProductItem item) {

        boolean isSuccess = false;

        for (int i = 0; i < carriages.toArray().length; i++) {
            if (!carriages.get(i).getSet() && item.getType() == carriages.get(i).getType()) {
                carriages.get(i).setItem(item);
                System.out.println(item + " is now in the carriage!");
                isSuccess = true;
            }
        }
        return isSuccess;
    }

    public ArrayList<CarriageItem> getItems() {
        return this.carriages;
    }

    public CarriageItem generateCarriage() {

        for (int i = 0; i < ProductType.values().length; i++) {
            System.out.print(i + ". " + ProductType.values()[i] + '\n');
        }
        return new CarriageItem(ProductType.values()[new Scanner(System.in).nextInt()]);
    }

    public void fillTrain() {
        System.out.print("Enter carriages count: ");
        int n = new Scanner(System.in).nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Select product type for carriage " + i + ": ");
            this.addItem(generateCarriage());
        }
    }

    public void push() {
        System.out.println("\nThe train has left!\n\n");
        this.carriages = new ArrayList<CarriageItem>();
    }

    @Override
    public String toString() {
        String item = "";
        String s = "\tTrain's carriages: \n     eZZZZZZZZZZZZ\n" +
                "    ZZZ\"\"\"\"\"\"\"\"\"\"\n" +
                "   Z\" ___ ___________\n" +
                "  II__[Z] | [Z] [z] |\n" +
                " {======|_|~~~~~~~~~|\n" +
                "/oV--VVV'\"`-VV---VV-'\n";
        for (int i = 0; i < carriages.toArray().length; i++) {
            s += i + ". " + carriages.get(i).toString();
            if (carriages.get(i).getSet()) {
                item += carriages.get(i).getItem();
            }
        }
        return s;
    }


}
