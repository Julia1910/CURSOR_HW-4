package com.cursor.classes;

import java.util.List;

public class Triangle extends PlaneShape {
    private List<Double> vertices;
    private double x;
    private double y;
    private double z;

    public Triangle(List<Double> vertices, double x, double y, double z) {
        super(vertices);
        this.vertices = vertices;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public List<Double> getVertices() {
        return vertices;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double getPerimeter() {
        return x + y + z;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "vertices: {x = " + vertices.get(0) +
                ", y = " + vertices.get(1) +
                "}, perimeter = " + getPerimeter() +
                ", area = " + getArea() +
                '}';
    }

}
