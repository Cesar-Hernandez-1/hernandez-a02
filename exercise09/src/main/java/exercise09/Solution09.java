/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 * Pseudocode:
 * Declare a constant integer named GALLONAREA that stores the constant 350 square feet one gallon can cover
 * Ask user for length of the room in feet
 * Ask user for width of room in feet
 * Store user inputs in respective variables upon user input
 * Calculate number of whole gallons needed to cover area inputted
 * Output number of whole gallons needed to cover inputted room area.
 *
 */

package exercise09;
import java.util.Scanner;

public class Solution09 {

    private static final int  GALLONAREA = 350;
    private static double length;
    private static double width;
    private static double area;
    private static int gallonNum;

    public static void setLength(double num){length = num;}
    public static void setWidth(double num){width = num;}
    public static void setArea(){ area = length * width; }
    public static void setGallonNum(){ gallonNum = (int) Math.ceil(area / GALLONAREA);}

    public static int getArea(){return (int) area;}
    public static int getGallonNum(){return gallonNum;}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length in feet: ");
        setLength(input.nextDouble());

        System.out.print("Enter the width in feet: ");
        setWidth(input.nextDouble());

        setArea();
        setGallonNum();

        String output = "You will need to purchase " + getGallonNum() + " gallons of paint" +
                " to cover " + getArea() + " square feet.";

        System.out.println(output);


    }
}