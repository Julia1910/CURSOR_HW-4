package com.cursor.classes.PlaneShape;

import java.util.List;

public class Rectangle extends PlaneShape {
    private List<Double> vertices;
    private double width;
    private double height;


    public Rectangle(List<Double> vertices, double width, double height) {
        super(vertices);
        this.vertices = vertices;
        this.width = width;
        this.height = height;
    }

    @Override
    public List<Double> getVertices() {
        return vertices;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "vertices: {x = " + vertices.get(0) +
                ", y = " + vertices.get(1) +
                "}, perimeter = " + getPerimeter() +
                ", area = " + getArea() +
                '}';
    }
}
