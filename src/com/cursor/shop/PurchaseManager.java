package com.cursor.shop;

public class PurchaseManager {
    public static void processPurchase(Product product, Customer customer) {
        if (product.getQuantity() < 1) {
            System.out.println("The product is out of stock");
            return;
        }
        if (customer.getAge() < product.getAgeRestriction().getMinAge()) {
            System.out.println("You are too young to buy this product!");
            return;
        }
        if (customer.getBalance() < product.getPrice()) {
            System.out.println("You do not have enough money to buy this product!");
            return;
        }
        product.setQuantity(product.getQuantity() - 1);
        customer.setBalance(customer.getBalance() - product.getPrice());
        System.out.println("Congratulations! Purchase completed successfully!");
    }
}
