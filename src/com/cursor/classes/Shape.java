package com.cursor.classes;

import java.util.List;

public abstract class Shape {
    List<Double> vertices;

    public Shape(List<Double> vertices) {
        this.vertices = vertices;
    }
}
