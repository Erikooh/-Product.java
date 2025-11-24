// Classes & Objects - Question 2: Product with Discount
// Author: Erick
// Date: Nov 24, 2025

import java.util.Scanner;

public class Product {
    // Private attributes
    private String name;
    private double price;

    // Constructor to set both attributes
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to apply discount
    public void applyDiscount(double percentage) {
        // Reduce price by given percentage
        price = price - (price * (percentage / 100));
    }

    // Method to return updated price
    public double getPrice() {
        return price;
    }

    // Main method to test Product class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Product object
        Product product = new Product("Laptop", 1000.00);

        // Ask user for discount percentage
        System.out.print("Enter discount percentage: ");
        double discount = scanner.nextDouble();

        // Apply discount
        product.applyDiscount(discount);

        // Display new price
        System.out.println("New price of " + product.name + ": $" + product.getPrice());

        scanner.close();
    }
}
