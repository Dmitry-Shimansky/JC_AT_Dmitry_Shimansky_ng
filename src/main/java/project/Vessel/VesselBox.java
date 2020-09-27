package main.java.project.vessel;

import main.java.project.material.Material;

import java.io.Serializable;

public class VesselBox<T extends Vessel> implements Serializable {

    private T[] container;

    public VesselBox(T[] container) {
        this.container = container;
    }

}

class Transmiter extends Vessel {
    public Transmiter(double volume, int temperature, double v, double riseTemperature, double diameter, int weight, Material material) {
        super(volume, temperature, v, riseTemperature, diameter, weight, material);
    }
}

class Runner {
    public static void main(String[] args) {
        VesselBox<Transmiter> container1 = new VesselBox(new Transmiter[9]);
        VesselBox<Transmiter> container2 = new VesselBox(new Transmiter[25]);
        VesselBox<Transmiter> container3 = new VesselBox(new Transmiter[36]);
    }
}