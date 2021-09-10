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
    private static double principle;
    private static double rate;
    private static double investment;
    private static int years;
    private static int compound;

    public static void setPrinciple(double principle) {
        Solution13.principle = principle;
    }

    public static void setCompound(int compound) {
        Solution13.compound = compound;
    }

    public static int getCompound() {
        return compound;
    }

    public static void setRate(double rate) {
        Solution13.rate = rate / 100;
    }

    public static double getPrinciple() {
        return principle;
    }

    public static void setYears(int years) {
        Solution13.years = years;
    }

    public static void calculateInvestment(){
        investment = principle * Math.pow((1 + (rate/compound)),(compound * years));
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

        System.out.print("What is the principal amount? ");
        setPrinciple(input.nextDouble());

        System.out.print("What is the percentage rate? ");
        setRate(input.nextDouble());

        System.out.print("What is the number of years? ");
        setYears(input.nextInt());

        System.out.print("What is the number of times the interest is compounded per year? ");
        setCompound(input.nextInt());

        calculateInvestment();

        String output = "$" + String.format("%.2f",getPrinciple()) + " invested at " + getRate() + "% for " +
                getYears() + " years compounded " + getCompound() + " times per year is $" +
                String.format("%.2f",getInvestment()) + ".";

        System.out.println(output);
    }
}