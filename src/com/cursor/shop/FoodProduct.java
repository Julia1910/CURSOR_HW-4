package com.cursor.shop;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FoodProduct extends Product implements Expirable {
    private Date expirationDate;


    public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction, Date expirationDate) {
        super(name, price, quantity, ageRestriction);
        Date date = new Date();
        if (expirationDate.after(date)) {
            this.expirationDate = expirationDate;
        } else {
            throw new IllegalArgumentException("You cannot add a product with an unusable expiration date");
        }
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
        Date date = new Date();
        long diffInMilliS = Math.abs(getExpirationDate().getTime() - date.getTime());
        long difference = TimeUnit.DAYS.convert(diffInMilliS, TimeUnit.MILLISECONDS);
        if (difference < 15) {
            return super.getPrice() * 0.7;
        }
        return super.getPrice();
    }

    @Override
    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "name='" + getName() +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", ageRestriction=" + getAgeRestriction() +
                "expirationDate=" + expirationDate +
                '}';
    }
}
