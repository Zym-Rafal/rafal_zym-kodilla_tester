package com.kodilla.collections.sets.homework;

import java.awt.*;
import java.util.Objects;

public class Stamp {

    private String nameOfStamp;
    private Point dimensions;
    private boolean isStamped;

    public Stamp(String nameOfStamp, int width, int height, boolean isStamped) {
        this.nameOfStamp = nameOfStamp;
        this.dimensions = new Point(width, height);
        this.isStamped = isStamped;
    }

    public String getNameOfStamp() {
        return nameOfStamp;
    }

    public Point getDimensions() {
        return dimensions;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Stamp stamp = (Stamp) o;
        return isStamped == stamp.isStamped
                && nameOfStamp.equals(stamp.nameOfStamp)
                && dimensions.equals(stamp.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfStamp, dimensions, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "nameOfStamp='" + nameOfStamp + '\'' +
                ", dimensions=" + dimensions +
                ", isStamped=" + isStamped +
                '}';
    }
}
