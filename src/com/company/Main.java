package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    ArrayList<ProductItem>  storage= new ArrayList<ProductItem>();
	    ArrayList<CarriageItem> carriages = new ArrayList<CarriageItem>();

	    storage.add(new ProductItem("water", ProductType.LIQUID));
		storage.add(new ProductItem("Volkswagen", ProductType.CAR));

		carriages.add(new CarriageItem(ProductType.CAR));
		carriages.add(new CarriageItem(ProductType.LIQUID));

		boolean isSuccess = false;

	    Warehouse warehouse = new Warehouse(storage);
		Train train = new Train(carriages);
	    Exchanger exchanger = new Exchanger(warehouse, train);

	    while (true) {

			String s = "";

	    	if (isSuccess) {
	    		s += "6) Push train\n";
			}
	    	System.out.print("SELECT: \n1) Show train's carriages\n2) Show warehouse's items\n3) Fill warehouse\n4) Create carriages\n5) Load train\n" + s);
	    	int target = new Scanner(System.in).nextInt();
	    	if (target == 1) {
	    		System.out.println(train);
			} else if (target == 2) {
	    		System.out.println(warehouse);
			} else if (target == 3) {
	    		warehouse.fillWarehouse();
			} else if (target == 4) {
	    		train.fillTrain();
			} else if (target == 5) {
	    		if (warehouse.getItems().toArray().length != 0 && train.getItems().toArray().length != 0) {
					isSuccess = exchanger.fromWarehouseToTrain();
				} else {
	    			System.out.println("Warehouse is empty or there are no empty carriages!");
				}
			} else if (target == 6 && isSuccess) {
	    		train.push();
	    		break;
			}
		}
    }
}
