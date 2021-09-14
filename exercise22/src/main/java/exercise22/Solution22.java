/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Prompt user to enter three numbers
 *
 *  Initialize variables with numbers entered
 *
 *  Compare all entered values with one another. If any of them match, exit the program.
 *
 *  Conpare all the numbers with the initial highest value (first entered number), if current number is higher
 *      than inicial highest number, then make the highest number the current number. Repeat this process
 *      until there are no more numbers to be evaluated.
 *
 *  Output the highest number entered to the user or exit the program is any entered numbers match.
 */
package exercise22;

import java.util.Scanner;

public class Solution22 {
    private static double number1;
    private static double number2;
    private static double number3;

    public static void setNumber1(double number1) {
        Solution22.number1 = number1;
    }

    public static void setNumber2(double number2) {
        Solution22.number2 = number2;
    }

    public static void setNumber3(double number3) {
        Solution22.number3 = number3;
    }

    public static double getHighest(){
        if (number1 == number2 || number1 == number3 || number2 == number3){
            System.exit(0);
        }

        double[] numbers = {number1, number2, number3};
        double highest = numbers[0];
        for (int i = 1; i < 3; i++){
            if(numbers[i] > highest){
                highest = numbers[i];
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        setNumber1(input.nextDouble());

        System.out.print("Enter the second number: ");
        setNumber2(input.nextDouble());

        System.out.print("Enter the third number: ");
        setNumber3(input.nextDouble());

        String output = "The largest number is " + getHighest();

        System.out.println(output);
    }
}
