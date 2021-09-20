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
    private static final String ERROR = "Please enter a numeric value.";

    private int gender;
    private double alcoholOunces;
    private double weight;
    private double hours;

    public void setGender(String gender) {
        while(isNotDigit(gender)){
            System.out.println(ERROR);
            System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
            gender = input.nextLine();
        }
        this.gender = Integer.parseInt(gender);
    }

   public void setAlcoholOunces(String alcoholOunces) {
       while(isNotDigit(alcoholOunces)){
           System.out.println(ERROR);
           System.out.print("How many ounces of alcohol did you have? ");
           alcoholOunces = input.nextLine();
       }
        this.alcoholOunces = Double.parseDouble(alcoholOunces);
    }

    public void setWeight(String weight) {
        while(isNotDigit(weight)){
            System.out.println(ERROR);
            System.out.print("What is your weight, in pounds? ");
            weight = input.nextLine();
        }
        this.weight = Double.parseDouble(weight);
    }

    public void setHours(String hours) {
        while(isNotDigit(hours)){
            System.out.println(ERROR);
            System.out.print("How many hours has it been since your last drink? ");
            hours = input.nextLine();
        }
        this.hours = Double.parseDouble(hours);
    }

    public double calculateBac(){
        double bac;
        if(this.gender == 1){
            bac = (this.alcoholOunces * 5.14 / this.weight * MENALCOHOLRATIO) - (0.015 * this.hours);
        }else{
            bac = (this.alcoholOunces * 5.14 / this.weight * WOMENALCOHOLRATIO) - (0.015 * this.hours);
        }
        return bac;
    }

    private boolean isNotDigit(String num){
        char[] number = num.toCharArray();
        boolean isNotDigit = false;

        for(int i = 0; i < number.length; i++){
            if(Character.isAlphabetic(number[i])){
                isNotDigit = true;
                break;
            }
        }
        return isNotDigit;
    }

    public static void main(String[] args) {
        Solution17 app = new Solution17();

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");

        app.setGender(input.nextLine());

        System.out.print("How many ounces of alcohol did you have? ");

        app.setAlcoholOunces(input.nextLine());

        System.out.print("What is your weight, in pounds? ");

        app.setWeight(input.nextLine());

        System.out.print("How many hours has it been since your last drink? ");

        app.setHours(input.nextLine());

        String output = "\nYour BAC is " + app.calculateBac() + "\nIt is ";

        output += app.calculateBac() < 0.8 ? "" : "not ";

        output += "legal for you to drive.";

        System.out.println(output);
    }
}
