package main.java.tasks.lesson7;

import java.util.Objects;

public class Color {

    private String color;
    private int hex;

    public Color(String color, int hex) {
        this.color = color;
        this.hex = hex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHex() {
        return hex;
    }

    public void setHex(int hex) {
        this.hex = hex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color1 = (Color) o;
        return hex == color1.hex &&
                color.equals(color1.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, hex);
    }
}
