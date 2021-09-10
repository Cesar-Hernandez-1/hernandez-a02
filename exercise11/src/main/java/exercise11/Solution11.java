/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Ask user to input the amount of money they have in euros
 *  Ask user to input the exchange rate
 *  Store inputted data in respective variables
 *  Compute US currency by multiplying the exchange rate with the euros' currency
 *  Output the number of euros, exchange rate, and conversion to US dollars.
 */

package exercise11;
import java.util.Scanner;

public class Solution11 {
    private static double cFrom;
    private static double cTo;
    private static double rate;

    public static double getcTo() {
        return cTo;
    }

    public static double getcFrom() {
        return cFrom;
    }

    public static void setcFrom(double cFrom) {
        Solution11.cFrom = cFrom;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Solution11.rate = rate;
    }

    public static void calculateCTo(){
        cTo = rate * cFrom;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        setcFrom(input.nextDouble());

        System.out.print("What is the exchange rate? ");
        setRate(input.nextDouble());

        calculateCTo();

        String output = String.format("%.2f",getcFrom()) + " euros at an exchange rate of " + getRate() +
                " is " + String.format("%.2f",getcTo()) + " U.S. dollars.";

        System.out.println(output);
    }
}