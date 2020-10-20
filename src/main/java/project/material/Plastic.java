package main.java.project.material;

import java.io.Serializable;

public class Plastic extends Material implements Serializable {
    public Plastic(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }

    public Plastic() {
        this(0.2,"white",1800);
    }
}
