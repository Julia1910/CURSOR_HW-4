package com.cursor.geomery;

import java.util.List;

public abstract class Shape {
    List<Double> vertices;

    public Shape(List<Double> vertices) {
        this.vertices = vertices;
    }
}
