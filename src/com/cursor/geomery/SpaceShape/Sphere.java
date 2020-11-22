package com.cursor.geomery.SpaceShape;

import java.util.List;

public class Sphere extends SpaceShape {
    private double radius;

    public Sphere(List<Double> vertices, double radius) {
        super(vertices);
        this.radius = radius;
    }

    @Override
    public List<Double> getVertices() {
        return super.getVertices();
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "vertices: {x = " + getVertices().get(0) +
                ", y = " + getVertices().get(1) +
                ", z = " + getVertices().get(2) +
                "}, area = " + getArea() +
                ", volume = " + getVolume() +
                '}';
    }
}
