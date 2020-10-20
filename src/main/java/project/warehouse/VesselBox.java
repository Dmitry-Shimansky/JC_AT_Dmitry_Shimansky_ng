package main.java.project.warehouse;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Objects;

public class VesselBox<T> implements Serializable {

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VesselBox<?> vesselBox = (VesselBox<?>) o;
        return id == vesselBox.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id + 1);
    }

    private final long id;

    public VesselBox() {
        this.id = System.currentTimeMillis();
    }

    private ArrayList<T> container;

    public void fillVesselBox(ArrayList<T> container) {
        this.container = container;
    }

    public ArrayList<T> getContainer() {
        return container;
    }

    public Integer getItemsCount() {
        return container.size();
    }
}