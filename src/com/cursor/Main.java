package com.cursor;


import com.cursor.geomery.PlaneShape.*;
import com.cursor.geomery.Shape;
import com.cursor.geomery.SpaceShape.*;
import com.cursor.shop.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println("First Task");
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

        System.out.println("\n");
        System.out.println("Second Task");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse("30/11/2020");
        FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 14.3, 1400, AgeRestriction.ADULT, date);
        Customer pecata = new Customer("Pecata", 17, 30.00);
        PurchaseManager.processPurchase(cigars, pecata);
        Customer gopeto = new Customer("Gopeto", 18, 0.44);
        PurchaseManager.processPurchase(cigars, gopeto);
        Customer jonny = new Customer("Johny", 21, 15.0);
        PurchaseManager.processPurchase(cigars, jonny);
        System.out.println("Johny's balance: " + jonny.getBalance() + "\n");

        ElectronicsProduct computer = new Computer("Lenovo Legion", 100, 10, AgeRestriction.NONE);
        ElectronicsProduct appliance = new Appliance("VidyoRouter", 40, 60, AgeRestriction.TEENAGER);
        date = sdf.parse("19/10/2021");
        FoodProduct whisky = new FoodProduct("Jack Daniel's", 20.95, 40, AgeRestriction.ADULT, date);
        FoodProduct wine = new FoodProduct("Cabernet Sauvignon", 7.69, 70, AgeRestriction.ADULT, date);

        List<Product> products = new ArrayList<>();
        products.add(cigars);
        products.add(computer);
        products.add(whisky);
        products.add(appliance);
        products.add(wine);
        String name = products.stream().
                filter(product -> product instanceof Expirable)
                .sorted(Comparator.comparing(product -> ((Expirable) product)
                        .getExpirationDate()))
                .findFirst()
                .map(Product::getName)
                .get();
        System.out.println("Expirable product with the soonest date of expiration: " + name);
        System.out.println("Products with age restriction adult, sorted by price");
        products.stream()
                .filter(product -> product.getAgeRestriction() == AgeRestriction.ADULT)
                .sorted(Comparator.comparing(Product::getPrice))
                .map(product -> product.getName() + " " + product.getPrice())
                .forEach(System.out::println);


        date = sdf.parse("27/10/2020");
        FoodProduct bananas = new FoodProduct("Baby Bananas", 3.2, 40, AgeRestriction.NONE, date);

    }
}
