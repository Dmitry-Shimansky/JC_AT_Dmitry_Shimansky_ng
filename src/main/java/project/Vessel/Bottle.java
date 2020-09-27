package main.java.project.vessel;

import main.java.project.Bubble;
import main.java.project.material.Glass;
import main.java.project.SparklingWater;
import main.java.project.staff.Transformable;

public class Bottle extends Vessel implements Containable {

    private double volume;
    private boolean opened;
    private SparklingWater water;

    public Bottle(double volume, int temperature, double riseTemperature) {
        super(volume, temperature, riseTemperature, riseTemperature, 2.5, 1, new Glass(1.1,"transparent",1.5));

        water = new SparklingWater(riseTemperature);

        Bubble[] bubbleCount = new Bubble[(int) (volume * 10000)];
        water.pump(bubbleCount);
        warm(temperature);
        open();
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

    public void open() {
        if (!opened) {
            opened = true;
            System.out.println(String.format("Bottle opened: %s", opened));
            water.setOpened();
        }
    }

    @Override
    public void close() {

    }

    public void warm(int temperature) {
        water.setTemperature(temperature);
        System.out.println(String.format("Warming water to: %s degrees", temperature));
    }

    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {
        this.water = water;
    }
}
