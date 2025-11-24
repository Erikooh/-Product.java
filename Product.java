// Classes & Objects - Question 2: Product with Discount
// Author: S08-8511-2024
// Date: Nov 24, 2025

import java.util.Scanner;

public class Product {
   
    private String name;
    private double price;

 
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

   
    public void applyDiscount(double percentage) {
       
        price = price - (price * (percentage / 100));
    }

  
    public double getPrice() {
        return price;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
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
