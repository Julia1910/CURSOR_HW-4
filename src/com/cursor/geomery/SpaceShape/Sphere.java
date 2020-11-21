package com.cursor.geomery.SpaceShape;

import java.util.List;

public class Sphere extends SpaceShape {
    private List<Double> vertices;
    private double radius;

    public Sphere(List<Double> vertices, double radius) {
        super(vertices);
        this.vertices = vertices;
        this.radius = radius;
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
                "vertices: {x = " + vertices.get(0) +
                ", y = " + vertices.get(1) +
                ", z = " + vertices.get(2) +
                "}, area = " + getArea() +
                ", volume = " + getVolume() +
                '}';
    }
}
