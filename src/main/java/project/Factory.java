package main.java.project;

import main.java.project.vessel.Bottle;
import main.java.project.vessel.Cup;
import main.java.project.vessel.VesselBox;
import java.util.ArrayList;

public class Factory {

    public ArrayList<VesselBox<Bottle>> createBoxWithBottle(int vesselCount, int boxCount) {

        ArrayList<VesselBox<Bottle>> container = new ArrayList<>(boxCount);

        for (int i = 0; i < boxCount; i++) {
            container.add(new VesselBox<Bottle>(addBottle(vesselCount)));
        }
        return container;
    }

    public ArrayList<VesselBox<Cup>> createBoxWithCup(int vesselCount, int boxCount) {

        ArrayList<VesselBox<Cup>> container = new ArrayList<>(boxCount);

        for (int i = 0; i < boxCount; i++) {
            container.add(new VesselBox<Cup>(addCup(vesselCount)));
        }
        return container;
    }

    private Bottle[] addBottle(int count) {
        Bottle[] containerOfBottle = new Bottle[count];
        for (int i = 0; i < containerOfBottle.length; i++) {
            containerOfBottle[i] = new Bottle(0.5, 5, 0);
        }
        System.out.println("Add " + count + " of bottles");
        return containerOfBottle;
    }

    private Cup[] addCup(int count) {
        Cup[] containerOfCup = new Cup[count];
        for (int i = 0; i < containerOfCup.length; i++) {
            containerOfCup[i] = new Cup(0.25, 5, 0, 0, 10, 100);
        }
        System.out.println("Add " + count + " of cups");
        return containerOfCup;
    }
}