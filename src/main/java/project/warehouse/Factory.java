package main.java.project.warehouse;

import main.java.project.vessel.Bottle;
import main.java.project.vessel.Cup;
import main.java.project.vessel.Vessel;

import java.util.ArrayList;

public class Factory {
    //createVesselBox
    //addVesselBox
    //storeBox
    //createVessels

//    public ArrayList<VesselBox<Vessel>> createBoxWithBottle(int vesselCount, int boxCount) {
//
//        ArrayList<VesselBox<Vessel>> container = new ArrayList<>(boxCount);
//
//        for (int i = 0; i < boxCount; i++) {
//            container.add(new VesselBox<Vessel>(createVessels(vesselCount)));
//        }
//        return container;
//    }

//    public ArrayList<VesselBox<Cup>> createBoxWithCup(int vesselCount, int boxCount) {
//
//        ArrayList<VesselBox<Cup>> container = new ArrayList<>(boxCount);
//
//        for (int i = 0; i < boxCount; i++) {
//            container.add(new VesselBox<Cup>(addCup(vesselCount)));
//        }
//        return container;
//    }

    private <T> ArrayList<T> createVessels(Class<T> vesselClass, int count) throws IllegalAccessException, InstantiationException {
        ArrayList<T> container = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            container.add(vesselClass.newInstance());
        }
        System.out.println("Add " + count + " of vessels");
        return container;
    }

    private <T> VesselBox<T> createVesselBox() {
        return new VesselBox<T>();
    }

    public <T> VesselBox<T> addVesselBox(Class<T> vesselClass, int count) throws InstantiationException, IllegalAccessException {
        VesselBox<T> vesselBox = createVesselBox();
        vesselBox.fillVesselBox(createVessels(vesselClass, count));
        System.out.println("Add vessels to a box");
        return vesselBox;
    }

//    private Bottle[] addBottle(int count) {
//        Bottle[] containerOfBottle = new Bottle[count];
//        for (int i = 0; i < containerOfBottle.length; i++) {
//            containerOfBottle[i] = new Bottle(0.5, 5, 0);
//        }
//        System.out.println("Add " + count + " of bottles");
//        return containerOfBottle;
//    }

//    private ArrayList<Cup> addCup(int count) {
//        ArrayList<Cup> containerOfCup = new ArrayList<>(count);
//        for (int i = 0; i < count; i++) {
//            containerOfCup.add(new Cup(0.25, 5, 0, 0, 10, 100));
//        }
//        System.out.println("Add " + count + " of cups");
//        return containerOfCup;
//    }

//    private Cup[] addCup(int count) {
//        Cup[] containerOfCup = new Cup[count];
//        for (int i = 0; i < containerOfCup.length; i++) {
//            containerOfCup[i] = new Cup(0.25, 5, 0, 0, 10, 100);
//        }
//        System.out.println("Add " + count + " of cups");
//        return containerOfCup;
//    }
}