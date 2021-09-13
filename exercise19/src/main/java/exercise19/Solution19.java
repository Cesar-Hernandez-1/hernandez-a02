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
    private static double weight;
    private static double height;

    public static void setWeight(double weight) {
        Solution19.weight = weight;
    }

    public static void setHeight(double height) {
        Solution19.height = height;
    }

    public static double calculateBMI(){
        return (weight / (height * height)) * 703;
    }

    public static boolean isNotDigit(String num){
        try {
            Double.parseDouble(num);
            return false;
        }catch (Exception e){
            return true;
        }
    }

    public static void main(String[] args) {

        String error = "Please enter a numeric value.";
        String  numericInput;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in inches: ");
        numericInput = input.nextLine();

        while(isNotDigit(numericInput)){
            System.out.println(error);
            System.out.print("Enter your height in inches: ");
            numericInput = input.nextLine();
        }

        setHeight(Double.parseDouble(numericInput));

        System.out.print("Enter your weight in pounds: ");
        numericInput = input.nextLine();

        while(isNotDigit(numericInput)){
            System.out.println(error);
            System.out.print("Enter your weight in pounds: ");
            numericInput = input.nextLine();
        }

        setWeight(Double.parseDouble(numericInput));

        String output = "Your BMI is " + calculateBMI() + "\n";

        if(calculateBMI() < 18.5){
            output += "You are underweight. You should see your doctor.";
        }else if (calculateBMI() > 25){
            output += "You are overweight. You should see your doctor.";
        }else{
            output += "You are within ideal weight range.";
        }

        System.out.println(output);
    }
}
