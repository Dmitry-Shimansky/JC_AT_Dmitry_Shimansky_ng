package main.java.project.vessel;

import java.io.Serializable;
import java.lang.reflect.Field;

public class Warehouse implements Serializable {

    private VesselBox<Bottle> bottle;
    private VesselBox<Cup> cup;

    public Warehouse(int number) {
        this.bottle = new VesselBox<Bottle>(new Bottle[number]);
        this.cup = new VesselBox<Cup>(new Cup[number]);

        Field[] fields = Warehouse.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }

//    private static void bottleAndCupCreater(int number) {
//        Warehouse bottleAndCup = new Warehouse(number);
//    }

}
