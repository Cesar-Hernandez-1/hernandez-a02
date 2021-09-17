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
    private static final Scanner input = new Scanner(System.in);
    private double cFrom;
    private double cTo;
    private double rate;

    private double getcTo() {
        return this.cTo;
    }

    private double getcFrom() {
        return this.cFrom;
    }

    private void setcFrom(double cFrom) {
        this.cFrom = cFrom;
    }

    private double getRate() {
        return this.rate;
    }

    private void setRate(double rate) {
        this.rate = rate;
    }

    private void calculateCTo(){
        this.cTo = rate * cFrom;
    }

    public static void main(String[] args) {
        Solution11 app = new Solution11();

        System.out.print("How many euros are you exchanging? ");
        app.setcFrom(input.nextDouble());

        System.out.print("What is the exchange rate? ");
        app.setRate(input.nextDouble());

        app.calculateCTo();

        String output = String.format("%.2f",app.getcFrom()) + " euros at an exchange rate of " + app.getRate() +
                " is " + String.format("%.2f",app.getcTo()) + " U.S. dollars.";

        System.out.println(output);
    }
}