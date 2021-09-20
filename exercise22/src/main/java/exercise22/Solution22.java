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
 *  Compare all the numbers with the initial highest value (first entered number), if current number is higher
 *      than initial highest number, then make the highest number the current number. Repeat this process
 *      until there are no more numbers to be evaluated.
 *
 *  Output the highest number entered to the user or exit the program is any entered numbers match.
 */

package exercise22;

import java.util.Scanner;

public class Solution22 {
    private static final Scanner input = new Scanner(System.in);

    private double number1;
    private double number2;
    private double number3;

    public void setNumber1(double number1) { this.number1 = number1; }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void setNumber3(double number3) {
        this.number3 = number3;
    }

    public double getHighest(){
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

        Solution22 app = new Solution22();

        System.out.print("Enter the first number: ");
        app.setNumber1(input.nextDouble());

        System.out.print("Enter the second number: ");
        app.setNumber2(input.nextDouble());

        System.out.print("Enter the third number: ");
        app.setNumber3(input.nextDouble());

        String output = "The largest number is " + app.getHighest();

        System.out.println(output);
    }
}
