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

import java.awt.datatransfer.FlavorEvent;
import java.util.Scanner;

public class Solution08 {
    private static final Scanner input = new Scanner(System.in);
    private int people;
    private int pizzas;
    private int slices;
    private int share;

    public void setPeople(int people) { this.people = people; }

    public void setPizzas(int pizzas) {
        this.pizzas = pizzas;
    }

    public void setSlices(int slices) {
        this.slices = slices;
    }

    public void setShare() {
        this.share = (pizzas * slices) / people;
    }

    public int getPeople() {
        return people;
    }

    public int getPizzas() {
        return pizzas;
    }

    public int getSlices() {
        return slices;
    }

    public int sharePizza(){
        if(share % 2 == 0){
            return share;
        }else{
            return --share;
        }
    }

    public int leftovers(){
        return (int) Math.ceil(((pizzas * (double)slices) / people) % 2);
    }

    public static void main(String[] args) {
        Solution08 app = new Solution08();

        System.out.print("How many people? ");
        app.setPeople(input.nextInt());

        System.out.print("How many pizzas do you have? ");
        app.setPizzas(input.nextInt());

        System.out.print("How many slices per pizza? ");
        app.setSlices(input.nextInt());

        app.setShare();

        String output = app.getPeople() + " people with " + app.getPizzas() + " pizzas (" +
                (app.getPizzas() * app.getSlices()) + " slices)\nEach person gets " + app.sharePizza() +
                " pieces of pizza.\nThere are " + app.leftovers() + " leftover pieces.";

        System.out.println(output);
    }
}
