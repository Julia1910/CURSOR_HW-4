package com.cursor.geomery.SpaceShape;

import java.util.List;

public class SquarePyramid extends SpaceShape {
    private double baseWidth;
    private double pyramidHeight;

    public SquarePyramid(List<Double> vertices, double baseWidth, double pyramidHeight) {
        super(vertices);
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public List<Double> getVertices() {
        return super.getVertices();
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
                "vertices: {x = " + getVertices().get(0) +
                ", y = " + getVertices().get(1) +
                ", z = " + getVertices().get(2) +
                "}, area = " + getArea() +
                ", volume = " + getVolume() +
                '}';
    }
}
