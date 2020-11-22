package com.cursor.geomery.PlaneShape;

import java.util.List;

public class Rectangle extends PlaneShape {
    private double width;
    private double height;


    public Rectangle(List<Double> vertices, double width, double height) {
        super(vertices);
        this.width = width;
        this.height = height;
    }

    @Override
    public List<Double> getVertices() {
        return super.getVertices();
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
                "vertices: {x = " + getVertices().get(0) +
                ", y = " + getVertices().get(1) +
                "}, perimeter = " + getPerimeter() +
                ", area = " + getArea() +
                '}';
    }
}
