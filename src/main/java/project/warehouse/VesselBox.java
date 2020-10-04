package main.java.project.warehouse;

import java.io.Serializable;
import java.util.ArrayList;

public class VesselBox<T> implements Serializable {

    private ArrayList<T> container;

    public VesselBox(ArrayList<T> container) {
        this.container = container;
    }

    public ArrayList<T> getContainer() {
        return container;
    }

    public Integer getItemsCount() {
        return container.size();
    }
}