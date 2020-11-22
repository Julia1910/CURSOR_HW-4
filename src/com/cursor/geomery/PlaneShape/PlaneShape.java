package com.cursor.geomery.PlaneShape;

import com.cursor.geomery.AreaMeasurable;
import com.cursor.geomery.Shape;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {


    public PlaneShape(List<Double> vertices) {
        super(vertices);
    }

    @Override
    public List<Double> getVertices() {
        return super.getVertices();
    }

    public double getDistance(PlaneShape shape) {
        return Math.sqrt(Math.pow(super.getVertices().get(0) - shape.getVertices().get(0), 2) +
                Math.pow(super.getVertices().get(1) - shape.getVertices().get(1), 2));
    }

    @Override
    public String toString() {
        return "PlaneShape{" +
                "vertices: x = " + super.getVertices().get(0) +
                ", y = " + super.getVertices().get(1) +
                '}';
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
