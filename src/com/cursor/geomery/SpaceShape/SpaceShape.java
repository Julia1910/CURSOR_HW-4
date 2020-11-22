package com.cursor.geomery.SpaceShape;

import com.cursor.geomery.AreaMeasurable;
import com.cursor.geomery.Shape;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(List<Double> vertices) {
        super(vertices);
    }

    @Override
    public List<Double> getVertices() {
        return super.getVertices();
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "SpaceShape{" +
                "vertices: {x = " + getVertices().get(0) +
                ", y = " + getVertices().get(1) +
                ", z = " + getVertices().get(2) +
                "}, area = " + getArea() +
                ", volume = " + getVolume() +
                '}';
    }
}
