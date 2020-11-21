package com.cursor.classes;

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
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
