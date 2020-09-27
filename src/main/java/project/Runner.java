package main.java.project;

import main.java.project.vessel.Bottle;
import main.java.project.vessel.Stocktaking;
import main.java.project.vessel.Warehouse;

public class Runner {
    public static void main(String[] args) {

        Warehouse ob = new Warehouse(9);
        new Stocktaking(ob);

        Bottle bottle1 = new Bottle(1.5, 5, 0.1);
        System.out.println("Open bottle1");
//
//        Bottle bottle2 = new Bottle(1.5, 22, 0);
//        System.out.println("Open bottle2");


//        Thread.sleep(5000);
    }
}
