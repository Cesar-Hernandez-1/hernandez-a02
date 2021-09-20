/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 * Pseudocode:
 * Declare constant double variable named TAXRATE to hold constant tax rate of 0.055
 *
 * Ask user to enter the price and quantity of an item three times
 *
 * For each item price and quantity entered, store strings
 *
 * After user entered three item prices and quantities, calculate subtotal and relative tax
 *
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

    public void setPrice(String price) {
        this.price = Double.parseDouble(price);
    }

    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = Integer.parseInt(itemQuantity);
    }

    public void calculateCharges(){
        this.subtotal += (price * itemQuantity);
    }

    public void calculateTaxes(){
        this.tax = subtotal * TAXRATE;
        this.total = subtotal + tax;
    }

    public double getSubtotal() {
        return this.subtotal;
    }

    public double getTax() {
        return this.tax;
    }

    public double getTotal() {
        return this.total;
    }

    public static void main(String[] args) {
        Solution10 app = new Solution10();

        String [] prices = new String[3];
        String [] quantitys = new String[3];

        for (int i = 0; i < 3; i++){
            System.out.print("Enter the price of item " + (i+1) + ": ");
            prices[i] = input.nextLine();

            System.out.print("Enter the quantity of item " + (i+1) + ": ");
            quantitys[i] = input.nextLine();
        }

        for (int i = 0; i < 3; i++){
            app.setPrice(prices[i]);
            app.setItemQuantity(quantitys[i]);
            app.calculateCharges();
        }

        app.calculateTaxes();

        String output = "Subtotal: $" + String.format("%.2f",app.getSubtotal()) + "\nTax: $" + String.format("%.2f",app.getTax())
                + "\nTotal: $" + String.format("%.2f",app.getTotal());

        System.out.println(output);
    }
}