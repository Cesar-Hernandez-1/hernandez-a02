/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Ask user to input principal amount
 *  Ask user to input the rate as a percentage
 *  Ask user to input the number of years
 *  Ask user to input the number of times the interest is compounded per year
 *  Compute investment by the formula: A = P(1 + r/n)^(n*t)
 *  Where:
 *      P is the principal amount
 *      r is the annual rate of interest.
 *      t is the number of years the amount is invested.
 *      n is the number of times the interest is compounded per year.
 *      A is the amount at the end of the investment.
 *  Output the principal amount, the rate as a percentage, number of years to invest,
 *      number of times the interest is compounded per year, and the end investment amount.
 *
 */

package exercise13;

import java.util.Scanner;

public class Solution13 {
    private static final Scanner input = new Scanner(System.in);
    private double principle;
    private double rate;
    private double investment;
    private int years;
    private int compound;

    private void setPrinciple(double principle) {
        this.principle = principle;
    }

    private void setCompound(int compound) {
        this.compound = compound;
    }

    private int getCompound() {
        return this.compound;
    }

    private void setRate(double rate) {
        this.rate = rate;
    }

    private double getPrinciple() {
        return this.principle;
    }

    private void setYears(int years) {
        this.years = years;
    }

    private void calculateInvestment(){
        this.investment = principle * Math.pow((1 + (rate/compound)),(compound * years));
    }

    private double getInvestment() {
        return this.investment;
    }

    private double getRate() {
        return this.rate*100;
    }

    private int getYears() {
        return this.years;
    }

    public static void main(String[] args) {
        Solution13 app = new Solution13();

        System.out.print("What is the principal amount? ");
        app.setPrinciple(input.nextDouble());

        System.out.print("What is the percentage rate? ");
        app.setRate(input.nextDouble() / 100);

        System.out.print("What is the number of years? ");
        app.setYears(input.nextInt());

        System.out.print("What is the number of times the interest is compounded per year? ");
        app.setCompound(input.nextInt());

        app.calculateInvestment();

        String output = String.format("$%.2f",app.getPrinciple()) + " invested at " + app.getRate() + "% for " +
                app.getYears() + " years compounded " + app.getCompound() + " times per year is " +
                String.format("$%.2f",app.getInvestment()) + ".";

        System.out.println(output);
    }
}