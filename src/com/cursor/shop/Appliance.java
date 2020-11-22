package com.cursor.shop;

public class Appliance extends ElectronicsProduct{


    public Appliance(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction, 6);
    }

    @Override
    public double getPrice() {
        if (super.getQuantity() < 50) {
            return super.getPrice()*1.05;
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
}
