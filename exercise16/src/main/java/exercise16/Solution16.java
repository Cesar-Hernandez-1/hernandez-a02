/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Ask user to input their age.
 *  Use a ternary operator to determine the output string.
 *  If the user age is less than 16, then the output is "You are not old enough to legally drive."
 *  If the user age is equal to or greater than 16, the output is "You are old enough to legally drive."
 *
 */

package exercise16;

import java.util.Scanner;

public class Solution16 {

    private static int userAge;

    public static void setUserAge(int userAge) {
        Solution16.userAge = userAge;
    }

    public static int getUserAge() {
        return userAge;
    }

    public static void main(String[] args) {
        String output;
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        setUserAge(input.nextInt());

        output = (getUserAge() < 16) ? "You are not old enough to legally drive." : ("You are old enough to" +
                " legally drive.");

        System.out.println(output);
    }
}