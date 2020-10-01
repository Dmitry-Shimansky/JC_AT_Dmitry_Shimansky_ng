package main.java.project.vessel;

import java.io.Serializable;
import java.util.ArrayList;

public class Warehouse implements Serializable {

    ArrayList<VesselBox<Bottle>> bottle = new ArrayList<>();
    ArrayList<VesselBox<Cup>> cup = new ArrayList<>();

    public ArrayList<VesselBox<Bottle>> getBottle() {
        return bottle;
    }

    public ArrayList<VesselBox<Cup>> getCup() {
        return cup;
    }

    public void addBoxes(ArrayList<VesselBox<Bottle>> boxes) {
        bottle.addAll(boxes);
    }

    public void addCups(ArrayList<VesselBox<Cup>> cups) {
        cup.addAll(cups);
    }
}
