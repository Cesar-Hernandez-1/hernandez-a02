/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 * Pseudocode:
 * Delcare constant double variable named TAXRATE to hold constant tax rate of 0.055
 * Ask user to enter the price and quantity of an item three times
 * For each item price and quantity entered, add to subtotal
 * After user entered three item prices and quantities, calculate tax from subtotal
 * Output to user the subtotal, tax on the order, and the total cost (subtotal with tax)
 *      of the order.
 */

package exercise10;
import java.util.Scanner;

public class Solution10 {
    private static final Scanner input = new Scanner(System.in);
    private static final double TAXRATE = 0.055;
    private double price;
    private double subtotal;
    private double tax;
    private double total;
    private int itemQuantity;

    private void setPrice(String price) {
        this.price = Double.parseDouble(price);
    }

    private void setItemQuantity(String itemQuantity) {
        this.itemQuantity = Integer.parseInt(itemQuantity);
    }

    private void calculateCharges(){
        this.subtotal += (price * itemQuantity);
    }

    private void calculateTaxes(){
        this.tax = subtotal * TAXRATE;
        this.total = subtotal + tax;
    }

    private double getSubtotal() {
        return this.subtotal;
    }

    private double getTax() {
        return this.tax;
    }

    private double getTotal() {
        return this.total;
    }

    public static void main(String[] args) {
        Solution10 app = new Solution10();

        for (int i = 0; i < 3; i++){
            System.out.print("Enter the price if item " + (i+1) + ": ");
            app.setPrice(input.nextLine());

            System.out.print("Enter the quantity of item " + (i+1) + ": ");
            app.setItemQuantity(input.nextLine());

            app.calculateCharges();
        }

        app.calculateTaxes();

        String output = "Subtotal: $" + String.format("%.2f",app.getSubtotal()) + "\nTax: $" + String.format("%.2f",app.getTax())
                + "\nTotal: $" + String.format("%.2f",app.getTotal());

        System.out.println(output);
    }
}