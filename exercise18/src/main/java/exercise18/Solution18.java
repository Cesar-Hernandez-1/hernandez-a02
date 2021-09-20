/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Ask user to enter an upper or lower case F or C.
 *
 *  If user entered F, prompt for Celsius temperature.
 *
 *  If user entered C, prompt for Fahrenheit temperature.
 *
 *  Prompt user to enter temperature in Fahrenheit or Celsius to convert to
 *      other respective metric.
 *
 *  Calculate respective conversion:
 *      C = (F − 32) × 5 / 9
 *          or
 *      F = (C × 9 / 5) + 32
 *      Where C is the temperature in celsius and F is the temperature in Fahrenheit.
 *    with the given input value and the right equation requested.
 *
 *  Output the temperature conversion in the other temperature metric.
 */

package exercise18;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Solution18 {
    private static final Scanner input = new Scanner(System.in);

    public double calculateTemperature(double temp, String tempChoice){
        if(tempChoice.contains("Fahrenheit")){
            return (temp - 32) * 5 / 9;
        }else{
            return (temp * 9 / 5) + 32;
        }
    }

    public static void main(String[] args) {
        Solution18 app = new Solution18();
        String tempPrompt = "he temperature in ";

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");

        if(Objects.equals(input.nextLine().toUpperCase(Locale.ROOT), "C")){
            tempPrompt += "Fahrenheit";
        }else{
            tempPrompt += "Celsius";
        }

        System.out.print("Please enter t" + tempPrompt + ": ");
        System.out.printf("T%s is %f.", tempPrompt, app.calculateTemperature(input.nextDouble(),tempPrompt));
    }
}
