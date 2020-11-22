package com.cursor.shop;

public abstract class ElectronicsProduct extends Product {
    private int guaranteePeriod;

    public ElectronicsProduct(String name, double price, int quantity, AgeRestriction ageRestriction, int guaranteePeriod) {
        super(name, price, quantity, ageRestriction);
        this.guaranteePeriod = guaranteePeriod;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
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
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "ElectronicsProduct{" +
                "name='" + getName() +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", ageRestriction=" + getAgeRestriction() +
                "guaranteePeriod=" + guaranteePeriod +
                '}';
    }
}
