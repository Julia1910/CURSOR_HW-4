package com.cursor.classes;

import java.util.List;

abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    List<Double> vertices;


    public PlaneShape(List<Double> vertices) {
        super(vertices);
    }

    public List<Double> getVertices() {
        return vertices;
    }

    private double getDistance(PlaneShape shape) {
        return Math.sqrt(Math.pow(vertices.get(0) - shape.getVertices().get(0), 2) +
                Math.pow(vertices.get(1) - shape.getVertices().get(1), 2));
    }


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
