package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.staff.Transformable;

public class Cup extends Vessel implements Containable {
    public Cup(double volume, int temperature, double riseTemperature, double volume1, double diameter, int weight) {
        super(volume, temperature, riseTemperature, volume1, diameter, weight);
    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
