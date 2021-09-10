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

    private static final double TAXRATE = 0.055;
    private static double price;
    private static double subtotal;
    private static double tax;
    private static double total;
    private static int itemQuantity;

    public static void setPrice(String price) {
        Solution10.price = Double.parseDouble(price);
    }

    public static void setItemQuantity(String itemQuantity) {
        Solution10.itemQuantity = Integer.parseInt(itemQuantity);
    }

    public static void calculateCharges(){
        subtotal += (price * itemQuantity);
    }

    public static void calculateTaxes(){
        tax = subtotal * TAXRATE;
        total = subtotal + tax;
    }

    public static double getSubtotal() {
        return subtotal;
    }

    public static double getTax() {
        return tax;
    }

    public static double getTotal() {
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.print("Enter the price if item " + (i+1) + ": ");
            setPrice(input.nextLine());

            System.out.print("Enter the quantity of item " + (i+1) + ": ");
            setItemQuantity(input.nextLine());

            calculateCharges();
        }

        calculateTaxes();

        String output = "Subtotal: $" + String.format("%.2f",getSubtotal()) + "\nTax: $" + String.format("%.2f",getTax())
                + "\nTotal: $" + String.format("%.2f",getTotal());

        System.out.println(output);
    }
}