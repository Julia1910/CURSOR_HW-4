package com.cursor.geomery.SpaceShape;

import java.util.List;

public class Cuboid extends SpaceShape {
    private double width;
    private double height;
    private double depth;

    public Cuboid(List<Double> vertices, double width, double height, double depth) {
        super(vertices);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public List<Double> getVertices() {
        return super.getVertices();
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
                "vertices: {x = " + getVertices().get(0) +
                ", y = " + getVertices().get(1) +
                ", z = " + getVertices().get(2) +
                "}, area = " + getArea() +
                ", volume = " + getVolume() +
                '}';
    }
}
