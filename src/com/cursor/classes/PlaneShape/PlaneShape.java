package com.cursor.classes.PlaneShape;

import com.cursor.classes.AreaMeasurable;
import com.cursor.classes.Shape;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    List<Double> vertices;


    public PlaneShape(List<Double> vertices) {
        super(vertices);
        this.vertices = vertices;
    }

    public List<Double> getVertices() {
        return vertices;
    }

    public double getDistance(PlaneShape shape) {
        return Math.sqrt(Math.pow(vertices.get(0) - shape.getVertices().get(0), 2) +
                Math.pow(vertices.get(1) - shape.getVertices().get(1), 2));
    }

    @Override
    public String toString() {
        return "PlaneShape{" +
                "vertices: x = " + vertices.get(0) +
                ", y = " + vertices.get(1) +
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
