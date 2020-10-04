package main.java.project.runner;

import main.java.project.warehouse.Factory;
import main.java.project.vessel.Bottle;
import main.java.project.warehouse.Stocktaking;
import main.java.project.warehouse.VesselBox;
import main.java.project.warehouse.Warehouse;

import java.util.Collection;

public class Runner {
    public static void main(String[] args) {

        Factory factory = new Factory();
        Warehouse warehouse = new Warehouse();

        warehouse.addBoxes(factory.createBoxWithBottle(9, 2));
        warehouse.addCups(factory.createBoxWithCup(25,3));

        Stocktaking.InventoryBottles(warehouse.getBoxesWithBottle());
        Stocktaking.InventoryCups(warehouse.getBoxesWithCup());

        warehouse.getBoxesWithBottle().stream()
                .map(VesselBox::getContainer)
                .flatMap(Collection::stream)
                .forEach(Bottle::open);


//        Bottle bottle1 = new Bottle(1.5, 5, 0.1);
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Opening bottle1");
//        bottle1.open();
//
//        Bottle bottle2 = new Bottle(1.5, 22, 0);
//        System.out.println("Open bottle2");
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Opening bottle2");
//        bottle2.open();
    }
}
