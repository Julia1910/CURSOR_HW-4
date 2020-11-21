package com.cursor.classes.SpaceShape;

import com.cursor.classes.AreaMeasurable;
import com.cursor.classes.Shape;

import java.util.List;

abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    private List<Double> vertices;


    public SpaceShape(List<Double> vertices) {
        super(vertices);
        this.vertices = vertices;
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
                "vertices: x = " + vertices.get(0) +
                ", y = " + vertices.get(1) +
                ", z = " + vertices.get(2) +
                '}';
    }
}