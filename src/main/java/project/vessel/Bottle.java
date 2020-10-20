package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.material.Plastic;
import main.java.project.stuff.Bubble;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Transformable;

import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel implements Containable {

    private double volume; //Зачем здесь эта переменная ?
    private boolean opened;
    private SparklingWater water;

    public Bottle(double volume, int temperature, double riseTemperature, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);

        water = new SparklingWater(riseTemperature);

        ArrayList<Bubble> bubbleCount = new ArrayList<Bubble>((int) (volume * 10000));
        for (int i = 0; i < (int) (volume * 10000); i++) {
            System.out.print(i + 1);
            bubbleCount.add(new Bubble("CO2"));
        }

//        Bubble[] bubbleCount = new Bubble[(int) (volume * 10000)];
//        for (int i = 0; i < bubbleCount.length; i++) {
//            bubbleCount[i] = new Bubble("CO2");
//        }

        water.pump(bubbleCount);
        warm(temperature);
    }

    public Bottle() {
        this(1, 5, 0.1, 1, 2, new Plastic(1, "purple", 1));
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
