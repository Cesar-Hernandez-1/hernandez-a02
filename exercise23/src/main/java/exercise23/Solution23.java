/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Ask user a question regarding the noise level when turning the key.
 *
 *  Branch to other relevant questions bases on the previous answered question
 *      until problem is resolved.
 */

package exercise23;

import java.util.Objects;
import java.util.Scanner;

public class Solution23 {
    protected static Scanner input = new Scanner(System.in);
    protected static String userAnswer;

    public void carSilent(){
        System.out.print("Are the battery terminals corroded? ");
        userAnswer = input.nextLine();

        if(Objects.equals(userAnswer, "y")){
            System.out.println("Clean terminals and try starting again.");
        }else if(Objects.equals(userAnswer, "n")){
            System.out.println("Replace cables and try again.");
        }
        System.exit(0);
    }

    public void carNotSilent(){
        System.out.print("Does the car make a slicking noise? ");
        userAnswer = input.nextLine();

        if(Objects.equals(userAnswer, "y")){
            System.out.println("Replace the battery.");
        }else if(Objects.equals(userAnswer, "n")){
            noSlickingNoise();
        }
        System.exit(0);
    }

    private void noSlickingNoise(){
        System.out.print("Does the car crank up but fail to start? ");
        userAnswer = input.nextLine();

        if(Objects.equals(userAnswer, "y")){
            System.out.println("Check spark plug connections.");
        }else if(Objects.equals(userAnswer, "n")){
            notFailToStart();
        }
        System.exit(0);
    }

    private void notFailToStart(){
        System.out.print("Does the engine start and then die? ");
        userAnswer = input.nextLine();

        if(Objects.equals(userAnswer, "y")){
            startAndDie();
        }else if(Objects.equals(userAnswer, "n")){
            System.out.println("This should not be possible.");
        }
        System.exit(0);
    }

    private void startAndDie(){
        System.out.print("Does your car have fuel injection? ");
        userAnswer = input.nextLine();

        if(Objects.equals(userAnswer, "y")){
            System.out.println("Get it in for service.");
        }else if(Objects.equals(userAnswer, "n")){
            System.out.println("Check to ensure the choke is opening and closing.");
        }
        System.exit(0);
    }


    public static void main(String[] args) {
        Solution23 app = new Solution23();
        System.out.print("Is the car silent when you turn the key? ");
        userAnswer = input.nextLine();

        if(Objects.equals(userAnswer, "y")){
            app.carSilent();
        }else if(Objects.equals(userAnswer, "n")){
            app.carNotSilent();
        }
    }
}
