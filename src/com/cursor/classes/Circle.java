package com.cursor.classes;

import java.util.List;

public class Circle extends PlaneShape {
    private List<Double> vertices;
    private double radius;

    public Circle(List<Double> vertices, double radius) {
        super(vertices);
        this.vertices = vertices;
        this.radius = radius;
    }

    @Override
    public List<Double> getVertices() {
        return vertices;
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
                "vertices: {x = " + vertices.get(0) +
                ", y = " + vertices.get(1) +
                "}, perimeter = " + getPerimeter() +
                ", area = " + getArea() +
                '}';
    }
}
