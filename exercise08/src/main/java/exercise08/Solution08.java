/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Ask user for number of people
 *  Ask user for number of pizzas hey have
 *  Ask user for number of slices per pizza
 *  Store inputted values in respective int variables
 *  Calculate number of total slices and how many even slices each person gets
 *  Calculate leftover pizzas
 *  Output number of people, number of pizzas, slices of pizza in total,
 *      even number of pizza slices everyone gets, and number of leftover pizza slices.
 */

package exercise08;

import java.util.Scanner;

public class Solution08 {
    private static int people;
    private static int pizzas;
    private static int slices;
    private static int share;

    public static void setPeople(int people) {
        Solution08.people = people;
    }

    public static void setPizzas(int pizzas) {
        Solution08.pizzas = pizzas;
    }

    public static void setSlices(int slices) {
        Solution08.slices = slices;
    }

    public static void setShare() {
        Solution08.share = (pizzas * slices) / people;
    }

    public static int getPeople() {
        return people;
    }

    public static int getPizzas() {
        return pizzas;
    }

    public static int getSlices() {
        return slices;
    }

    public static int sharePizza(){
        if(share % 2 == 0){
            return share;
        }else{
            return --share;
        }
    }

    public static int leftovers(){
        return share % 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        setPeople(input.nextInt());

        System.out.print("How many pizzas do you have? ");
        setPizzas(input.nextInt());

        System.out.print("How many slices per pizza? ");
        setSlices(input.nextInt());

        setShare();

        String output = getPeople() + " people with " + getPizzas() + " pizzas (" +
                (getPizzas()*getSlices()) + " slices)\nEach person gets " + sharePizza() +
                " pieces of pizza.\nThere are " + leftovers() + " leftover pieces.";

        System.out.println(output);
    }
}
