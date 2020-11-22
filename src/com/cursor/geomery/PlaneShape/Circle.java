package com.cursor.geomery.PlaneShape;

import java.util.List;

public class Circle extends PlaneShape {
    private double radius;

    public Circle(List<Double> vertices, double radius) {
        super(vertices);
        this.radius = radius;
    }

    @Override
    public List<Double> getVertices() {
        return super.getVertices();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "vertices: {x = " + getVertices().get(0) +
                ", y = " + getVertices().get(1) +
                "}, perimeter = " + getPerimeter() +
                ", area = " + getArea() +
                '}';
    }
}
