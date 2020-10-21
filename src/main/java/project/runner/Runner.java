package main.java.project.runner;

import main.java.project.vessel.Cup;
import main.java.project.warehouse.Factory;
import main.java.project.vessel.Bottle;
import main.java.project.warehouse.Stocktaking;
import main.java.project.warehouse.VesselBox;
import main.java.project.warehouse.Warehouse;

import java.util.Collection;

public class Runner {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Factory factory = new Factory();
        Warehouse warehouse = new Warehouse();

        warehouse.addBox(factory.addVesselBox(Bottle.class,9));

        Stocktaking.InventoryVesselBoxes(warehouse.getBoxesWithVessels());

//        warehouse.getBoxesWithBottle().stream()
//                .map(VesselBox::getContainer)
//                .flatMap(Collection::stream)
//                .forEach(Bottle::open);
//
//        warehouse.getBoxesWithBottle().get(0).get(4).open();
//        warehouse.getBoxesWithBottle().forEach(b ->b.get(4).open());


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
