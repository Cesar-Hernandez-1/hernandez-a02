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
    private static final Scanner input = new Scanner(System.in);
    private static final int  GALLONAREA = 350;
    private double length;
    private double width;
    private double area;
    private int gallonNum;

    private void setLength(double length){this.length = length;}
    private void setWidth(double width){this.width = width;}
    private void setArea(){ this.area = length * width; }
    private void setGallonNum(){ this.gallonNum = (int) Math.ceil(area / GALLONAREA);}

    private int getArea(){return (int) this.area;}
    private int getGallonNum(){return this.gallonNum;}

    public static void main(String[] args) {
        Solution09 app = new Solution09();

        System.out.print("Enter the length in feet: ");
        app.setLength(input.nextDouble());

        System.out.print("Enter the width in feet: ");
        app.setWidth(input.nextDouble());

        app.setArea();
        app.setGallonNum();

        String output = "You will need to purchase " + app.getGallonNum() + " gallons of paint" +
                " to cover " + app.getArea() + " square feet.";

        System.out.println(output);


    }
}