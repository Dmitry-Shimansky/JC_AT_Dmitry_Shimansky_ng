package main.java.project.vessel;

import main.java.project.material.Glass;
import main.java.project.material.Material;
import main.java.project.material.Plastic;
import main.java.project.stuff.Transformable;

public class Cup extends Vessel implements Containable {
    public Cup(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }

    public Cup() {
        this(1,1,1,new Plastic(1,"red",1));
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
