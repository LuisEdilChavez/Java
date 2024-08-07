/*
 * Luis Chavez CIS 166 3/2/24
 * Description: This program will test every method of the RetailProduct class 
 * to check functionality and will validate results with use of catch and try.
 * This file also implements try-catch blocks to check for valid inputs in each of the 
 * 3 fields, (price, name ,quantity).
 */


package RetailProduct;
import java.text.DecimalFormat;
import java.util.Scanner;

public class testRetailProduct {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String formattedPrice = ""; // Initialize formattedPrice here

        // Make instance of RetailProduct class
        RetailProduct product = new RetailProduct();

        try {
            // Try-catch block for product name
            System.out.println("Enter the product name:");
            String name = userInput.nextLine();
            // Set the name of the product using setter method
            product.name = name;
        	} 
        catch (java.util.InputMismatchException e) {
            System.out.println("Invalid Input for the item's name. Please enter character strings only!");
            userInput.nextLine();
            System.exit(1);
        	}

        try {
            // Try-catch block to check input type for quantity
            System.out.println("Enter the quantity:");
            int quantity = userInput.nextInt();
            // Set the quantity of the product using setter method
            product.quantity = quantity;
        	} 
        catch (java.util.InputMismatchException e) {
            System.out.println("Wrong input for quantity. Please enter a valid value.");
            userInput.nextLine();
            System.exit(1);
        }

        try {
            // Try-catch block to check for correct input on the price
            System.out.println("Enter the product price:");
            double price = userInput.nextDouble();
            // Set the price of the product using setter method
            product.price = price;

            // If price is <= 0, illegal argument exception is thrown
            if (price <= 0) {
                throw new IllegalArgumentException("Price must be greater than zero! No Freebies!");
            }

            // Format the price to display .00 in the terminal. Took a while to figure out , will fix later.
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            formattedPrice = decimalFormat.format(price); 
            System.out.println("Product Price: $" + formattedPrice);

        	} 
        catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input for price. Please enter a valid numeric value.");
            userInput.nextLine();
            System.exit(1);
        	} 
        catch (IllegalArgumentException e) {
            System.out.println("Wrong input for price!: " + e.getMessage());
            userInput.nextLine();
            System.exit(1);
        	} 
        finally {
            // Close the scanner to prevent memory leaks
            userInput.close();
        		}

        // Output product details
        System.out.println("Product Name: " + product.name);
        System.out.println("Product Quantity: " + product.quantity);
        System.out.println("Product Price: $" + formattedPrice);
   }
}

