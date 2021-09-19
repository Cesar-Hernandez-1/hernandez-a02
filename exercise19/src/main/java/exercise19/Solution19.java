/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Prompt user to enter their height in inches
 *
 *  Check if input entered is a numeric value, if not ask user to enter a
 *      numeric value.
 *
 *  Prompt user to enter their weight in pounds.
 *
 *  Check if input entered is a numeric value, if not ask user to enter a
 *      numeric value.
 *
 *  Calculate BMI by the formula: bmi = (weight / (height × height)) * 703
 *
 *  Output user BMI. If user BMI is under 18.5 tell the user they are underweight and
 *      suggest they see their doctor. If their BMI is above 25, tell user they
 *      are overweight and tell them to see their doctor. If the BMI is between 18.5 and 25
 *      tell user they are within the ideal weight range.
 */

package exercise19;

import java.util.Scanner;

public class Solution19 {
    private static final Scanner input = new Scanner(System.in);
    private double weight;
    private double height;

    private void setWeight(double weight) {
        this.weight = weight;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private double calculateBMI(){
        return (this.weight / (this.height * this.height)) * 703;
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
        Solution19 app = new Solution19();

        String error = "Please enter a numeric value.";
        String  numericInput;

        System.out.print("Enter your height in inches: ");
        numericInput = input.nextLine();

        while(app.isNotDigit(numericInput)){
            System.out.println(error);
            System.out.print("Enter your height in inches: ");
            numericInput = input.nextLine();
        }

        app.setHeight(Double.parseDouble(numericInput));

        System.out.print("Enter your weight in pounds: ");
        numericInput = input.nextLine();

        while(app.isNotDigit(numericInput)){
            System.out.println(error);
            System.out.print("Enter your weight in pounds: ");
            numericInput = input.nextLine();
        }

        app.setWeight(Double.parseDouble(numericInput));

        String output = "Your BMI is " + app.calculateBMI() + "\n";

        if(app.calculateBMI() < 18.5){
            output += "You are underweight. You should see your doctor.";
        }else if (app.calculateBMI() > 25){
            output += "You are overweight. You should see your doctor.";
        }else{
            output += "You are within ideal weight range.";
        }

        System.out.println(output);
    }
}
