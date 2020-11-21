package com.cursor;


import com.cursor.classes.PlaneShape.*;
import com.cursor.classes.Shape;
import com.cursor.classes.SpaceShape.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double> vertices = new ArrayList<>(2);
        vertices.add(2.0);
        vertices.add(4.0);
        PlaneShape circle = new Circle(vertices, 20);
        vertices = new ArrayList<>(2);
        vertices.add(0.0);
        vertices.add(-3.0);
        PlaneShape rectangle = new Rectangle(vertices, 4, 5);
        vertices = new ArrayList<>(2);
        vertices.add(4.0);
        vertices.add(-1.0);
        PlaneShape triangle = new Triangle(vertices, 3, 4, 5);

        vertices = new ArrayList<>(3);
        vertices.add(0.0);
        vertices.add(4.0);
        vertices.add(-1.0);
        SpaceShape cuboid = new Cuboid(vertices, 4, 7, 5);
        vertices = new ArrayList<>(3);
        vertices.add(-4.0);
        vertices.add(2.0);
        vertices.add(1.0);
        SpaceShape sphere = new Sphere(vertices, 9);
        vertices = new ArrayList<>(3);
        vertices.add(4.0);
        vertices.add(0.0);
        vertices.add(-3.0);
        SpaceShape squarePyramid = new SquarePyramid(vertices, 4, 3);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);
        shapes.add(cuboid);
        shapes.add(sphere);
        shapes.add(squarePyramid);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        System.out.println("Distance between circle and rectangle is " + circle.getDistance(rectangle));
        System.out.println("Distance between rectangle and triangle is " + rectangle.getDistance(triangle));
        System.out.println("Distance between triangle and circle is " + triangle.getDistance(circle));
    }
}
