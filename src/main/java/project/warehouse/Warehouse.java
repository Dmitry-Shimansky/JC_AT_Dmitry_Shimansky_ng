package main.java.project.warehouse;

import main.java.project.vessel.Bottle;
import main.java.project.vessel.Cup;

import java.io.Serializable;
import java.util.ArrayList;

public class Warehouse implements Serializable {

    ArrayList<VesselBox<Bottle>> boxesWithBottle = new ArrayList<>();
    ArrayList<VesselBox<Cup>> boxesWithCup = new ArrayList<>();

    public ArrayList<VesselBox<Bottle>> getBoxesWithBottle() {
        return boxesWithBottle;
    }

    public ArrayList<VesselBox<Cup>> getBoxesWithCup() {
        return boxesWithCup;
    }

    public void addBoxes(ArrayList<VesselBox<Bottle>> boxes) {
        boxesWithBottle.addAll(boxes);
    }

    public void addCups(ArrayList<VesselBox<Cup>> cups) {
        boxesWithCup.addAll(cups);
    }
}
