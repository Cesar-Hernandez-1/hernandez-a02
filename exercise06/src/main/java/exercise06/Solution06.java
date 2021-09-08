/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Get current year from computer and store it in "year" variable.
 *  Ask for user to impute their current age and store in a variable.
 *  Ask for user to impute the age they would like to retire and store it in a variable.
 *  Convert two input strings into integers respectively.
 *  Compute number of years left until retirement by subtracting the retirement age by the current age.
 *  Compute year of retirement by adding number of years left until retirement to current year.
 *  Display number of years user has left until retirement and display current year with future year of retirement.
 *
 */

package exercise06;

import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {
    private static final int YEAR = Calendar.getInstance().get(Calendar.YEAR);
    private static int userAge;
    private static int retireAge;

    public static int getYEAR() {
        return YEAR;
    }

    public static void setUserAge(String userAGE) {
        Solution06.userAge = Integer.parseInt(userAGE);
    }

    public static void setRetireAge(String retireAge) {
        Solution06.retireAge = Integer.parseInt(retireAge);
    }

    public static String yearsLeft(){
        return String.valueOf(retireAge - userAge);
    }

    public static String retireYear(){
        return String.valueOf(YEAR + (retireAge - userAge));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your current age? ");
        setUserAge(input.nextLine());

        System.out.print("At what age would you like to retire? ");
        setRetireAge(input.nextLine());

        String output = "You have " + yearsLeft() + " years left until you can retire.\n" +
                "It's " + getYEAR() + " so you can retire in " + retireYear() + ".";

        System.out.println(output);

    }
}
