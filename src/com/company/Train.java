package com.company;
import java.util.ArrayList;

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

    public ArrayList<CarriageItem> getItems() {
        return this.carriages;
    }

    @Override
    public String toString() {
        String s = "\tTrain's carriages: \n     eZZZZZZZZZZZZ\n" +
                "    ZZZ\"\"\"\"\"\"\"\"\"\"\n" +
                "   Z\" ___ ___________\n" +
                "  II__[Z] | [Z] [z] |\n" +
                " {======|_|~~~~~~~~~|\n" +
                "/oV--VVV'\"`-VV---VV-'\n";
        for (int i = 0; i < carriages.toArray().length; i++) {
            s += i + ". " + carriages.get(i).toString();
            if (carriages.get(i).getSet()) {
                s += carriages.get(i).getItem();
            }
        }
        return s;
    }

    public void push() {}
}
