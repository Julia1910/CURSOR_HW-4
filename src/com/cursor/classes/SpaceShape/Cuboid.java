package com.cursor.classes.SpaceShape;

import java.util.List;

public class Cuboid extends SpaceShape {
    private List<Double> vertices;
    private double width;
    private double height;
    private double depth;

    public Cuboid(List<Double> vertices, double width, double height, double depth) {
        super(vertices);
        this.vertices = vertices;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * height + height * depth + depth * width);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "vertices: {x = " + vertices.get(0) +
                ", y = " + vertices.get(1) +
                ", z = " + vertices.get(2) +
                "} area = " + getArea() +
                " volume = " + getVolume() +
                '}';
    }
}
