/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Ask user to enter the order amount.
 *
 *  Ask user to enter the state initials.
 *
 *  Store entered values in respective variables.
 *
 *  If state entered is not "WI" output the entered order amount as the total
 *
 *  Otherwise, if the state is "WI", compute the tax (order amount multiplied by WI tax of 0.055)
 *      and add it to the entered order amount(subtotal).
 *
 *  Output the total if the state is not "WI" or output the subtotal, tax on the order, and total if
 *      the state is "WI".
 */

package exercise14;

import java.util.Objects;
import java.util.Scanner;

public class Solution14 {
    private static final Scanner input = new Scanner(System.in);
    private static final double TAXWI = 0.055;
    private double tax = 0;
    private double orderAmount;

    private void setOrderAmount(String orderAmount) {
        this.orderAmount = round(Double.parseDouble(orderAmount));
    }

    private double getOrderAmount() {
        return this.orderAmount;
    }

    private double getTAXWI() {
        this.tax = this.orderAmount * TAXWI;
        return this.tax;
    }

    private double getTotalAmount() {
        return round(this.orderAmount + this.tax);
    }

    private double round(double inputAmount){
        inputAmount *= 100;
        String amount = inputAmount + "";

        if(!amount.endsWith(".0")){
            int intAmount = (int)inputAmount;
            intAmount += 1;
            inputAmount = intAmount;
        }

        inputAmount /= 100;
        return inputAmount;
    }

    public static void main(String[] args) {
        Solution14 app = new Solution14();
        String output = "";

        System.out.print("What is the order amount? ");
        app.setOrderAmount(input.nextLine());

        System.out.print("What is the state? ");
        String state = Solution14.input.nextLine();

        if(Objects.equals(state, "WI")){
            output += "The subtotal is " + String.format("$%.2f.%n",app.getOrderAmount()) +
                    "The tax is " + String.format("$%.2f.%n", app.round(app.getTAXWI()));
        }

        output += "The total is " + String.format("$%.2f",app.getTotalAmount());

        System.out.println(output);
    }
}