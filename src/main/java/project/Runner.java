package main.java.project;

import main.java.project.vessel.Bottle;
import main.java.project.vessel.Stocktaking;
import main.java.project.vessel.VesselBox;
import main.java.project.vessel.Warehouse;
import java.util.ArrayList;
import java.util.Collection;

public class Runner {
    public static void main(String[] args) {

        Factory factory = new Factory();
        Warehouse warehouse = new Warehouse();

        warehouse.addBoxes(factory.createBoxWithBottle(9, 2));
        warehouse.addCups(factory.createBoxWithCup(25,3));

        Stocktaking.InventoryBottles(warehouse.getBoxesWithBottle());
        Stocktaking.InventoryCups(warehouse.getBoxesWithCup());

        for (VesselBox<Bottle> bottleVesselBox : warehouse.getBoxesWithBottle()) {
            ArrayList<Bottle> container = bottleVesselBox.getContainer();
            for (Bottle bottle : container) {
                bottle.open();
            }
        }


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
