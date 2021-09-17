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
    private static final Scanner input = new Scanner(System.in);
    private int userAge;
    private int retireAge;

    public static int getYEAR() {
        return YEAR;
    }

    private void setUserAge(String userAGE) {
        this.userAge = Integer.parseInt(userAGE);
    }

    private void setRetireAge(String retireAge) {
        this.retireAge = Integer.parseInt(retireAge);
    }

    private String yearsLeft(){
        return String.valueOf(retireAge - userAge);
    }

    private String retireYear(){
        return String.valueOf(YEAR + (retireAge - userAge));
    }

    public static void main(String[] args) {

        Solution06 app = new Solution06();

        System.out.print("What is your current age? ");
        app.setUserAge(input.nextLine());

        System.out.print("At what age would you like to retire? ");
        app.setRetireAge(input.nextLine());

        String output = "You have " + app.yearsLeft() + " years left until you can retire.\n" +
                "It's " + app.getYEAR() + " so you can retire in " + app.retireYear() + ".";

        System.out.println(output);

    }
}
