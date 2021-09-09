/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Psudocode:
 *  Ask user for size of room in feet
 *  Ask user for width of room in feet
 *  Store user input in integer values respectively
 *  Calculate the square feet of room and square meters using conversion factor
 *  Display the room in square feet and square meters.
 */

package exercise07;

import java.util.Scanner;

public class Solution07 {
    private static final double CONVERSIANFACTOR = 0.09290304;
    private static int length;
    private static int width;
    private static int areaFeet;
    private static double areaMeters;

    public static void setLength(int length) {
        Solution07.length = length;
    }

    public static void setWidth(int width) {
        Solution07.width = width;
    }

    public static void setArea() {
        areaFeet = length * width;
        areaMeters = areaFeet * CONVERSIANFACTOR;
    }

    public static double getAreaMeters() {
        return areaMeters;
    }

    public static int getAreaFeet() {
        return areaFeet;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        setLength(input.nextInt());

        System.out.print("What is the width of the room in feet? ");
        setWidth(input.nextInt());

        setArea();

        String output = "The area is\n" + getAreaFeet() + " square feet\n" +
                getAreaMeters() + " square meters";

        System.out.println(output);
    }
}
