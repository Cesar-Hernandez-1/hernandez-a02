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
    private static double principle;
    private static double rate;
    private static double investment;
    private static int years;

    public static void setPrinciple(double principle) {
        Solution12.principle = principle;
    }

    public static void setRate(double rate) {
        Solution12.rate = rate / 100;
    }

    public static void setYears(int years) {
        Solution12.years = years;
    }

    public static void calculateInvestment(){
        investment = principle * (1 + (rate * years));
    }

    public static double getInvestment() {
        return investment;
    }

    public static double getRate() {
        return rate*100;
    }

    public static int getYears() {
        return years;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        setPrinciple(input.nextDouble());

        System.out.print("Enter the rate of interest as a percentage: ");
        setRate(input.nextDouble());

        System.out.print("Enter the number of years: ");
        setYears(input.nextInt());

        calculateInvestment();

        String output = "After " + getYears() + " at " + getRate() + "%, the investment will be worth $" +
                String.format("%.2f", getInvestment()) + ".";

        System.out.println(output);
    }
}