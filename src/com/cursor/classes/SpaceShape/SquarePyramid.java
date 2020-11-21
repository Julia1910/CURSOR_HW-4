package com.cursor.classes.SpaceShape;

import java.util.List;

public class SquarePyramid extends SpaceShape {
    private List<Double> vertices;
    private double baseWidth;
    private double pyramidHeight;

    public SquarePyramid(List<Double> vertices, double baseWidth, double pyramidHeight) {
        super(vertices);
        this.vertices = vertices;
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public double getArea() {
        return 3 * Math.pow(baseWidth, 2);
    }


    @Override
    public double getVolume() {
        return (pyramidHeight * baseWidth * baseWidth) / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" +
                "vertices: {x = " + vertices.get(0) +
                ", y = " + vertices.get(1) +
                ", z = " + vertices.get(2) +
                "} area = " + getArea() +
                " volume = " + getVolume() +
                '}';
    }
}
