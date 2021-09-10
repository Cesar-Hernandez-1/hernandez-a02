/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Ask user to enter the order amount.
 *  Ask user to enter the state initials.
 *  Store entered values in respective variables.
 *  If state entered is not "WI" output the entered order amount as the total
 *  Otherwise, if the state is "WI", compute the tax (order amount multiplied by WI tax of 0.055)
 *      and add it to the entered order amount(subtotal).
 *  Output the total if the state is not "WI" or output the subtotal, tax on the order, and total if
 *      the state is "WI".
 */

package exercise14;

import java.util.Objects;
import java.util.Scanner;

public class Solution14 {
    private static final double TAXWI = 0.055;
    private static double orderAmount;

    public static void setOrderAmount(String orderAmount) {
        Solution14.orderAmount = Double.parseDouble(orderAmount);
    }

    public static double getOrderAmount() {
        return orderAmount;
    }

    public static double getTAXWI() {
        return orderAmount * TAXWI;
    }

    public static double getTotalAmount() {
        return orderAmount + (orderAmount * TAXWI);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String output;

        System.out.print("What is the order amount? ");
        setOrderAmount(input.nextLine());

        System.out.print("What is the state? ");
        String state = input.nextLine();

        if(!(Objects.equals(state, "WI"))){
            output = "The total is $" + String.format("%.2f",getOrderAmount());
        }else{
            output = "The subtotal is $" + String.format("%.2f.%n",getOrderAmount()) +
                    "The tax is $" + String.format("%.2f.%n", getTAXWI()) +
                    "The total is $" + String.format("%.2f.",getTotalAmount());
        }

        System.out.println(output);
    }
}