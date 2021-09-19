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
    private double currencyFrom;
    private double currencyTo;
    private double rate;

    private double getCurrencyTo() {
        return this.currencyTo;
    }

    private double getCurrencyFrom() {
        return this.currencyFrom;
    }

    private void setCurrencyFrom(double currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    private double getRate() {
        return this.rate;
    }

    private void setRate(double rate) {
        this.rate = rate;
    }

    private void calculateCurrencyTo(){
        this.currencyTo = rate * currencyFrom;
    }

    public static void main(String[] args) {
        Solution11 app = new Solution11();

        System.out.print("How many euros are you exchanging? ");
        app.setCurrencyFrom(input.nextDouble());

        System.out.print("What is the exchange rate? ");
        app.setRate(input.nextDouble());

        app.calculateCurrencyTo();

        String output = String.format("%.2f",app.getCurrencyFrom()) + " euros at an exchange rate of " + app.getRate() +
                " is " + String.format("%.2f",app.getCurrencyTo()) + " U.S. dollars.";

        System.out.println(output);
    }
}