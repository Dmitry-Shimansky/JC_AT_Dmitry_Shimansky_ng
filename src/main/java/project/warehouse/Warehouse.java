package main.java.project.warehouse;

import main.java.project.vessel.Bottle;
import main.java.project.vessel.Cup;
import main.java.project.vessel.Vessel;

import java.io.Serializable;
import java.util.ArrayList;

public class Warehouse<T extends Vessel> implements Serializable {

    ArrayList<VesselBox<T>> boxesWithVessels = new ArrayList<>();
//    ArrayList<VesselBox<Cup>> boxesWithCup = new ArrayList<>();

    public ArrayList<VesselBox<T>> getBoxesWithVessels() {
        return boxesWithVessels;
    }

//    public ArrayList<VesselBox<Cup>> getBoxesWithCup() {
//        return boxesWithCup;
//    }

    public void addBox(VesselBox<T> box) {
        boxesWithVessels.add(box);
    }

//    public void addCups(ArrayList<VesselBox<Cup>> cups) {
//        boxesWithCup.addAll(cups);
//    }
}
