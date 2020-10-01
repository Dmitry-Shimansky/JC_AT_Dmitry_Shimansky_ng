package main.java.project.vessel;

import java.io.Serializable;

public class VesselBox<T> implements Serializable {

    private T[] container;

    public VesselBox(T[] container) {
        this.container = container;
    }

    public Integer getItemsCount() {
        return container.length;
    }
}