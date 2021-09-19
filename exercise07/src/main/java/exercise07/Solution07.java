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
    private static final Scanner input = new Scanner(System.in);
    private double length;
    private double width;
    private double areaFeet;
    private double areaMeters;

    private void setLength(double length) {
        this.length = length;
    }

    private double getLength() { return this.length; }

    private double getWidth()  { return this.width; }

    private void setWidth(double width) {
        this.width = width;
    }

    private void setArea() {
        this.areaFeet = this.length * this.width;
        this.areaMeters = this.areaFeet * CONVERSIANFACTOR;
    }

    private double getAreaMeters() {
        return areaMeters;
    }

    private double getAreaFeet() {
        return areaFeet;
    }

    public static void main(String[] args) {
        Solution07 app = new Solution07();

        System.out.print("What is the length of the room in feet? ");
        app.setLength(input.nextInt());

        System.out.print("What is the width of the room in feet? ");
        app.setWidth(input.nextInt());

        app.setArea();

        String output = "You entered dimensions of " + app.getLength() + " feet by " + app.getWidth() + " feet.\n"
                + "The area is\n" + app.getAreaFeet() + " square feet\n" +
                String.format("%.3f",app.getAreaMeters()) + " square meters";

        System.out.println(output);
    }
}
