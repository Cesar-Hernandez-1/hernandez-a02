/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Ask user for the principle
 *  Ask user to input the interest as a percentage
 *  Ask user the number of years
 *  Store inputted variables in respective variables
 *  Calculate the interest with the formula: principle * (1 + (rate * years))
 *  Output the number of years, interest rate as a percentage, and the worth of the investment
 *      after the calculation.
 *
 */

package exercise12;

import java.util.Scanner;

public class Solution12 {
    private static final Scanner input = new Scanner(System.in);
    private double principle;
    private double rate;
    private double investment;
    private int years;

    private void setPrinciple(double principle) {
        this.principle = principle;
    }

    private void setRate(double rate) {
        this.rate = rate;
    }

    private void setYears(int years) {
        this.years = years;
    }

    private void calculateInvestment(){
        this.investment = principle * (1 + (rate * years));
    }

    private double getInvestment() { return this.investment; }

    private double getRate() {
        return this.rate*100;
    }

    private int getYears() {
        return this.years;
    }

    public static void main(String[] args) {
        Solution12 app = new Solution12();

        System.out.print("Enter the principal: ");
        app.setPrinciple(input.nextDouble());

        System.out.print("Enter the rate of interest as a percentage: ");
        app.setRate(input.nextDouble() / 100);

        System.out.print("Enter the number of years: ");
        app.setYears(input.nextInt());

        app.calculateInvestment();

        String output = "After " + app.getYears() + " at " + app.getRate() + "%, the investment will be worth " +
                String.format("$%.2f", app.getInvestment()) + ".";

        System.out.println(output);
    }
}