package com.cursor.classes;

import java.util.List;

public class Circle extends PlaneShape {
    private double radius;

    public Circle(List<Double> vertices, double radius) {
        super(vertices);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
