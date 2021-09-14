/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Prompt user to enter a month number
 *
 *  Store user input number into an integer variable
 *
 *  Use a switch statement to examine user input month number
 *      Add month name to month prompt corresponding to the entered month number.
 *
 *  If the number entered is not within the range of 1 - 12, then set output to an error message
 *      stating the numbered entered is not in the range.
 *
 *  Output the name of the month that corresponds to entered month number.
 */

package exercise21;

import java.util.Scanner;

public class Solution21 {
    private static int monthNumber;

    public static void setMonthNumber(int monthNumber) {
        Solution21.monthNumber = monthNumber;
    }

    public static String getMonthName(){
        String monthNamePrompt = "The name of the month is ";
        String monthName;
        switch (monthNumber){
            case 1: monthName = "January";
                    break;
            case 2: monthName = "February";
                    break;
            case 3: monthName = "March";
                    break;
            case 4:monthName = "April";
                    break;
            case 5: monthName = "May";
                    break;
            case 6: monthName = "June";
                    break;
            case 7: monthName = "July";
                    break;
            case 8: monthName = "August";
                    break;
            case 9: monthName = "September";
                    break;
            case 10: monthName = "October";
                    break;
            case 11: monthName = "November";
                    break;
            case 12: monthName = "December";
                    break;
            default: return "Error. Value entered is outside the range.";
        }
        return monthNamePrompt + monthName;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        setMonthNumber(input.nextInt());

        String output = getMonthName();

        System.out.println(output);

    }
}
