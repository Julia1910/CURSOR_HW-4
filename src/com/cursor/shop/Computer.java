package com.cursor.shop;

public class Computer extends ElectronicsProduct {


    public Computer(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction, 24);
    }

    @Override
    public double getPrice() {
        if (super.getQuantity() > 1000) {
            return super.getPrice() * 0.95;
        }
        return super.getPrice();
    }

    @Override
    public int getGuaranteePeriod() {
        return super.getGuaranteePeriod();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public void setQuantity(int quantity) {
        super.setQuantity(quantity);
    }

    @Override
    public AgeRestriction getAgeRestriction() {
        return super.getAgeRestriction();
    }

    @Override
    public void setAgeRestriction(AgeRestriction ageRestriction) {
        super.setAgeRestriction(ageRestriction);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + getName() +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", ageRestriction=" + getAgeRestriction() +
                "guaranteePeriod=" + getGuaranteePeriod() +
                '}';
    }
}
