/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Declare constant double variables to hold alcohol distribution ratios for men (0.73) and women (0.66)
 *  Ask user to input 1 if they are a male or 2 if they are a female.
 *  If input is not numerical, ask for user to input a numerical value.
 *  Ask user to input how many ounces of alcohol they had.
 *  If input is not numerical, ask for user to input a numerical value.
 *  Ask user to input their weight in pounds.
 *  If input is not numerical, ask for user to input a numerical value.
 *  Ask user to input number of hours since their last drink.
 *  If input is not numerical, ask for user to input a numerical value.
 *  Store inputted values in respective variables
 *  Calculate BAC using the formula: BAC = (A × 5.14 / W × r) − .015 × H
 *  Where:
 *      A is total alcohol consumed, in ounces (oz).
 *      W is body weight in pounds.
 *      r is the alcohol distribution ratio:
 *      0.73 for men
 *      0.66 for women
 *      H is number of hours since the last drink.
 *  Compare BAC to legal driving bac level of 0.08
 *  Output user BAC level and if it is legal for them to drive given the bac level was less than 0.08
 *      or not legal if the bac level was greater than 0.08.
 *
 */

package exercise17;

import java.util.Scanner;

public class Solution17 {
    private static final Scanner input = new Scanner(System.in);
    private static final double MENALCOHOLRATIO = 0.73;
    private static final double WOMENALCOHOLRATIO = 0.66;

    private int gender;
    private double alcoholOunces;
    private double weight;
    private double hours;

    private void setGender(String gender) {
        this.gender = Integer.parseInt(gender);
    }

   private void setAlcoholOunces(String alcoholOunces) {
        this.alcoholOunces = Double.parseDouble(alcoholOunces);
    }

    private void setWeight(String  weight) {
        this.weight = Double.parseDouble(weight);
    }

    private void setHours(String hours) {
        this.hours = Double.parseDouble(hours);
    }

    private double calculate(){
        double bac;
        if(this.gender == 1){
            bac = (this.alcoholOunces * 5.14 / this.weight * MENALCOHOLRATIO) - (0.015 * this.hours);
        }else{
            bac = (this.alcoholOunces * 5.14 / this.weight * WOMENALCOHOLRATIO) - (0.015 * this.hours);
        }
        return bac;
    }

    private boolean isNotDigit(String num){
        try {
            Double.parseDouble(num);
            return false;
        }catch (Exception e){
            return true;
        }
    }

    public static void main(String[] args) {
        Solution17 app = new Solution17();
        String numericInput;
        String error = "Please enter a numeric value.";

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        numericInput = input.nextLine();

        while(app.isNotDigit(numericInput)){
            System.out.println(error);
            System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
            numericInput = input.nextLine();
        }

        app.setGender(numericInput);

        System.out.print("How many ounces of alcohol did you have? ");
        numericInput = input.nextLine();

        while(app.isNotDigit(numericInput)){
            System.out.println(error);
            System.out.print("How many ounces of alcohol did you have? ");
            numericInput = input.nextLine();
        }

        app.setAlcoholOunces(numericInput);

        System.out.print("What is your weight, in pounds? ");
        numericInput = input.nextLine();

        while(app.isNotDigit(numericInput)){
            System.out.println(error);
            System.out.print("What is your weight, in pounds? ");
            numericInput = input.nextLine();
        }

        app.setWeight(numericInput);

        System.out.print("How many hours has it been since your last drink? ");
        numericInput = input.nextLine();

        while(app.isNotDigit(numericInput)){
            System.out.println(error);
            System.out.print("How many hours has it been since your last drink? ");
            numericInput = input.nextLine();
        }

        app.setHours(numericInput);

        String output = "\nYour BAC is " + app.calculate() + "\nIt is ";

        output += app.calculate() < 0.8 ? "" : "not ";

        output += "legal for you to drive.";

        System.out.println(output);
    }
}
