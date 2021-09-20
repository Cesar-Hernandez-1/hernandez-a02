/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  Declare final string constant to hold computer password of "abc$123"
 *  Ask user to input password.
 *  Store inputted password in string variable
 *  Compare if inputted password is equal to the computer password
 *  If the passwords are not equal, output "I don't know you."
 *  If the passwords are equal, output "Welcome!"
 */

package exercise15;

import java.util.Objects;
import java.util.Scanner;

public class Solution15 {
    private static final Scanner input = new Scanner(System.in);
    private static final String PASSWORD= "abc$123";

    public boolean isPassword(String password){
        if(Objects.equals(password, PASSWORD)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Solution15 app = new Solution15();
        String output;

        System.out.print("What is the password? ");

        if(app.isPassword(input.nextLine())){
            output = "Welcome!";
        }else{
            output = "I don't know you.";
        }

        System.out.println(output);
    }
}