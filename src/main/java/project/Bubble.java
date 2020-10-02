package main.java.project;

import java.io.Serializable;

public class Bubble implements Serializable {

    private final double VOLUME = 0.3;
    private String gas = "CO2";

    public Bubble(String gas) {
        this.gas = gas;
        System.out.println(String.format(" bubbles: %s added", gas));
    }

    public static void cramp() {
        System.out.println(" Cramp!");
    }

    public double getVOLUME() {
        return VOLUME;
    }
}

